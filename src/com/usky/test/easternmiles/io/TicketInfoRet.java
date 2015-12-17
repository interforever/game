/**
 * TicketInfoRet.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.usky.test.easternmiles.io;

public class TicketInfoRet  extends com.usky.test.easternmiles.io.InterfaceRet  implements java.io.Serializable {
    private java.lang.String a1;

    private java.lang.String a2;

    private java.lang.String d1;

    private java.lang.String d2;

    private java.lang.String i1;

    private java.lang.String i2;

    public TicketInfoRet() {
    }

    public TicketInfoRet(
           java.lang.String error,
           java.lang.String flag,
           java.lang.String remark,
           java.lang.String a1,
           java.lang.String a2,
           java.lang.String d1,
           java.lang.String d2,
           java.lang.String i1,
           java.lang.String i2) {
        super(
            error,
            flag,
            remark);
        this.a1 = a1;
        this.a2 = a2;
        this.d1 = d1;
        this.d2 = d2;
        this.i1 = i1;
        this.i2 = i2;
    }


    /**
     * Gets the a1 value for this TicketInfoRet.
     * 
     * @return a1
     */
    public java.lang.String getA1() {
        return a1;
    }


    /**
     * Sets the a1 value for this TicketInfoRet.
     * 
     * @param a1
     */
    public void setA1(java.lang.String a1) {
        this.a1 = a1;
    }


    /**
     * Gets the a2 value for this TicketInfoRet.
     * 
     * @return a2
     */
    public java.lang.String getA2() {
        return a2;
    }


    /**
     * Sets the a2 value for this TicketInfoRet.
     * 
     * @param a2
     */
    public void setA2(java.lang.String a2) {
        this.a2 = a2;
    }


    /**
     * Gets the d1 value for this TicketInfoRet.
     * 
     * @return d1
     */
    public java.lang.String getD1() {
        return d1;
    }


    /**
     * Sets the d1 value for this TicketInfoRet.
     * 
     * @param d1
     */
    public void setD1(java.lang.String d1) {
        this.d1 = d1;
    }


    /**
     * Gets the d2 value for this TicketInfoRet.
     * 
     * @return d2
     */
    public java.lang.String getD2() {
        return d2;
    }


    /**
     * Sets the d2 value for this TicketInfoRet.
     * 
     * @param d2
     */
    public void setD2(java.lang.String d2) {
        this.d2 = d2;
    }


    /**
     * Gets the i1 value for this TicketInfoRet.
     * 
     * @return i1
     */
    public java.lang.String getI1() {
        return i1;
    }


    /**
     * Sets the i1 value for this TicketInfoRet.
     * 
     * @param i1
     */
    public void setI1(java.lang.String i1) {
        this.i1 = i1;
    }


    /**
     * Gets the i2 value for this TicketInfoRet.
     * 
     * @return i2
     */
    public java.lang.String getI2() {
        return i2;
    }


    /**
     * Sets the i2 value for this TicketInfoRet.
     * 
     * @param i2
     */
    public void setI2(java.lang.String i2) {
        this.i2 = i2;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TicketInfoRet)) return false;
        TicketInfoRet other = (TicketInfoRet) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.a1==null && other.getA1()==null) || 
             (this.a1!=null &&
              this.a1.equals(other.getA1()))) &&
            ((this.a2==null && other.getA2()==null) || 
             (this.a2!=null &&
              this.a2.equals(other.getA2()))) &&
            ((this.d1==null && other.getD1()==null) || 
             (this.d1!=null &&
              this.d1.equals(other.getD1()))) &&
            ((this.d2==null && other.getD2()==null) || 
             (this.d2!=null &&
              this.d2.equals(other.getD2()))) &&
            ((this.i1==null && other.getI1()==null) || 
             (this.i1!=null &&
              this.i1.equals(other.getI1()))) &&
            ((this.i2==null && other.getI2()==null) || 
             (this.i2!=null &&
              this.i2.equals(other.getI2())));
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
        if (getA1() != null) {
            _hashCode += getA1().hashCode();
        }
        if (getA2() != null) {
            _hashCode += getA2().hashCode();
        }
        if (getD1() != null) {
            _hashCode += getD1().hashCode();
        }
        if (getD2() != null) {
            _hashCode += getD2().hashCode();
        }
        if (getI1() != null) {
            _hashCode += getI1().hashCode();
        }
        if (getI2() != null) {
            _hashCode += getI2().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TicketInfoRet.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("java:com.usky", "TicketInfoRet"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("a1");
        elemField.setXmlName(new javax.xml.namespace.QName("java:com.usky", "a1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("a2");
        elemField.setXmlName(new javax.xml.namespace.QName("java:com.usky", "a2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("d1");
        elemField.setXmlName(new javax.xml.namespace.QName("java:com.usky", "d1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("d2");
        elemField.setXmlName(new javax.xml.namespace.QName("java:com.usky", "d2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("i1");
        elemField.setXmlName(new javax.xml.namespace.QName("java:com.usky", "i1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("i2");
        elemField.setXmlName(new javax.xml.namespace.QName("java:com.usky", "i2"));
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
