package org.tempuri;

public class AccountPlatServiceSoapProxy implements org.tempuri.AccountPlatServiceSoap {
  private String _endpoint = null;
  private org.tempuri.AccountPlatServiceSoap accountPlatServiceSoap = null;
  
  public AccountPlatServiceSoapProxy() {
    _initAccountPlatServiceSoapProxy();
  }
  
  public AccountPlatServiceSoapProxy(String endpoint) {
    _endpoint = endpoint;
    _initAccountPlatServiceSoapProxy();
  }
  
  private void _initAccountPlatServiceSoapProxy() {
    try {
      accountPlatServiceSoap = (new org.tempuri.AccountPlatServiceLocator()).getAccountPlatServiceSoap();
      if (accountPlatServiceSoap != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)accountPlatServiceSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)accountPlatServiceSoap)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (accountPlatServiceSoap != null)
      ((javax.xml.rpc.Stub)accountPlatServiceSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public org.tempuri.AccountPlatServiceSoap getAccountPlatServiceSoap() {
    if (accountPlatServiceSoap == null)
      _initAccountPlatServiceSoapProxy();
    return accountPlatServiceSoap;
  }
  
  public java.lang.String request(java.lang.String requestXML) throws java.rmi.RemoteException{
    if (accountPlatServiceSoap == null)
      _initAccountPlatServiceSoapProxy();
    return accountPlatServiceSoap.request(requestXML);
  }
  
  public java.lang.String commRequest(java.lang.String requestXML) throws java.rmi.RemoteException{
    if (accountPlatServiceSoap == null)
      _initAccountPlatServiceSoapProxy();
    return accountPlatServiceSoap.commRequest(requestXML);
  }
  
  
}