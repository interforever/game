/**
 * CallCenterPortSoapBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.usky.test.easternmiles;

public class CallCenterPortSoapBindingStub extends org.apache.axis.client.Stub implements com.usky.test.easternmiles.CallCenterPort {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[7];
        _initOperationDesc1();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("QueryPartner");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "queryPartnerInput"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("java:com.usky", "QueryPartnerInput"), com.usky.test.easternmiles.io.QueryPartnerInput.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("java:com.usky", "QueryPartnerRet"));
        oper.setReturnClass(com.usky.test.easternmiles.io.QueryPartnerRet.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("MemberInfo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "memberInfoInput"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("java:com.usky", "MemberInfoInput"), com.usky.test.easternmiles.io.MemberInfoInput.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("java:com.usky", "InterfaceRet"));
        oper.setReturnClass(com.usky.test.easternmiles.io.InterfaceRet.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("MemberExpirePoint");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "memberExpirePointInput"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("java:com.usky", "MemberExpirePointInput"), com.usky.test.easternmiles.io.MemberExpirePointInput.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("java:com.usky", "MemberExpirePointRet"));
        oper.setReturnClass(com.usky.test.easternmiles.io.MemberExpirePointRet.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("MemberPoints");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "memberPointsInput"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("java:com.usky", "MemberPointsInput"), com.usky.test.easternmiles.io.MemberPointsInput.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("java:com.usky", "InterfaceRet"));
        oper.setReturnClass(com.usky.test.easternmiles.io.InterfaceRet.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("PartnerPoints");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "partnerPointsInput"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("java:com.usky", "PartnerPointsInput"), com.usky.test.easternmiles.io.PartnerPointsInput.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("java:com.usky", "InterfaceRet"));
        oper.setReturnClass(com.usky.test.easternmiles.io.InterfaceRet.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("QuickRegister");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "quickRegisterInput"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("java:com.usky", "QuickRegisterInput"), com.usky.test.easternmiles.io.QuickRegisterInput.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("java:com.usky", "QuickRegisterRet"));
        oper.setReturnClass(com.usky.test.easternmiles.io.QuickRegisterRet.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("TicketInfo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ticketInfoInput"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("java:com.usky", "TicketInfoInput"), com.usky.test.easternmiles.io.TicketInfoInput.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("java:com.usky", "TicketInfoRet"));
        oper.setReturnClass(com.usky.test.easternmiles.io.TicketInfoRet.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[6] = oper;

    }

    public CallCenterPortSoapBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public CallCenterPortSoapBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public CallCenterPortSoapBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.2");
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("java:com.usky", "InterfaceRet");
            cachedSerQNames.add(qName);
            cls = com.usky.test.easternmiles.io.InterfaceRet.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("java:com.usky", "ListRet");
            cachedSerQNames.add(qName);
            cls = com.usky.test.easternmiles.io.ListRet.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("java:com.usky", "MemberExpirePointInput");
            cachedSerQNames.add(qName);
            cls = com.usky.test.easternmiles.io.MemberExpirePointInput.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("java:com.usky", "MemberExpirePointRet");
            cachedSerQNames.add(qName);
            cls = com.usky.test.easternmiles.io.MemberExpirePointRet.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("java:com.usky", "MemberInfoInput");
            cachedSerQNames.add(qName);
            cls = com.usky.test.easternmiles.io.MemberInfoInput.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("java:com.usky", "MemberPointsInput");
            cachedSerQNames.add(qName);
            cls = com.usky.test.easternmiles.io.MemberPointsInput.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("java:com.usky", "PartnerPointsInput");
            cachedSerQNames.add(qName);
            cls = com.usky.test.easternmiles.io.PartnerPointsInput.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("java:com.usky", "QueryPartnerInput");
            cachedSerQNames.add(qName);
            cls = com.usky.test.easternmiles.io.QueryPartnerInput.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("java:com.usky", "QueryPartnerRet");
            cachedSerQNames.add(qName);
            cls = com.usky.test.easternmiles.io.QueryPartnerRet.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("java:com.usky", "QuickRegisterInput");
            cachedSerQNames.add(qName);
            cls = com.usky.test.easternmiles.io.QuickRegisterInput.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("java:com.usky", "QuickRegisterRet");
            cachedSerQNames.add(qName);
            cls = com.usky.test.easternmiles.io.QuickRegisterRet.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("java:com.usky", "TicketInfoInput");
            cachedSerQNames.add(qName);
            cls = com.usky.test.easternmiles.io.TicketInfoInput.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("java:com.usky", "TicketInfoRet");
            cachedSerQNames.add(qName);
            cls = com.usky.test.easternmiles.io.TicketInfoRet.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                java.lang.String key = (java.lang.String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
                    _call.setEncodingStyle(org.apache.axis.Constants.URI_SOAP11_ENC);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        java.lang.Class cls = (java.lang.Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        java.lang.Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            java.lang.Class sf = (java.lang.Class)
                                 cachedSerFactories.get(i);
                            java.lang.Class df = (java.lang.Class)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                        else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
                                 cachedSerFactories.get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        }
        catch (java.lang.Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public com.usky.test.easternmiles.io.QueryPartnerRet queryPartner(com.usky.test.easternmiles.io.QueryPartnerInput queryPartnerInput) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.easternmiles.com", "QueryPartner"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {queryPartnerInput});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.usky.test.easternmiles.io.QueryPartnerRet) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.usky.test.easternmiles.io.QueryPartnerRet) org.apache.axis.utils.JavaUtils.convert(_resp, com.usky.test.easternmiles.io.QueryPartnerRet.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.usky.test.easternmiles.io.InterfaceRet memberInfo(com.usky.test.easternmiles.io.MemberInfoInput memberInfoInput) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.easternmiles.com", "MemberInfo"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {memberInfoInput});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.usky.test.easternmiles.io.InterfaceRet) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.usky.test.easternmiles.io.InterfaceRet) org.apache.axis.utils.JavaUtils.convert(_resp, com.usky.test.easternmiles.io.InterfaceRet.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.usky.test.easternmiles.io.MemberExpirePointRet memberExpirePoint(com.usky.test.easternmiles.io.MemberExpirePointInput memberExpirePointInput) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.easternmiles.com", "MemberExpirePoint"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {memberExpirePointInput});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.usky.test.easternmiles.io.MemberExpirePointRet) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.usky.test.easternmiles.io.MemberExpirePointRet) org.apache.axis.utils.JavaUtils.convert(_resp, com.usky.test.easternmiles.io.MemberExpirePointRet.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.usky.test.easternmiles.io.InterfaceRet memberPoints(com.usky.test.easternmiles.io.MemberPointsInput memberPointsInput) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.easternmiles.com", "MemberPoints"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {memberPointsInput});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.usky.test.easternmiles.io.InterfaceRet) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.usky.test.easternmiles.io.InterfaceRet) org.apache.axis.utils.JavaUtils.convert(_resp, com.usky.test.easternmiles.io.InterfaceRet.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.usky.test.easternmiles.io.InterfaceRet partnerPoints(com.usky.test.easternmiles.io.PartnerPointsInput partnerPointsInput) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.easternmiles.com", "PartnerPoints"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {partnerPointsInput});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.usky.test.easternmiles.io.InterfaceRet) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.usky.test.easternmiles.io.InterfaceRet) org.apache.axis.utils.JavaUtils.convert(_resp, com.usky.test.easternmiles.io.InterfaceRet.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.usky.test.easternmiles.io.QuickRegisterRet quickRegister(com.usky.test.easternmiles.io.QuickRegisterInput quickRegisterInput) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.easternmiles.com", "QuickRegister"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {quickRegisterInput});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.usky.test.easternmiles.io.QuickRegisterRet) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.usky.test.easternmiles.io.QuickRegisterRet) org.apache.axis.utils.JavaUtils.convert(_resp, com.usky.test.easternmiles.io.QuickRegisterRet.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.usky.test.easternmiles.io.TicketInfoRet ticketInfo(com.usky.test.easternmiles.io.TicketInfoInput ticketInfoInput) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.easternmiles.com", "TicketInfo"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {ticketInfoInput});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.usky.test.easternmiles.io.TicketInfoRet) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.usky.test.easternmiles.io.TicketInfoRet) org.apache.axis.utils.JavaUtils.convert(_resp, com.usky.test.easternmiles.io.TicketInfoRet.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

}
