/**
 * TicketInfoInput.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.test.webservice.client;

public class TicketInfoInput  implements java.io.Serializable {
    private java.lang.String fc1;

    private java.lang.String fc2;

    private java.lang.String ft1;

    private java.lang.String ft2;

    private java.lang.String tc1;

    private java.lang.String tc2;

    private java.lang.String type;

    private java.lang.String uid;

    public TicketInfoInput() {
    }

    public TicketInfoInput(
           java.lang.String fc1,
           java.lang.String fc2,
           java.lang.String ft1,
           java.lang.String ft2,
           java.lang.String tc1,
           java.lang.String tc2,
           java.lang.String type,
           java.lang.String uid) {
           this.fc1 = fc1;
           this.fc2 = fc2;
           this.ft1 = ft1;
           this.ft2 = ft2;
           this.tc1 = tc1;
           this.tc2 = tc2;
           this.type = type;
           this.uid = uid;
    }


    /**
     * Gets the fc1 value for this TicketInfoInput.
     * 
     * @return fc1
     */
    public java.lang.String getFc1() {
        return fc1;
    }


    /**
     * Sets the fc1 value for this TicketInfoInput.
     * 
     * @param fc1
     */
    public void setFc1(java.lang.String fc1) {
        this.fc1 = fc1;
    }


    /**
     * Gets the fc2 value for this TicketInfoInput.
     * 
     * @return fc2
     */
    public java.lang.String getFc2() {
        return fc2;
    }


    /**
     * Sets the fc2 value for this TicketInfoInput.
     * 
     * @param fc2
     */
    public void setFc2(java.lang.String fc2) {
        this.fc2 = fc2;
    }


    /**
     * Gets the ft1 value for this TicketInfoInput.
     * 
     * @return ft1
     */
    public java.lang.String getFt1() {
        return ft1;
    }


    /**
     * Sets the ft1 value for this TicketInfoInput.
     * 
     * @param ft1
     */
    public void setFt1(java.lang.String ft1) {
        this.ft1 = ft1;
    }


    /**
     * Gets the ft2 value for this TicketInfoInput.
     * 
     * @return ft2
     */
    public java.lang.String getFt2() {
        return ft2;
    }


    /**
     * Sets the ft2 value for this TicketInfoInput.
     * 
     * @param ft2
     */
    public void setFt2(java.lang.String ft2) {
        this.ft2 = ft2;
    }


    /**
     * Gets the tc1 value for this TicketInfoInput.
     * 
     * @return tc1
     */
    public java.lang.String getTc1() {
        return tc1;
    }


    /**
     * Sets the tc1 value for this TicketInfoInput.
     * 
     * @param tc1
     */
    public void setTc1(java.lang.String tc1) {
        this.tc1 = tc1;
    }


    /**
     * Gets the tc2 value for this TicketInfoInput.
     * 
     * @return tc2
     */
    public java.lang.String getTc2() {
        return tc2;
    }


    /**
     * Sets the tc2 value for this TicketInfoInput.
     * 
     * @param tc2
     */
    public void setTc2(java.lang.String tc2) {
        this.tc2 = tc2;
    }


    /**
     * Gets the type value for this TicketInfoInput.
     * 
     * @return type
     */
    public java.lang.String getType() {
        return type;
    }


    /**
     * Sets the type value for this TicketInfoInput.
     * 
     * @param type
     */
    public void setType(java.lang.String type) {
        this.type = type;
    }


    /**
     * Gets the uid value for this TicketInfoInput.
     * 
     * @return uid
     */
    public java.lang.String getUid() {
        return uid;
    }


    /**
     * Sets the uid value for this TicketInfoInput.
     * 
     * @param uid
     */
    public void setUid(java.lang.String uid) {
        this.uid = uid;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TicketInfoInput)) return false;
        TicketInfoInput other = (TicketInfoInput) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.fc1==null && other.getFc1()==null) || 
             (this.fc1!=null &&
              this.fc1.equals(other.getFc1()))) &&
            ((this.fc2==null && other.getFc2()==null) || 
             (this.fc2!=null &&
              this.fc2.equals(other.getFc2()))) &&
            ((this.ft1==null && other.getFt1()==null) || 
             (this.ft1!=null &&
              this.ft1.equals(other.getFt1()))) &&
            ((this.ft2==null && other.getFt2()==null) || 
             (this.ft2!=null &&
              this.ft2.equals(other.getFt2()))) &&
            ((this.tc1==null && other.getTc1()==null) || 
             (this.tc1!=null &&
              this.tc1.equals(other.getTc1()))) &&
            ((this.tc2==null && other.getTc2()==null) || 
             (this.tc2!=null &&
              this.tc2.equals(other.getTc2()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
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
        if (getFc1() != null) {
            _hashCode += getFc1().hashCode();
        }
        if (getFc2() != null) {
            _hashCode += getFc2().hashCode();
        }
        if (getFt1() != null) {
            _hashCode += getFt1().hashCode();
        }
        if (getFt2() != null) {
            _hashCode += getFt2().hashCode();
        }
        if (getTc1() != null) {
            _hashCode += getTc1().hashCode();
        }
        if (getTc2() != null) {
            _hashCode += getTc2().hashCode();
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getUid() != null) {
            _hashCode += getUid().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TicketInfoInput.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("java:com.usky", "TicketInfoInput"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fc1");
        elemField.setXmlName(new javax.xml.namespace.QName("java:com.usky", "fc1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fc2");
        elemField.setXmlName(new javax.xml.namespace.QName("java:com.usky", "fc2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ft1");
        elemField.setXmlName(new javax.xml.namespace.QName("java:com.usky", "ft1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ft2");
        elemField.setXmlName(new javax.xml.namespace.QName("java:com.usky", "ft2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tc1");
        elemField.setXmlName(new javax.xml.namespace.QName("java:com.usky", "tc1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tc2");
        elemField.setXmlName(new javax.xml.namespace.QName("java:com.usky", "tc2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("java:com.usky", "type"));
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
