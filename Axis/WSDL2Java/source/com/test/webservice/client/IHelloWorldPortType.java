/**
 * IHelloWorldPortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.test.webservice.client;

public interface IHelloWorldPortType extends java.rmi.Remote {
    public java.lang.String example(java.lang.String in0) throws java.rmi.RemoteException;
    public com.test.webservice.client.User createExample(java.lang.String in0, java.lang.String in1) throws java.rmi.RemoteException;
}
