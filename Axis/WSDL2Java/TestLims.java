package com.wondersgroup.shcdc.alarm.service.test;

import com.wondersgroup.shcdc.emergency.webservice.GenericServices;
import com.wondersgroup.shcdc.emergency.webservice.GenericServicesLocator;
import com.wondersgroup.shcdc.emergency.webservice.GenericServicesSoap_PortType;

import junit.framework.TestCase;
import junit.framework.TestSuite;

public class TestLims extends TestCase {
	
		public TestLims(String string) {
	        super(string);
	    }

	    public void testClient() throws Exception {

	    	GenericServices cenericServices = new GenericServicesLocator();
	    	GenericServicesSoap_PortType genericServicesSoap_PortType=cenericServices.getGenericServicesSoap();
	    	String actionID="ClinicalLogin.HISLISLoginFolder";
	    	Object[] parameters= new Object[28];
	    	parameters[0]="9999";//事件编号
	    	parameters[1] = "2";//事件类型
	    	parameters[2] = "样品名称";//样品名称
	    	parameters[3] = "送检单位";
	    	parameters[4] = "1984-11-27";
	    	parameters[5] = "病人电话";
	    	parameters[6] = "男";
	    	parameters[7] = "病人姓名";
	    	parameters[8] = "病人住址";
	    	parameters[9] = "病人职业";
	    	parameters[10] = "样品编号";
	    	parameters[11] = "样品数量";
	    	parameters[12] = "样品标记";
	    	parameters[13] = "样品来源";
	    	parameters[14] = "送检单位电话";
	    	parameters[15] = "送检单位地址";
	    	parameters[16] = "2007-01-01";
	    	parameters[17] = "邮编";
	    	parameters[18] = "送样人";
	    	parameters[19] = "2008-01-01";
	    	parameters[20] = "要求完成时间";
			parameters[21] = "备注";
			parameters[22] = "CheckReport";
			parameters[23] = "临床中毒症状";
			parameters[24] = "临床诊断意见";
			parameters[25] = "事故单位名称";
			parameters[26] = "事故单位地址";

	    	
			Object[] arrOrder1 = new Object[8];
			arrOrder1[0] = "样品名称1";
			arrOrder1[1] = "2007-01-01";
			arrOrder1[2] = "14:00";
			arrOrder1[3] = "采样地点1";
			arrOrder1[4] = "数量1";
			arrOrder1[5] = "采样方式1";
			arrOrder1[6] = "采样人1";
			arrOrder1[7] = "检测线索1";

			Object[] arrOrder2 = new Object[8];
			arrOrder2[0] = "样品名称2";
			arrOrder2[1] = "2007-01-01";
			arrOrder2[2] = "14:00";
			arrOrder2[3] = "采样地点2";
			arrOrder2[4] = "数量2";
			arrOrder2[5] = "采样方式2";
			arrOrder2[6] = "采样人2";
			arrOrder2[7] = "检测线索2";

			Object[] arrOrders = new Object[2];
			arrOrders[0] = arrOrder1;
			arrOrders[1] = arrOrder2;

			parameters[27] = arrOrders;


	    	String userName="INTERFACE";
	    	String password="limsinterface123";
	    	//genericServicesSoap_PortType.runActionDirect(actionID, parameters, userName, password);
	    	boolean flag = (Boolean)genericServicesSoap_PortType.runActionDirect(actionID, parameters, userName, password);
	    	System.out.println("flagIn is " + flag);
//	    	
//	    	String actionID="ClinicalLogin.ListReportInfo";         
//	    	Object[] parameters= new Object[1] ;
//	    	parameters[0]="9999";//事件编号
//	    	String userName="JIMMY";
//	    	String password="lims";
//	    	genericServicesSoap_PortType.runActionDirect(actionID, parameters, userName, password); //返回的xml文档？？怎么返回？？？怎么解析？？？
//	    	

	    }

	    public static TestSuite test() {
	    	TestSuite testSuite = new TestSuite();
	    	testSuite.addTest(new TestLims("testClient"));
	        return testSuite;
	    }

}
