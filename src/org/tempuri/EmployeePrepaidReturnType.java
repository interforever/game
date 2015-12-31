/**
 * EmployeePrepaidReturnType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class EmployeePrepaidReturnType  implements java.io.Serializable {
    private java.lang.String prepaidId;

    private java.math.BigDecimal prepaidAmount;

    public EmployeePrepaidReturnType() {
    }

    public EmployeePrepaidReturnType(
           java.lang.String prepaidId,
           java.math.BigDecimal prepaidAmount) {
           this.prepaidId = prepaidId;
           this.prepaidAmount = prepaidAmount;
    }


    /**
     * Gets the prepaidId value for this EmployeePrepaidReturnType.
     * 
     * @return prepaidId
     */
    public java.lang.String getPrepaidId() {
        return prepaidId;
    }


    /**
     * Sets the prepaidId value for this EmployeePrepaidReturnType.
     * 
     * @param prepaidId
     */
    public void setPrepaidId(java.lang.String prepaidId) {
        this.prepaidId = prepaidId;
    }


    /**
     * Gets the prepaidAmount value for this EmployeePrepaidReturnType.
     * 
     * @return prepaidAmount
     */
    public java.math.BigDecimal getPrepaidAmount() {
        return prepaidAmount;
    }


    /**
     * Sets the prepaidAmount value for this EmployeePrepaidReturnType.
     * 
     * @param prepaidAmount
     */
    public void setPrepaidAmount(java.math.BigDecimal prepaidAmount) {
        this.prepaidAmount = prepaidAmount;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EmployeePrepaidReturnType)) return false;
        EmployeePrepaidReturnType other = (EmployeePrepaidReturnType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.prepaidId==null && other.getPrepaidId()==null) || 
             (this.prepaidId!=null &&
              this.prepaidId.equals(other.getPrepaidId()))) &&
            ((this.prepaidAmount==null && other.getPrepaidAmount()==null) || 
             (this.prepaidAmount!=null &&
              this.prepaidAmount.equals(other.getPrepaidAmount())));
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
        if (getPrepaidId() != null) {
            _hashCode += getPrepaidId().hashCode();
        }
        if (getPrepaidAmount() != null) {
            _hashCode += getPrepaidAmount().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(EmployeePrepaidReturnType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "EmployeePrepaidReturnType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("prepaidId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "PrepaidId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("prepaidAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "PrepaidAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
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
