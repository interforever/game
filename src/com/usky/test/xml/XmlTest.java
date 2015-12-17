
package com.usky.test.xml;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

public class XmlTest {
	
	public static void generateReport(String srcFileName, String destFileName, Map<String, Object> map) {
		try {
			Document doc = new SAXReader().read(new File(srcFileName));
			//			System.out.println(doc.asXML());
			
			@SuppressWarnings("unchecked")
			List<Element> airlineNodes = doc.selectNodes("//w:p[@wsp:rsidRDefault='00F539EA']");
			System.out.println("airlineNodes.size():" + airlineNodes.size());
			
			@SuppressWarnings("unchecked")
			List<Element> riskAnalysisNodes = doc.selectNodes("//w:p[@wsp:rsidR='0016783C']");
			System.out.println("riskAnalysisNodes.size():" + riskAnalysisNodes.size());
			//			System.out.println(riskAnalysisNodes.get(0).getParent().asXML());
			
			@SuppressWarnings("unchecked")
			List<Element> sectionNodes = doc.selectNodes("//w:p[@wsp:rsidR='0016783C']/..//wx:sub-section");
			System.out.println("sectionNodes.size():" + sectionNodes.size());
			
			@SuppressWarnings("unchecked")
			List<Element> trNodes = sectionNodes.get(0).selectNodes(".//w:tr");//w:tr[@wsp:rsidR='00D04669']
			for (Element node : trNodes) {
				@SuppressWarnings("unchecked")
				List<Element> subNodes = node.selectNodes(".//w:r[@wsp:rsidRPr='007C4200']");//w:r wsp:rsidRPr="007C4200"
				System.out.println(subNodes.size());
			}
			
			Element riskAnalysisSection = (Element) doc.selectSingleNode("//w:p[@wsp:rsidR='0016783C']/..//wx:sub-section");
			Element riskAnalysesSection = riskAnalysisSection.getParent();
			@SuppressWarnings("unchecked")
			List<Element> nodes = riskAnalysisSection.selectNodes(".//w:tr");
			Element table = nodes.get(0).getParent();
			Element threatTr = nodes.get(1);
			Element clauseTr = nodes.get(2);
			Element sourceTr = nodes.get(3);
			Element errorTr = nodes.get(4);
			riskAnalysesSection.remove(riskAnalysisSection);
			table.remove(threatTr);
			table.remove(clauseTr);
			table.remove(sourceTr);
			table.remove(errorTr);
			
			Element section1 = riskAnalysisSection.createCopy();
			riskAnalysesSection.add(section1);
			Element systemNode = (Element) section1.selectSingleNode("./w:p/w:r/w:t");
			systemNode.setText("系统名");
			Element table1 = (Element) section1.selectSingleNode(".//w:tbl");
			Element threatTr1 = threatTr.createCopy();
			table1.add(threatTr1);
			@SuppressWarnings("unchecked")
			List<Element> textNodes = threatTr1.selectNodes(".//w:p//w:r//w:t");//.setText("危险源1");
			System.out.println("textNodes.size():" + textNodes.size());
			//			Element threatTr2 =threatTr.createCopy();
			//			threatTr2.selectSingleNode(".//w:r[@wsp:rsidRPr='007C4200']/w:t").setText("危险源2");
			//			table.add(threatTr2);
			
			//			System.out.println(riskAnalysisSection.asXML());
			
			FileOutputStream out = new FileOutputStream(new File(destFileName));
			out.write(doc.asXML().getBytes("utf-8"));
		} catch (DocumentException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("标题", "XXXX");
		map.put("提交日期", "2015-04-14");
		map.put("提交人", "张三");
		map.put("风险类型", "新开航线");
		//		map.put("风险类型", "专项");
		map.put("详细描述", "以目前南京至悉尼为例，南京经浦东飞悉尼的航班不含税价为3430元起。而东航悉尼自由行机票加3晚的4星级酒店，经“打包”后仅需4420元起。其间，旅客在悉尼的旅游，能享受东航的“特惠价”。如悉尼一日游，市场价是39个澳币，“特惠价”只要25个澳币。上海浦东至澳洲只要花比普通机票价格多个1000元左右的费用");
		map.put("出发机场", "PVG");
		map.put("到达机场", "SHA");
		map.put("经停机场", "BEK、LAS");
		map.put("执行单位", "发改委");
		map.put("机型", "777、A3");
		Map<String, Object> subMap = new HashMap<String, Object>();
		List<Map<String, Object>> threatMaps = new ArrayList<Map<String, Object>>();
		subMap.put("威胁", threatMaps);
		List<Map<String, Object>> errorMaps = new ArrayList<Map<String, Object>>();
		subMap.put("差错", errorMaps);
		map.put("subMaps", subMap);
		XmlTest.generateReport("D:\\风险通告.xml", "D:\\11.doc", map);
	}
	
}
