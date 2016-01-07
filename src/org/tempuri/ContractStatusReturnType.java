/**
 * ContractStatusReturnType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class ContractStatusReturnType  implements java.io.Serializable {
    private java.lang.String applicationId;

    private org.tempuri.ApplicationStatus applicationStatus;

    private java.math.BigDecimal totalAmount;

    private java.math.BigDecimal balancedAmount;

    private java.lang.String agreementCompany;

    private boolean isAmountVariable;

    private java.lang.String[] payCompaines;

    public ContractStatusReturnType() {
    }

    public ContractStatusReturnType(
           java.lang.String applicationId,
           org.tempuri.ApplicationStatus applicationStatus,
           java.math.BigDecimal totalAmount,
           java.math.BigDecimal balancedAmount,
           java.lang.String agreementCompany,
           boolean isAmountVariable,
           java.lang.String[] payCompaines) {
           this.applicationId = applicationId;
           this.applicationStatus = applicationStatus;
           this.totalAmount = totalAmount;
           this.balancedAmount = balancedAmount;
           this.agreementCompany = agreementCompany;
           this.isAmountVariable = isAmountVariable;
           this.payCompaines = payCompaines;
    }


    /**
     * Gets the applicationId value for this ContractStatusReturnType.
     * 
     * @return applicationId
     */
    public java.lang.String getApplicationId() {
        return applicationId;
    }


    /**
     * Sets the applicationId value for this ContractStatusReturnType.
     * 
     * @param applicationId
     */
    public void setApplicationId(java.lang.String applicationId) {
        this.applicationId = applicationId;
    }


    /**
     * Gets the applicationStatus value for this ContractStatusReturnType.
     * 
     * @return applicationStatus
     */
    public org.tempuri.ApplicationStatus getApplicationStatus() {
        return applicationStatus;
    }


    /**
     * Sets the applicationStatus value for this ContractStatusReturnType.
     * 
     * @param applicationStatus
     */
    public void setApplicationStatus(org.tempuri.ApplicationStatus applicationStatus) {
        this.applicationStatus = applicationStatus;
    }


    /**
     * Gets the totalAmount value for this ContractStatusReturnType.
     * 
     * @return totalAmount
     */
    public java.math.BigDecimal getTotalAmount() {
        return totalAmount;
    }


    /**
     * Sets the totalAmount value for this ContractStatusReturnType.
     * 
     * @param totalAmount
     */
    public void setTotalAmount(java.math.BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
    }


    /**
     * Gets the balancedAmount value for this ContractStatusReturnType.
     * 
     * @return balancedAmount
     */
    public java.math.BigDecimal getBalancedAmount() {
        return balancedAmount;
    }


    /**
     * Sets the balancedAmount value for this ContractStatusReturnType.
     * 
     * @param balancedAmount
     */
    public void setBalancedAmount(java.math.BigDecimal balancedAmount) {
        this.balancedAmount = balancedAmount;
    }


    /**
     * Gets the agreementCompany value for this ContractStatusReturnType.
     * 
     * @return agreementCompany
     */
    public java.lang.String getAgreementCompany() {
        return agreementCompany;
    }


    /**
     * Sets the agreementCompany value for this ContractStatusReturnType.
     * 
     * @param agreementCompany
     */
    public void setAgreementCompany(java.lang.String agreementCompany) {
        this.agreementCompany = agreementCompany;
    }


    /**
     * Gets the isAmountVariable value for this ContractStatusReturnType.
     * 
     * @return isAmountVariable
     */
    public boolean isIsAmountVariable() {
        return isAmountVariable;
    }


    /**
     * Sets the isAmountVariable value for this ContractStatusReturnType.
     * 
     * @param isAmountVariable
     */
    public void setIsAmountVariable(boolean isAmountVariable) {
        this.isAmountVariable = isAmountVariable;
    }


    /**
     * Gets the payCompaines value for this ContractStatusReturnType.
     * 
     * @return payCompaines
     */
    public java.lang.String[] getPayCompaines() {
        return payCompaines;
    }


    /**
     * Sets the payCompaines value for this ContractStatusReturnType.
     * 
     * @param payCompaines
     */
    public void setPayCompaines(java.lang.String[] payCompaines) {
        this.payCompaines = payCompaines;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ContractStatusReturnType)) return false;
        ContractStatusReturnType other = (ContractStatusReturnType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.applicationId==null && other.getApplicationId()==null) || 
             (this.applicationId!=null &&
              this.applicationId.equals(other.getApplicationId()))) &&
            ((this.applicationStatus==null && other.getApplicationStatus()==null) || 
             (this.applicationStatus!=null &&
              this.applicationStatus.equals(other.getApplicationStatus()))) &&
            ((this.totalAmount==null && other.getTotalAmount()==null) || 
             (this.totalAmount!=null &&
              this.totalAmount.equals(other.getTotalAmount()))) &&
            ((this.balancedAmount==null && other.getBalancedAmount()==null) || 
             (this.balancedAmount!=null &&
              this.balancedAmount.equals(other.getBalancedAmount()))) &&
            ((this.agreementCompany==null && other.getAgreementCompany()==null) || 
             (this.agreementCompany!=null &&
              this.agreementCompany.equals(other.getAgreementCompany()))) &&
            this.isAmountVariable == other.isIsAmountVariable() &&
            ((this.payCompaines==null && other.getPayCompaines()==null) || 
             (this.payCompaines!=null &&
              java.util.Arrays.equals(this.payCompaines, other.getPayCompaines())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getApplicationId() != null) {
            _hashCode += getApplicationId().hashCode();
        }
        if (getApplicationStatus() != null) {
            _hashCode += getApplicationStatus().hashCode();
        }
        if (getTotalAmount() != null) {
            _hashCode += getTotalAmount().hashCode();
        }
        if (getBalancedAmount() != null) {
            _hashCode += getBalancedAmount().hashCode();
        }
        if (getAgreementCompany() != null) {
            _hashCode += getAgreementCompany().hashCode();
        }
        _hashCode += (isIsAmountVariable() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getPayCompaines() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPayCompaines());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPayCompaines(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ContractStatusReturnType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "ContractStatusReturnType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("applicationId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ApplicationId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("applicationStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ApplicationStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "ApplicationStatus"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "TotalAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("balancedAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "BalancedAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("agreementCompany");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "AgreementCompany"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isAmountVariable");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "IsAmountVariable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payCompaines");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "PayCompaines"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://tempuri.org/", "string"));
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
