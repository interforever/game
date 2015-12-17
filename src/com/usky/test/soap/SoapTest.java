
package com.usky.test.soap;

import java.io.StringReader;
import java.rmi.RemoteException;
import java.util.HashMap;
import java.util.Map;

import javax.xml.rpc.ServiceException;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Node;
import org.dom4j.io.SAXReader;
import org.tempuri.AccountPlatServiceLocator;
import org.tempuri.AccountPlatServiceSoap;
import org.tempuri.ESBLocator;
import org.tempuri.ESBSoap;

public class SoapTest {
	
	private static void soap() {
		try {
			String sample = "<?xml version=\"1.0\"?><Request><Header UserID=\"AccProvider.WSUser\" RequestType=\"Account.Vendor.AccountPlat.BillHeadApply\" ReCallType=\"SettlementStatusWSV2.UpdateStatus\" AsyncRequest=\"false\" /><BillHeadApplyRequest><BillType>AST</BillType><PayAmount>100000</PayAmount><PayRefund>0</PayRefund><PayAdjust>0</PayAdjust><AdjustDesc>String</AdjustDesc><Payable>10000</Payable><PayDesc>OA测试数据</PayDesc><CheckTitle>上海财付通帐户</CheckTitle><CheckName>String</CheckName><PayCity>1</PayCity><PaySite>10</PaySite><PaymentType>33</PaymentType><Voucher>String</Voucher><SpeedType>String</SpeedType><SwiftCode>String</SwiftCode><BankAddress>String</BankAddress><ProviderID>0</ProviderID><ProviderType>F</ProviderType><ProviderName>Tbooking平台审核票台</ProviderName><ProviderCountry>String</ProviderCountry><PayType>2</PayType><AuditStatus>T</AuditStatus><AuditEid>String</AuditEid><InputEid>weiyiwu</InputEid><Currency>RMB</Currency><Bank>工行漕河径支行</Bank><AccountNo>1001266309200016953</AccountNo><AccountID>0</AccountID><Remark>String</Remark><City>String</City><PrePay>0</PrePay><NowPay>500</NowPay><IsImprest>String</IsImprest><IsRefuse>String</IsRefuse><AdvicePayDate>1900-01-01T00:00:00</AdvicePayDate><BankCode>String</BankCode><IsICBC>String</IsICBC><IsShanghai>String</IsShanghai><IsCompany>String</IsCompany><RelatedBillID>695</RelatedBillID><RelatedDesc>String</RelatedDesc><Nationality>String</Nationality><CommissionType>String</CommissionType><EmailList>String</EmailList><IBANNumber>String</IBANNumber><AutoAudit>false</AutoAudit><AutoConfirm>false</AutoConfirm><AutoMerge>false</AutoMerge></BillHeadApplyRequest></Request>";
			AccountPlatServiceSoap accountPlatServiceSoap = new AccountPlatServiceLocator().getAccountPlatServiceSoap();
			String xml = accountPlatServiceSoap.request(sample);
			System.out.println(xml);
			SAXReader reader = new SAXReader();
			try {
				Document document = reader.read(new StringReader(xml));
				Node retCode = document.selectSingleNode("/Response/BillHeadApplyResponse/RetCode");
				System.out.println(retCode.getText());
			} catch (DocumentException e) {
				e.printStackTrace();
			}
		} catch (RemoteException e) {
			e.printStackTrace();
		} catch (ServiceException e) {
			e.printStackTrace();
		}
	}
	
	private static void esb() {
		try {
			String sample = "<?xml version=\"1.0\"?>" + //
			"<Request><Header UserID=\"410301\" RequestType=\"Payment.TMPay.OAService.GetDataForOA\" AsyncRequest=\"false\" />" + //
			"<GetDataForOARequest>" + //
			"<ItemCode>CS600</ItemCode>" + //
			"</GetDataForOARequest></Request>";
			ESBSoap esbSoap = new ESBLocator().getESBSoap();
			String xml = esbSoap.request(sample);
			System.out.println(xml);
			SAXReader reader = new SAXReader();
			try {
				Document resultDoc = reader.read(new StringReader(xml));
				Node resultCode = resultDoc.selectSingleNode("/Response/Header/@ResultCode");
				System.out.println(resultCode.getText());
				Map<String, Object> map = new HashMap<String, Object>();
				Node data = resultDoc.selectSingleNode("/Response/GetDataForOAResponse/DataForOA/Data");
				if (data != null) {
					Node itemName = data.selectSingleNode("ItemName");
					System.out.println("ItemName:\t" + itemName.getText());
					Node usingArea = data.selectSingleNode("UsingArea");
					System.out.println("UsingArea:\t" + usingArea.getText());
					Node usingType = data.selectSingleNode("UsingType");
					System.out.println("UsingType:\t" + usingType.getText());
					Node deductRate = data.selectSingleNode("DeductRate");
					System.out.println("DeductRate:\t" + deductRate.getText());
					Node totalAmount = data.selectSingleNode("TotalAmount");
					System.out.println("TotalAmount:\t" + totalAmount.getText());
					Node actAmount = data.selectSingleNode("ActAmount");
					System.out.println("ActAmount:\t" + actAmount.getText());
					Node unknown = data.selectSingleNode("unknown");
					System.out.println("unknown:\t" + unknown.getText());
				}
			} catch (DocumentException e) {
				e.printStackTrace();
			}
		} catch (RemoteException e) {
			e.printStackTrace();
		} catch (ServiceException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		//		soap();
		esb();
	}
	
}
