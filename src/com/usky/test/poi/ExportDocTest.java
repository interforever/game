
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
		//#####################�����Զ������ݵ���Word�ĵ�#################################################
		//		StringBuffer fileCon = new StringBuffer();
		//		fileCon.append("               �Ŵ���            ��              317258963215223\n" + "2011     09        2013     07       3\n" + "    �����о�              ����\n" + "2013000001                             2013     07     08");
		//		fileCon.append("\n\r\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
		//		
		//		new ExportDocTest().exportDoc(destFile, fileCon.toString());
		
		//##################����Wordģ�嵼������Word�ĵ�###################################################
		Map<String, String> map = new HashMap<String, String>();
		map.put("����", "XXXX");
		map.put("�ύ����", "2015-04-14");
		map.put("�ύ��", "����");
		map.put("��������", "�¿�����");
		//		map.put("��������", "ר��");
		map.put("��ϸ����", "��Ŀǰ�Ͼ���Ϥ��Ϊ�����Ͼ����ֶ���Ϥ��ĺ��಻��˰��Ϊ3430Ԫ�𡣶�����Ϥ�������л�Ʊ��3���4�Ǽ��Ƶ꣬��������������4420Ԫ����䣬�ÿ���Ϥ������Σ������ܶ����ġ��ػݼۡ�����Ϥ��һ���Σ��г�����39���ıң����ػݼۡ�ֻҪ25���ıҡ��Ϻ��ֶ�������ֻҪ������ͨ��Ʊ�۸���1000Ԫ���ҵķ���");
		HWPFDocument document = new ExportDocTest().replaceDoc("D:\\����ͨ��.doc", map);
		List<String> list = Arrays.asList(new String[] { "������Ϣ" });
		ExportDocTest.replaceDoc(document, list);
		PAPBinTable table = document.getParagraphTable();
		ByteArrayOutputStream ostream = new ByteArrayOutputStream();
		try {
			document.write(ostream);
			//���word�ļ�
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
	 * ��ȡwordģ�岢�滻����
	 * 
	 * @param srcPath
	 * @param map
	 * @return
	 */
	public HWPFDocument replaceDoc(String srcPath, Map<String, String> map) {
		try {
			// ��ȡwordģ��
			FileInputStream fis = new FileInputStream(new File(srcPath));
			HWPFDocument doc = new HWPFDocument(fis);
			// ��ȡword�ı�����
			Range bodyRange = doc.getRange();
			// �滻�ı�����
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
