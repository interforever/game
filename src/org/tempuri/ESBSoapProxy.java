package org.tempuri;

public class ESBSoapProxy implements org.tempuri.ESBSoap {
  private String _endpoint = null;
  private org.tempuri.ESBSoap eSBSoap = null;
  
  public ESBSoapProxy() {
    _initESBSoapProxy();
  }
  
  public ESBSoapProxy(String endpoint) {
    _endpoint = endpoint;
    _initESBSoapProxy();
  }
  
  private void _initESBSoapProxy() {
    try {
      eSBSoap = (new org.tempuri.ESBLocator()).getESBSoap();
      if (eSBSoap != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)eSBSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)eSBSoap)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (eSBSoap != null)
      ((javax.xml.rpc.Stub)eSBSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public org.tempuri.ESBSoap getESBSoap() {
    if (eSBSoap == null)
      _initESBSoapProxy();
    return eSBSoap;
  }
  
  public java.lang.String commRequest(java.lang.String requestXML) throws java.rmi.RemoteException{
    if (eSBSoap == null)
      _initESBSoapProxy();
    return eSBSoap.commRequest(requestXML);
  }
  
  public java.lang.String request(java.lang.String requestXML) throws java.rmi.RemoteException{
    if (eSBSoap == null)
      _initESBSoapProxy();
    return eSBSoap.request(requestXML);
  }
  
  
}