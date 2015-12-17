/**
 * MemberPointsInput.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.test.webservice.client;

public class MemberPointsInput  implements java.io.Serializable {
    private java.lang.String c;

    private java.lang.String cid;

    private java.lang.String d;

    private java.lang.String et;

    private java.lang.String f;

    private java.lang.String pn;

    private java.lang.String pnr;

    private java.lang.String s;

    private java.lang.String tn;

    private java.lang.String uid;

    public MemberPointsInput() {
    }

    public MemberPointsInput(
           java.lang.String c,
           java.lang.String cid,
           java.lang.String d,
           java.lang.String et,
           java.lang.String f,
           java.lang.String pn,
           java.lang.String pnr,
           java.lang.String s,
           java.lang.String tn,
           java.lang.String uid) {
           this.c = c;
           this.cid = cid;
           this.d = d;
           this.et = et;
           this.f = f;
           this.pn = pn;
           this.pnr = pnr;
           this.s = s;
           this.tn = tn;
           this.uid = uid;
    }


    /**
     * Gets the c value for this MemberPointsInput.
     * 
     * @return c
     */
    public java.lang.String getC() {
        return c;
    }


    /**
     * Sets the c value for this MemberPointsInput.
     * 
     * @param c
     */
    public void setC(java.lang.String c) {
        this.c = c;
    }


    /**
     * Gets the cid value for this MemberPointsInput.
     * 
     * @return cid
     */
    public java.lang.String getCid() {
        return cid;
    }


    /**
     * Sets the cid value for this MemberPointsInput.
     * 
     * @param cid
     */
    public void setCid(java.lang.String cid) {
        this.cid = cid;
    }


    /**
     * Gets the d value for this MemberPointsInput.
     * 
     * @return d
     */
    public java.lang.String getD() {
        return d;
    }


    /**
     * Sets the d value for this MemberPointsInput.
     * 
     * @param d
     */
    public void setD(java.lang.String d) {
        this.d = d;
    }


    /**
     * Gets the et value for this MemberPointsInput.
     * 
     * @return et
     */
    public java.lang.String getEt() {
        return et;
    }


    /**
     * Sets the et value for this MemberPointsInput.
     * 
     * @param et
     */
    public void setEt(java.lang.String et) {
        this.et = et;
    }


    /**
     * Gets the f value for this MemberPointsInput.
     * 
     * @return f
     */
    public java.lang.String getF() {
        return f;
    }


    /**
     * Sets the f value for this MemberPointsInput.
     * 
     * @param f
     */
    public void setF(java.lang.String f) {
        this.f = f;
    }


    /**
     * Gets the pn value for this MemberPointsInput.
     * 
     * @return pn
     */
    public java.lang.String getPn() {
        return pn;
    }


    /**
     * Sets the pn value for this MemberPointsInput.
     * 
     * @param pn
     */
    public void setPn(java.lang.String pn) {
        this.pn = pn;
    }


    /**
     * Gets the pnr value for this MemberPointsInput.
     * 
     * @return pnr
     */
    public java.lang.String getPnr() {
        return pnr;
    }


    /**
     * Sets the pnr value for this MemberPointsInput.
     * 
     * @param pnr
     */
    public void setPnr(java.lang.String pnr) {
        this.pnr = pnr;
    }


    /**
     * Gets the s value for this MemberPointsInput.
     * 
     * @return s
     */
    public java.lang.String getS() {
        return s;
    }


    /**
     * Sets the s value for this MemberPointsInput.
     * 
     * @param s
     */
    public void setS(java.lang.String s) {
        this.s = s;
    }


    /**
     * Gets the tn value for this MemberPointsInput.
     * 
     * @return tn
     */
    public java.lang.String getTn() {
        return tn;
    }


    /**
     * Sets the tn value for this MemberPointsInput.
     * 
     * @param tn
     */
    public void setTn(java.lang.String tn) {
        this.tn = tn;
    }


    /**
     * Gets the uid value for this MemberPointsInput.
     * 
     * @return uid
     */
    public java.lang.String getUid() {
        return uid;
    }


    /**
     * Sets the uid value for this MemberPointsInput.
     * 
     * @param uid
     */
    public void setUid(java.lang.String uid) {
        this.uid = uid;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MemberPointsInput)) return false;
        MemberPointsInput other = (MemberPointsInput) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.c==null && other.getC()==null) || 
             (this.c!=null &&
              this.c.equals(other.getC()))) &&
            ((this.cid==null && other.getCid()==null) || 
             (this.cid!=null &&
              this.cid.equals(other.getCid()))) &&
            ((this.d==null && other.getD()==null) || 
             (this.d!=null &&
              this.d.equals(other.getD()))) &&
            ((this.et==null && other.getEt()==null) || 
             (this.et!=null &&
              this.et.equals(other.getEt()))) &&
            ((this.f==null && other.getF()==null) || 
             (this.f!=null &&
              this.f.equals(other.getF()))) &&
            ((this.pn==null && other.getPn()==null) || 
             (this.pn!=null &&
              this.pn.equals(other.getPn()))) &&
            ((this.pnr==null && other.getPnr()==null) || 
             (this.pnr!=null &&
              this.pnr.equals(other.getPnr()))) &&
            ((this.s==null && other.getS()==null) || 
             (this.s!=null &&
              this.s.equals(other.getS()))) &&
            ((this.tn==null && other.getTn()==null) || 
             (this.tn!=null &&
              this.tn.equals(other.getTn()))) &&
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
        if (getC() != null) {
            _hashCode += getC().hashCode();
        }
        if (getCid() != null) {
            _hashCode += getCid().hashCode();
        }
        if (getD() != null) {
            _hashCode += getD().hashCode();
        }
        if (getEt() != null) {
            _hashCode += getEt().hashCode();
        }
        if (getF() != null) {
            _hashCode += getF().hashCode();
        }
        if (getPn() != null) {
            _hashCode += getPn().hashCode();
        }
        if (getPnr() != null) {
            _hashCode += getPnr().hashCode();
        }
        if (getS() != null) {
            _hashCode += getS().hashCode();
        }
        if (getTn() != null) {
            _hashCode += getTn().hashCode();
        }
        if (getUid() != null) {
            _hashCode += getUid().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MemberPointsInput.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("java:com.usky", "MemberPointsInput"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("c");
        elemField.setXmlName(new javax.xml.namespace.QName("java:com.usky", "c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cid");
        elemField.setXmlName(new javax.xml.namespace.QName("java:com.usky", "cid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("d");
        elemField.setXmlName(new javax.xml.namespace.QName("java:com.usky", "d"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("et");
        elemField.setXmlName(new javax.xml.namespace.QName("java:com.usky", "et"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("f");
        elemField.setXmlName(new javax.xml.namespace.QName("java:com.usky", "f"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pn");
        elemField.setXmlName(new javax.xml.namespace.QName("java:com.usky", "pn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pnr");
        elemField.setXmlName(new javax.xml.namespace.QName("java:com.usky", "pnr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("s");
        elemField.setXmlName(new javax.xml.namespace.QName("java:com.usky", "s"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tn");
        elemField.setXmlName(new javax.xml.namespace.QName("java:com.usky", "tn"));
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
