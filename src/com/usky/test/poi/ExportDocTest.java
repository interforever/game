
package com.usky.test.poi;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.hwpf.HWPFDocument;
import org.apache.poi.hwpf.model.PAPBinTable;
import org.apache.poi.hwpf.usermodel.Range;
import org.apache.poi.poifs.filesystem.DirectoryEntry;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;

public class ExportDocTest {
	
	public static void main(String[] args) {
		String destFile = "D:\\11.doc";
		//#####################根据自定义内容导出Word文档#################################################
		//		StringBuffer fileCon = new StringBuffer();
		//		fileCon.append("               张大炮            男              317258963215223\n" + "2011     09        2013     07       3\n" + "    二炮研究              成人\n" + "2013000001                             2013     07     08");
		//		fileCon.append("\n\r\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
		//		
		//		new ExportDocTest().exportDoc(destFile, fileCon.toString());
		
		//##################根据Word模板导出单个Word文档###################################################
		Map<String, String> map = new HashMap<String, String>();
		map.put("标题", "XXXX");
		map.put("提交日期", "2015-04-14");
		map.put("提交人", "张三");
		map.put("风险类型", "新开航线");
		//		map.put("风险类型", "专项");
		map.put("详细描述", "以目前南京至悉尼为例，南京经浦东飞悉尼的航班不含税价为3430元起。而东航悉尼自由行机票加3晚的4星级酒店，经“打包”后仅需4420元起。其间，旅客在悉尼的旅游，能享受东航的“特惠价”。如悉尼一日游，市场价是39个澳币，“特惠价”只要25个澳币。上海浦东至澳洲只要花比普通机票价格多个1000元左右的费用");
		HWPFDocument document = new ExportDocTest().replaceDoc("D:\\风险通告.doc", map);
		List<String> list = Arrays.asList(new String[] { "航线信息" });
		ExportDocTest.replaceDoc(document, list);
		PAPBinTable table = document.getParagraphTable();
		ByteArrayOutputStream ostream = new ByteArrayOutputStream();
		try {
			document.write(ostream);
			//输出word文件
			OutputStream outs = new FileOutputStream(destFile);
			outs.write(ostream.toByteArray());
			outs.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	/**
	 * @param destFile
	 * @param fileCon
	 */
	public void exportDoc(String destFile, String fileCon) {
		try {
			//doc content
			ByteArrayInputStream bais = new ByteArrayInputStream(fileCon.getBytes());
			POIFSFileSystem fs = new POIFSFileSystem();
			DirectoryEntry directory = fs.getRoot();
			directory.createDocument("WordDocument", bais);
			FileOutputStream ostream = new FileOutputStream(destFile);
			fs.writeFilesystem(ostream);
			bais.close();
			ostream.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * 读取word模板并替换变量
	 * 
	 * @param srcPath
	 * @param map
	 * @return
	 */
	public HWPFDocument replaceDoc(String srcPath, Map<String, String> map) {
		try {
			// 读取word模板
			FileInputStream fis = new FileInputStream(new File(srcPath));
			HWPFDocument doc = new HWPFDocument(fis);
			// 读取word文本内容
			Range bodyRange = doc.getRange();
			// 替换文本内容
			for (Map.Entry<String, String> entry : map.entrySet()) {
				bodyRange.replaceText("${" + entry.getKey() + "}", entry.getValue());
			}
			return doc;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public static void replaceDoc(HWPFDocument doc, List<String> list) {
		for (String tag : list) {
			Range range = doc.getRange();
			String text = range.text();
			int from = text.indexOf("$.from{" + tag + "}");
			int to = text.indexOf("$.to{" + tag + "}");
			if (from < 0 || to < 0) continue;
			String toRemove = text.substring(from, to + tag.length() + 7);
			range.replaceText(toRemove, "");
		}
	}
	
}
