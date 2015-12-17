/**
 * ESBLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class ESBLocator extends org.apache.axis.client.Service implements org.tempuri.ESB {

    public ESBLocator() {
    }


    public ESBLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ESBLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for ESBSoap
    private java.lang.String ESBSoap_address = "http://soa.uat.qa.nt.ctripcorp.com/SOA.ESB/ctrip.soa.esb.asmx";

    public java.lang.String getESBSoapAddress() {
        return ESBSoap_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String ESBSoapWSDDServiceName = "ESBSoap";

    public java.lang.String getESBSoapWSDDServiceName() {
        return ESBSoapWSDDServiceName;
    }

    public void setESBSoapWSDDServiceName(java.lang.String name) {
        ESBSoapWSDDServiceName = name;
    }

    public org.tempuri.ESBSoap getESBSoap() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(ESBSoap_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getESBSoap(endpoint);
    }

    public org.tempuri.ESBSoap getESBSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            org.tempuri.ESBSoapStub _stub = new org.tempuri.ESBSoapStub(portAddress, this);
            _stub.setPortName(getESBSoapWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setESBSoapEndpointAddress(java.lang.String address) {
        ESBSoap_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (org.tempuri.ESBSoap.class.isAssignableFrom(serviceEndpointInterface)) {
                org.tempuri.ESBSoapStub _stub = new org.tempuri.ESBSoapStub(new java.net.URL(ESBSoap_address), this);
                _stub.setPortName(getESBSoapWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("ESBSoap".equals(inputPortName)) {
            return getESBSoap();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://tempuri.org/", "ESB");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://tempuri.org/", "ESBSoap"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("ESBSoap".equals(portName)) {
            setESBSoapEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
