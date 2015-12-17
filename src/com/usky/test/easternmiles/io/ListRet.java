/**
 * ListRet.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.usky.test.easternmiles.io;

public class ListRet  extends com.usky.test.easternmiles.io.InterfaceRet  implements java.io.Serializable {
    private java.lang.String colname;

    private int cols;

    private java.lang.String format;

    private int rows;

    private java.lang.String value;

    public ListRet() {
    }

    public ListRet(
           java.lang.String error,
           java.lang.String flag,
           java.lang.String remark,
           java.lang.String colname,
           int cols,
           java.lang.String format,
           int rows,
           java.lang.String value) {
        super(
            error,
            flag,
            remark);
        this.colname = colname;
        this.cols = cols;
        this.format = format;
        this.rows = rows;
        this.value = value;
    }


    /**
     * Gets the colname value for this ListRet.
     * 
     * @return colname
     */
    public java.lang.String getColname() {
        return colname;
    }


    /**
     * Sets the colname value for this ListRet.
     * 
     * @param colname
     */
    public void setColname(java.lang.String colname) {
        this.colname = colname;
    }


    /**
     * Gets the cols value for this ListRet.
     * 
     * @return cols
     */
    public int getCols() {
        return cols;
    }


    /**
     * Sets the cols value for this ListRet.
     * 
     * @param cols
     */
    public void setCols(int cols) {
        this.cols = cols;
    }


    /**
     * Gets the format value for this ListRet.
     * 
     * @return format
     */
    public java.lang.String getFormat() {
        return format;
    }


    /**
     * Sets the format value for this ListRet.
     * 
     * @param format
     */
    public void setFormat(java.lang.String format) {
        this.format = format;
    }


    /**
     * Gets the rows value for this ListRet.
     * 
     * @return rows
     */
    public int getRows() {
        return rows;
    }


    /**
     * Sets the rows value for this ListRet.
     * 
     * @param rows
     */
    public void setRows(int rows) {
        this.rows = rows;
    }


    /**
     * Gets the value value for this ListRet.
     * 
     * @return value
     */
    public java.lang.String getValue() {
        return value;
    }


    /**
     * Sets the value value for this ListRet.
     * 
     * @param value
     */
    public void setValue(java.lang.String value) {
        this.value = value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ListRet)) return false;
        ListRet other = (ListRet) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.colname==null && other.getColname()==null) || 
             (this.colname!=null &&
              this.colname.equals(other.getColname()))) &&
            this.cols == other.getCols() &&
            ((this.format==null && other.getFormat()==null) || 
             (this.format!=null &&
              this.format.equals(other.getFormat()))) &&
            this.rows == other.getRows() &&
            ((this.value==null && other.getValue()==null) || 
             (this.value!=null &&
              this.value.equals(other.getValue())));
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
        if (getColname() != null) {
            _hashCode += getColname().hashCode();
        }
        _hashCode += getCols();
        if (getFormat() != null) {
            _hashCode += getFormat().hashCode();
        }
        _hashCode += getRows();
        if (getValue() != null) {
            _hashCode += getValue().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ListRet.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("java:com.usky", "ListRet"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("colname");
        elemField.setXmlName(new javax.xml.namespace.QName("java:com.usky", "colname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cols");
        elemField.setXmlName(new javax.xml.namespace.QName("java:com.usky", "cols"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("format");
        elemField.setXmlName(new javax.xml.namespace.QName("java:com.usky", "format"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rows");
        elemField.setXmlName(new javax.xml.namespace.QName("java:com.usky", "rows"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("value");
        elemField.setXmlName(new javax.xml.namespace.QName("java:com.usky", "value"));
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
