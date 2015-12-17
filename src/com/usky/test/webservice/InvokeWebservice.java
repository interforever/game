package com.usky.test.webservice;

import java.rmi.RemoteException;

import javax.xml.rpc.ServiceException;


import com.usky.test.easternmiles.CallCenter;
import com.usky.test.easternmiles.CallCenterLocator;
import com.usky.test.easternmiles.CallCenterPort;
import com.usky.test.easternmiles.io.InterfaceRet;
import com.usky.test.easternmiles.io.MemberInfoInput;

public class InvokeWebservice
{
	private static void invokeFFP() throws ServiceException, RemoteException
	{
		CallCenter callCenterLocator = new CallCenterLocator();
		CallCenterPort callCenterPort = callCenterLocator.getCallCenterPort();
		InterfaceRet interfaceRet = callCenterPort.memberInfo(new MemberInfoInput());
		System.out.println(interfaceRet.getError());
	}

	/**
	 * @param args
	 * @throws ServiceException
	 * @throws RemoteException
	 */
	public static void main(String[] args) throws RemoteException, ServiceException
	{
		invokeFFP();
	}
}
