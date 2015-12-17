/**
 * CallCenterPort.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.usky.test.easternmiles;

public interface CallCenterPort extends java.rmi.Remote {
    public com.usky.test.easternmiles.io.QueryPartnerRet queryPartner(com.usky.test.easternmiles.io.QueryPartnerInput queryPartnerInput) throws java.rmi.RemoteException;
    public com.usky.test.easternmiles.io.InterfaceRet memberInfo(com.usky.test.easternmiles.io.MemberInfoInput memberInfoInput) throws java.rmi.RemoteException;
    public com.usky.test.easternmiles.io.MemberExpirePointRet memberExpirePoint(com.usky.test.easternmiles.io.MemberExpirePointInput memberExpirePointInput) throws java.rmi.RemoteException;
    public com.usky.test.easternmiles.io.InterfaceRet memberPoints(com.usky.test.easternmiles.io.MemberPointsInput memberPointsInput) throws java.rmi.RemoteException;
    public com.usky.test.easternmiles.io.InterfaceRet partnerPoints(com.usky.test.easternmiles.io.PartnerPointsInput partnerPointsInput) throws java.rmi.RemoteException;
    public com.usky.test.easternmiles.io.QuickRegisterRet quickRegister(com.usky.test.easternmiles.io.QuickRegisterInput quickRegisterInput) throws java.rmi.RemoteException;
    public com.usky.test.easternmiles.io.TicketInfoRet ticketInfo(com.usky.test.easternmiles.io.TicketInfoInput ticketInfoInput) throws java.rmi.RemoteException;
}
