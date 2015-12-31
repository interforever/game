/**
 * SalesStatusReturnType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class SalesStatusReturnType  implements java.io.Serializable {
    private java.lang.String applicationId;

    private org.tempuri.ApplicationStatus applicationStatus;

    public SalesStatusReturnType() {
    }

    public SalesStatusReturnType(
           java.lang.String applicationId,
           org.tempuri.ApplicationStatus applicationStatus) {
           this.applicationId = applicationId;
           this.applicationStatus = applicationStatus;
    }


    /**
     * Gets the applicationId value for this SalesStatusReturnType.
     * 
     * @return applicationId
     */
    public java.lang.String getApplicationId() {
        return applicationId;
    }


    /**
     * Sets the applicationId value for this SalesStatusReturnType.
     * 
     * @param applicationId
     */
    public void setApplicationId(java.lang.String applicationId) {
        this.applicationId = applicationId;
    }


    /**
     * Gets the applicationStatus value for this SalesStatusReturnType.
     * 
     * @return applicationStatus
     */
    public org.tempuri.ApplicationStatus getApplicationStatus() {
        return applicationStatus;
    }


    /**
     * Sets the applicationStatus value for this SalesStatusReturnType.
     * 
     * @param applicationStatus
     */
    public void setApplicationStatus(org.tempuri.ApplicationStatus applicationStatus) {
        this.applicationStatus = applicationStatus;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SalesStatusReturnType)) return false;
        SalesStatusReturnType other = (SalesStatusReturnType) obj;
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
              this.applicationStatus.equals(other.getApplicationStatus())));
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
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SalesStatusReturnType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "SalesStatusReturnType"));
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
