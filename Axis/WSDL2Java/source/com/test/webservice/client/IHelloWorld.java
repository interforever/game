/**
 * IHelloWorld.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.test.webservice.client;

public interface IHelloWorld extends javax.xml.rpc.Service {
    public java.lang.String getIHelloWorldHttpPortAddress();

    public com.test.webservice.client.IHelloWorldPortType getIHelloWorldHttpPort() throws javax.xml.rpc.ServiceException;

    public com.test.webservice.client.IHelloWorldPortType getIHelloWorldHttpPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
