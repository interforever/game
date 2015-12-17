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
	    	parameters[0]="9999";//�¼����
	    	parameters[1] = "2";//�¼�����
	    	parameters[2] = "��Ʒ����";//��Ʒ����
	    	parameters[3] = "�ͼ쵥λ";
	    	parameters[4] = "1984-11-27";
	    	parameters[5] = "���˵绰";
	    	parameters[6] = "��";
	    	parameters[7] = "��������";
	    	parameters[8] = "����סַ";
	    	parameters[9] = "����ְҵ";
	    	parameters[10] = "��Ʒ���";
	    	parameters[11] = "��Ʒ����";
	    	parameters[12] = "��Ʒ���";
	    	parameters[13] = "��Ʒ��Դ";
	    	parameters[14] = "�ͼ쵥λ�绰";
	    	parameters[15] = "�ͼ쵥λ��ַ";
	    	parameters[16] = "2007-01-01";
	    	parameters[17] = "�ʱ�";
	    	parameters[18] = "������";
	    	parameters[19] = "2008-01-01";
	    	parameters[20] = "Ҫ�����ʱ��";
			parameters[21] = "��ע";
			parameters[22] = "CheckReport";
			parameters[23] = "�ٴ��ж�֢״";
			parameters[24] = "�ٴ�������";
			parameters[25] = "�¹ʵ�λ����";
			parameters[26] = "�¹ʵ�λ��ַ";

	    	
			Object[] arrOrder1 = new Object[8];
			arrOrder1[0] = "��Ʒ����1";
			arrOrder1[1] = "2007-01-01";
			arrOrder1[2] = "14:00";
			arrOrder1[3] = "�����ص�1";
			arrOrder1[4] = "����1";
			arrOrder1[5] = "������ʽ1";
			arrOrder1[6] = "������1";
			arrOrder1[7] = "�������1";

			Object[] arrOrder2 = new Object[8];
			arrOrder2[0] = "��Ʒ����2";
			arrOrder2[1] = "2007-01-01";
			arrOrder2[2] = "14:00";
			arrOrder2[3] = "�����ص�2";
			arrOrder2[4] = "����2";
			arrOrder2[5] = "������ʽ2";
			arrOrder2[6] = "������2";
			arrOrder2[7] = "�������2";

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
//	    	parameters[0]="9999";//�¼����
//	    	String userName="JIMMY";
//	    	String password="lims";
//	    	genericServicesSoap_PortType.runActionDirect(actionID, parameters, userName, password); //���ص�xml�ĵ�������ô���أ�������ô����������
//	    	

	    }

	    public static TestSuite test() {
	    	TestSuite testSuite = new TestSuite();
	    	testSuite.addTest(new TestLims("testClient"));
	        return testSuite;
	    }

}
