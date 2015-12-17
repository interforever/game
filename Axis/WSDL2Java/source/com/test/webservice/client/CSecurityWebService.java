/**
 * CSecurityWebService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.test.webservice.client;

public interface CSecurityWebService extends javax.xml.rpc.Service {
    public java.lang.String getCSecurityWebServiceSoapAddress();

    public com.test.webservice.client.CSecurityWebServiceSoap_PortType getCSecurityWebServiceSoap() throws javax.xml.rpc.ServiceException;

    public com.test.webservice.client.CSecurityWebServiceSoap_PortType getCSecurityWebServiceSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
