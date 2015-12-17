/**
 * CallCenter.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.test.webservice.client;

public interface CallCenter extends javax.xml.rpc.Service {

/**
 * todo: add your documentation here
 */
    public java.lang.String getCallCenterPortAddress();

    public com.test.webservice.client.CallCenterPort_PortType getCallCenterPort() throws javax.xml.rpc.ServiceException;

    public com.test.webservice.client.CallCenterPort_PortType getCallCenterPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
