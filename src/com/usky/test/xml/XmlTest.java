
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
			systemNode.setText("ϵͳ��");
			Element table1 = (Element) section1.selectSingleNode(".//w:tbl");
			Element threatTr1 = threatTr.createCopy();
			table1.add(threatTr1);
			@SuppressWarnings("unchecked")
			List<Element> textNodes = threatTr1.selectNodes(".//w:p//w:r//w:t");//.setText("Σ��Դ1");
			System.out.println("textNodes.size():" + textNodes.size());
			//			Element threatTr2 =threatTr.createCopy();
			//			threatTr2.selectSingleNode(".//w:r[@wsp:rsidRPr='007C4200']/w:t").setText("Σ��Դ2");
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
		map.put("����", "XXXX");
		map.put("�ύ����", "2015-04-14");
		map.put("�ύ��", "����");
		map.put("��������", "�¿�����");
		//		map.put("��������", "ר��");
		map.put("��ϸ����", "��Ŀǰ�Ͼ���Ϥ��Ϊ�����Ͼ����ֶ���Ϥ��ĺ��಻��˰��Ϊ3430Ԫ�𡣶�����Ϥ�������л�Ʊ��3���4�Ǽ��Ƶ꣬��������������4420Ԫ����䣬�ÿ���Ϥ������Σ������ܶ����ġ��ػݼۡ�����Ϥ��һ���Σ��г�����39���ıң����ػݼۡ�ֻҪ25���ıҡ��Ϻ��ֶ�������ֻҪ������ͨ��Ʊ�۸���1000Ԫ���ҵķ���");
		map.put("��������", "PVG");
		map.put("�������", "SHA");
		map.put("��ͣ����", "BEK��LAS");
		map.put("ִ�е�λ", "����ί");
		map.put("����", "777��A3");
		Map<String, Object> subMap = new HashMap<String, Object>();
		List<Map<String, Object>> threatMaps = new ArrayList<Map<String, Object>>();
		subMap.put("��в", threatMaps);
		List<Map<String, Object>> errorMaps = new ArrayList<Map<String, Object>>();
		subMap.put("���", errorMaps);
		map.put("subMaps", subMap);
		XmlTest.generateReport("D:\\����ͨ��.xml", "D:\\11.doc", map);
	}
	
}
