/**
 * QuickRegisterInput.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.usky.test.easternmiles.io;

public class QuickRegisterInput  implements java.io.Serializable {
    private java.lang.String em;

    private java.lang.String fn;

    private java.lang.String gn;

    private java.lang.String id;

    private java.lang.String idt;

    private java.lang.String mp;

    private java.lang.String pf;

    private java.lang.String pg;

    private java.lang.String sf;

    private java.lang.String uid;

    public QuickRegisterInput() {
    }

    public QuickRegisterInput(
           java.lang.String em,
           java.lang.String fn,
           java.lang.String gn,
           java.lang.String id,
           java.lang.String idt,
           java.lang.String mp,
           java.lang.String pf,
           java.lang.String pg,
           java.lang.String sf,
           java.lang.String uid) {
           this.em = em;
           this.fn = fn;
           this.gn = gn;
           this.id = id;
           this.idt = idt;
           this.mp = mp;
           this.pf = pf;
           this.pg = pg;
           this.sf = sf;
           this.uid = uid;
    }


    /**
     * Gets the em value for this QuickRegisterInput.
     * 
     * @return em
     */
    public java.lang.String getEm() {
        return em;
    }


    /**
     * Sets the em value for this QuickRegisterInput.
     * 
     * @param em
     */
    public void setEm(java.lang.String em) {
        this.em = em;
    }


    /**
     * Gets the fn value for this QuickRegisterInput.
     * 
     * @return fn
     */
    public java.lang.String getFn() {
        return fn;
    }


    /**
     * Sets the fn value for this QuickRegisterInput.
     * 
     * @param fn
     */
    public void setFn(java.lang.String fn) {
        this.fn = fn;
    }


    /**
     * Gets the gn value for this QuickRegisterInput.
     * 
     * @return gn
     */
    public java.lang.String getGn() {
        return gn;
    }


    /**
     * Sets the gn value for this QuickRegisterInput.
     * 
     * @param gn
     */
    public void setGn(java.lang.String gn) {
        this.gn = gn;
    }


    /**
     * Gets the id value for this QuickRegisterInput.
     * 
     * @return id
     */
    public java.lang.String getId() {
        return id;
    }


    /**
     * Sets the id value for this QuickRegisterInput.
     * 
     * @param id
     */
    public void setId(java.lang.String id) {
        this.id = id;
    }


    /**
     * Gets the idt value for this QuickRegisterInput.
     * 
     * @return idt
     */
    public java.lang.String getIdt() {
        return idt;
    }


    /**
     * Sets the idt value for this QuickRegisterInput.
     * 
     * @param idt
     */
    public void setIdt(java.lang.String idt) {
        this.idt = idt;
    }


    /**
     * Gets the mp value for this QuickRegisterInput.
     * 
     * @return mp
     */
    public java.lang.String getMp() {
        return mp;
    }


    /**
     * Sets the mp value for this QuickRegisterInput.
     * 
     * @param mp
     */
    public void setMp(java.lang.String mp) {
        this.mp = mp;
    }


    /**
     * Gets the pf value for this QuickRegisterInput.
     * 
     * @return pf
     */
    public java.lang.String getPf() {
        return pf;
    }


    /**
     * Sets the pf value for this QuickRegisterInput.
     * 
     * @param pf
     */
    public void setPf(java.lang.String pf) {
        this.pf = pf;
    }


    /**
     * Gets the pg value for this QuickRegisterInput.
     * 
     * @return pg
     */
    public java.lang.String getPg() {
        return pg;
    }


    /**
     * Sets the pg value for this QuickRegisterInput.
     * 
     * @param pg
     */
    public void setPg(java.lang.String pg) {
        this.pg = pg;
    }


    /**
     * Gets the sf value for this QuickRegisterInput.
     * 
     * @return sf
     */
    public java.lang.String getSf() {
        return sf;
    }


    /**
     * Sets the sf value for this QuickRegisterInput.
     * 
     * @param sf
     */
    public void setSf(java.lang.String sf) {
        this.sf = sf;
    }


    /**
     * Gets the uid value for this QuickRegisterInput.
     * 
     * @return uid
     */
    public java.lang.String getUid() {
        return uid;
    }


    /**
     * Sets the uid value for this QuickRegisterInput.
     * 
     * @param uid
     */
    public void setUid(java.lang.String uid) {
        this.uid = uid;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof QuickRegisterInput)) return false;
        QuickRegisterInput other = (QuickRegisterInput) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.em==null && other.getEm()==null) || 
             (this.em!=null &&
              this.em.equals(other.getEm()))) &&
            ((this.fn==null && other.getFn()==null) || 
             (this.fn!=null &&
              this.fn.equals(other.getFn()))) &&
            ((this.gn==null && other.getGn()==null) || 
             (this.gn!=null &&
              this.gn.equals(other.getGn()))) &&
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.idt==null && other.getIdt()==null) || 
             (this.idt!=null &&
              this.idt.equals(other.getIdt()))) &&
            ((this.mp==null && other.getMp()==null) || 
             (this.mp!=null &&
              this.mp.equals(other.getMp()))) &&
            ((this.pf==null && other.getPf()==null) || 
             (this.pf!=null &&
              this.pf.equals(other.getPf()))) &&
            ((this.pg==null && other.getPg()==null) || 
             (this.pg!=null &&
              this.pg.equals(other.getPg()))) &&
            ((this.sf==null && other.getSf()==null) || 
             (this.sf!=null &&
              this.sf.equals(other.getSf()))) &&
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
        if (getEm() != null) {
            _hashCode += getEm().hashCode();
        }
        if (getFn() != null) {
            _hashCode += getFn().hashCode();
        }
        if (getGn() != null) {
            _hashCode += getGn().hashCode();
        }
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getIdt() != null) {
            _hashCode += getIdt().hashCode();
        }
        if (getMp() != null) {
            _hashCode += getMp().hashCode();
        }
        if (getPf() != null) {
            _hashCode += getPf().hashCode();
        }
        if (getPg() != null) {
            _hashCode += getPg().hashCode();
        }
        if (getSf() != null) {
            _hashCode += getSf().hashCode();
        }
        if (getUid() != null) {
            _hashCode += getUid().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(QuickRegisterInput.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("java:com.usky", "QuickRegisterInput"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("em");
        elemField.setXmlName(new javax.xml.namespace.QName("java:com.usky", "em"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fn");
        elemField.setXmlName(new javax.xml.namespace.QName("java:com.usky", "fn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gn");
        elemField.setXmlName(new javax.xml.namespace.QName("java:com.usky", "gn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("java:com.usky", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idt");
        elemField.setXmlName(new javax.xml.namespace.QName("java:com.usky", "idt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mp");
        elemField.setXmlName(new javax.xml.namespace.QName("java:com.usky", "mp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pf");
        elemField.setXmlName(new javax.xml.namespace.QName("java:com.usky", "pf"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pg");
        elemField.setXmlName(new javax.xml.namespace.QName("java:com.usky", "pg"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sf");
        elemField.setXmlName(new javax.xml.namespace.QName("java:com.usky", "sf"));
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
