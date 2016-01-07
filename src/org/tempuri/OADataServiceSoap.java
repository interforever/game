/**
 * OADataServiceSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public interface OADataServiceSoap extends java.rmi.Remote {

    /**
     * 采购合同评审单合同状态查询
     */
    public org.tempuri.ContractStatusReturnType getContractStatus(java.lang.String contractNo) throws java.rmi.RemoteException;

    /**
     * 收入合同评审单合同状态查询
     */
    public org.tempuri.SalesStatusReturnType getSalesStatus(java.lang.String appNo) throws java.rmi.RemoteException;

    /**
     * 采购单状态查询
     */
    public org.tempuri.ApplicationStatus getPurchaseStatus(java.lang.String appNo) throws java.rmi.RemoteException;

    /**
     * 根据员工号获取其待审批单据数量
     */
    public int getEmployeePendingCount(java.lang.String employeeCode) throws java.rmi.RemoteException;

    /**
     * 根据员工号获取其待审批及被拒绝单据数量
     */
    public int getEmployeePendingAndRejectedCount(java.lang.String employeeCode) throws java.rmi.RemoteException;

    /**
     * 根据员工号获取其控股OA待审批（及被拒绝）单据数量
     */
    public int getEmployeePendingCountInEntities(java.lang.String employeeCode) throws java.rmi.RemoteException;

    /**
     * 根据员工号获取其是否有未结欠款
     */
    public boolean isExistEmployeeLoanByEmpCode(java.lang.String empCode) throws java.rmi.RemoteException;

    /**
     * 根据工号及报销单号查询借款单信息，报销单号可为空
     */
    public org.tempuri.EmployeePrepaidReturnType[] getEmployeePrepaids(java.lang.String employeeCode, java.lang.String reimbursementId) throws java.rmi.RemoteException;
}
