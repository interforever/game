/**
 * MemberExpirePointInput.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.test.webservice.client;

public class MemberExpirePointInput  implements java.io.Serializable {
    private java.lang.String cid;

    private java.lang.String num;

    private java.lang.String uid;

    public MemberExpirePointInput() {
    }

    public MemberExpirePointInput(
           java.lang.String cid,
           java.lang.String num,
           java.lang.String uid) {
           this.cid = cid;
           this.num = num;
           this.uid = uid;
    }


    /**
     * Gets the cid value for this MemberExpirePointInput.
     * 
     * @return cid
     */
    public java.lang.String getCid() {
        return cid;
    }


    /**
     * Sets the cid value for this MemberExpirePointInput.
     * 
     * @param cid
     */
    public void setCid(java.lang.String cid) {
        this.cid = cid;
    }


    /**
     * Gets the num value for this MemberExpirePointInput.
     * 
     * @return num
     */
    public java.lang.String getNum() {
        return num;
    }


    /**
     * Sets the num value for this MemberExpirePointInput.
     * 
     * @param num
     */
    public void setNum(java.lang.String num) {
        this.num = num;
    }


    /**
     * Gets the uid value for this MemberExpirePointInput.
     * 
     * @return uid
     */
    public java.lang.String getUid() {
        return uid;
    }


    /**
     * Sets the uid value for this MemberExpirePointInput.
     * 
     * @param uid
     */
    public void setUid(java.lang.String uid) {
        this.uid = uid;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MemberExpirePointInput)) return false;
        MemberExpirePointInput other = (MemberExpirePointInput) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.cid==null && other.getCid()==null) || 
             (this.cid!=null &&
              this.cid.equals(other.getCid()))) &&
            ((this.num==null && other.getNum()==null) || 
             (this.num!=null &&
              this.num.equals(other.getNum()))) &&
            ((this.uid==null && other.getUid()==null) || 
             (this.uid!=null &&
              this.uid.equals(other.getUid())));
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
        if (getCid() != null) {
            _hashCode += getCid().hashCode();
        }
        if (getNum() != null) {
            _hashCode += getNum().hashCode();
        }
        if (getUid() != null) {
            _hashCode += getUid().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MemberExpirePointInput.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("java:com.usky", "MemberExpirePointInput"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cid");
        elemField.setXmlName(new javax.xml.namespace.QName("java:com.usky", "cid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("num");
        elemField.setXmlName(new javax.xml.namespace.QName("java:com.usky", "num"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("uid");
        elemField.setXmlName(new javax.xml.namespace.QName("java:com.usky", "uid"));
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
