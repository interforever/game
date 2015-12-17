/**
 * CallCenterLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.usky.test.easternmiles;

public class CallCenterLocator extends org.apache.axis.client.Service implements com.usky.test.easternmiles.CallCenter {

/**
 * todo: add your documentation here
 */

    public CallCenterLocator() {
    }


    public CallCenterLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public CallCenterLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for CallCenterPort
    private java.lang.String CallCenterPort_address = "http://172.21.1.68:80/CallCenterServices/CallCenter";

    public java.lang.String getCallCenterPortAddress() {
        return CallCenterPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String CallCenterPortWSDDServiceName = "CallCenterPort";

    public java.lang.String getCallCenterPortWSDDServiceName() {
        return CallCenterPortWSDDServiceName;
    }

    public void setCallCenterPortWSDDServiceName(java.lang.String name) {
        CallCenterPortWSDDServiceName = name;
    }

    public com.usky.test.easternmiles.CallCenterPort getCallCenterPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(CallCenterPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getCallCenterPort(endpoint);
    }

    public com.usky.test.easternmiles.CallCenterPort getCallCenterPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.usky.test.easternmiles.CallCenterPortSoapBindingStub _stub = new com.usky.test.easternmiles.CallCenterPortSoapBindingStub(portAddress, this);
            _stub.setPortName(getCallCenterPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setCallCenterPortEndpointAddress(java.lang.String address) {
        CallCenterPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.usky.test.easternmiles.CallCenterPort.class.isAssignableFrom(serviceEndpointInterface)) {
                com.usky.test.easternmiles.CallCenterPortSoapBindingStub _stub = new com.usky.test.easternmiles.CallCenterPortSoapBindingStub(new java.net.URL(CallCenterPort_address), this);
                _stub.setPortName(getCallCenterPortWSDDServiceName());
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
        if ("CallCenterPort".equals(inputPortName)) {
            return getCallCenterPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://www.easternmiles.com", "CallCenter");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://www.easternmiles.com", "CallCenterPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("CallCenterPort".equals(portName)) {
            setCallCenterPortEndpointAddress(address);
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
