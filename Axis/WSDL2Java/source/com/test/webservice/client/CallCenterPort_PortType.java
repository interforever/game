/**
 * CallCenterPort_PortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.test.webservice.client;

public interface CallCenterPort_PortType extends java.rmi.Remote {
    public com.test.webservice.client.QueryPartnerRet queryPartner(com.test.webservice.client.QueryPartnerInput queryPartnerInput) throws java.rmi.RemoteException;
    public com.test.webservice.client.InterfaceRet memberInfo(com.test.webservice.client.MemberInfoInput memberInfoInput) throws java.rmi.RemoteException;
    public com.test.webservice.client.MemberExpirePointRet memberExpirePoint(com.test.webservice.client.MemberExpirePointInput memberExpirePointInput) throws java.rmi.RemoteException;
    public com.test.webservice.client.InterfaceRet memberPoints(com.test.webservice.client.MemberPointsInput memberPointsInput) throws java.rmi.RemoteException;
    public com.test.webservice.client.InterfaceRet partnerPoints(com.test.webservice.client.PartnerPointsInput partnerPointsInput) throws java.rmi.RemoteException;
    public com.test.webservice.client.QuickRegisterRet quickRegister(com.test.webservice.client.QuickRegisterInput quickRegisterInput) throws java.rmi.RemoteException;
    public com.test.webservice.client.TicketInfoRet ticketInfo(com.test.webservice.client.TicketInfoInput ticketInfoInput) throws java.rmi.RemoteException;
}
