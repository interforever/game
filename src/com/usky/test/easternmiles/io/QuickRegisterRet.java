/**
 * QuickRegisterRet.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.usky.test.easternmiles.io;

public class QuickRegisterRet  extends com.usky.test.easternmiles.io.InterfaceRet  implements java.io.Serializable {
    private java.lang.String cardno;

    public QuickRegisterRet() {
    }

    public QuickRegisterRet(
           java.lang.String error,
           java.lang.String flag,
           java.lang.String remark,
           java.lang.String cardno) {
        super(
            error,
            flag,
            remark);
        this.cardno = cardno;
    }


    /**
     * Gets the cardno value for this QuickRegisterRet.
     * 
     * @return cardno
     */
    public java.lang.String getCardno() {
        return cardno;
    }


    /**
     * Sets the cardno value for this QuickRegisterRet.
     * 
     * @param cardno
     */
    public void setCardno(java.lang.String cardno) {
        this.cardno = cardno;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof QuickRegisterRet)) return false;
        QuickRegisterRet other = (QuickRegisterRet) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.cardno==null && other.getCardno()==null) || 
             (this.cardno!=null &&
              this.cardno.equals(other.getCardno())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getCardno() != null) {
            _hashCode += getCardno().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(QuickRegisterRet.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("java:com.usky", "QuickRegisterRet"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cardno");
        elemField.setXmlName(new javax.xml.namespace.QName("java:com.usky", "cardno"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
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
