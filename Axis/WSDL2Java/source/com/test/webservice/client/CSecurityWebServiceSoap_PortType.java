/**
 * CSecurityWebServiceSoap_PortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.test.webservice.client;

public interface CSecurityWebServiceSoap_PortType extends java.rmi.Remote {

    /**
     * WinForm登录Web服务
     */
    public java.lang.String login(java.lang.String account, java.lang.String password) throws java.rmi.RemoteException;

    /**
     * 安全服务
     */
    public java.lang.String validate(java.lang.String key) throws java.rmi.RemoteException;

    /**
     * 注销当前用户的Web服务
     */
    public boolean logOutMe() throws java.rmi.RemoteException;

    /**
     * 注销指定用户的Web服务
     */
    public boolean logOut(java.lang.String licence) throws java.rmi.RemoteException;
}
