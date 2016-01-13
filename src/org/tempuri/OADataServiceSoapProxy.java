package org.tempuri;

public class OADataServiceSoapProxy implements org.tempuri.OADataServiceSoap {
  private String _endpoint = null;
  private org.tempuri.OADataServiceSoap oADataServiceSoap = null;
  
  public OADataServiceSoapProxy() {
    _initOADataServiceSoapProxy();
  }
  
  public OADataServiceSoapProxy(String endpoint) {
    _endpoint = endpoint;
    _initOADataServiceSoapProxy();
  }
  
  private void _initOADataServiceSoapProxy() {
    try {
      oADataServiceSoap = (new org.tempuri.OADataServiceLocator()).getOADataServiceSoap();
      if (oADataServiceSoap != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)oADataServiceSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)oADataServiceSoap)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (oADataServiceSoap != null)
      ((javax.xml.rpc.Stub)oADataServiceSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public org.tempuri.OADataServiceSoap getOADataServiceSoap() {
    if (oADataServiceSoap == null)
      _initOADataServiceSoapProxy();
    return oADataServiceSoap;
  }
  
  public org.tempuri.ContractStatusReturnType getContractStatus(java.lang.String contractNo) throws java.rmi.RemoteException{
    if (oADataServiceSoap == null)
      _initOADataServiceSoapProxy();
    return oADataServiceSoap.getContractStatus(contractNo);
  }
  
  public org.tempuri.SalesStatusReturnType getSalesStatus(java.lang.String appNo) throws java.rmi.RemoteException{
    if (oADataServiceSoap == null)
      _initOADataServiceSoapProxy();
    return oADataServiceSoap.getSalesStatus(appNo);
  }
  
  public org.tempuri.ApplicationStatus getPurchaseStatus(java.lang.String appNo) throws java.rmi.RemoteException{
    if (oADataServiceSoap == null)
      _initOADataServiceSoapProxy();
    return oADataServiceSoap.getPurchaseStatus(appNo);
  }
  
  public int getEmployeePendingCount(java.lang.String employeeCode) throws java.rmi.RemoteException{
    if (oADataServiceSoap == null)
      _initOADataServiceSoapProxy();
    return oADataServiceSoap.getEmployeePendingCount(employeeCode);
  }
  
  public int getEmployeePendingAndRejectedCount(java.lang.String employeeCode) throws java.rmi.RemoteException{
    if (oADataServiceSoap == null)
      _initOADataServiceSoapProxy();
    return oADataServiceSoap.getEmployeePendingAndRejectedCount(employeeCode);
  }
  
  public int getEmployeePendingCountInEntities(java.lang.String employeeCode) throws java.rmi.RemoteException{
    if (oADataServiceSoap == null)
      _initOADataServiceSoapProxy();
    return oADataServiceSoap.getEmployeePendingCountInEntities(employeeCode);
  }
  
  public boolean isExistEmployeeLoanByEmpCode(java.lang.String empCode) throws java.rmi.RemoteException{
    if (oADataServiceSoap == null)
      _initOADataServiceSoapProxy();
    return oADataServiceSoap.isExistEmployeeLoanByEmpCode(empCode);
  }
  
  public org.tempuri.EmployeePrepaidReturnType[] getEmployeePrepaids(java.lang.String employeeCode, java.lang.String reimbursementId) throws java.rmi.RemoteException{
    if (oADataServiceSoap == null)
      _initOADataServiceSoapProxy();
    return oADataServiceSoap.getEmployeePrepaids(employeeCode, reimbursementId);
  }
  
  
}