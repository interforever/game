/**
 * ApplicationStatus.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class ApplicationStatus implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected ApplicationStatus(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _NotExist = "NotExist";
    public static final java.lang.String _Unsubmitted = "Unsubmitted";
    public static final java.lang.String _Pending = "Pending";
    public static final java.lang.String _Approved = "Approved";
    public static final java.lang.String _Rejected = "Rejected";
    public static final java.lang.String _Canceled = "Canceled";
    public static final java.lang.String _Template = "Template";
    public static final java.lang.String _ToPay = "ToPay";
    public static final ApplicationStatus NotExist = new ApplicationStatus(_NotExist);
    public static final ApplicationStatus Unsubmitted = new ApplicationStatus(_Unsubmitted);
    public static final ApplicationStatus Pending = new ApplicationStatus(_Pending);
    public static final ApplicationStatus Approved = new ApplicationStatus(_Approved);
    public static final ApplicationStatus Rejected = new ApplicationStatus(_Rejected);
    public static final ApplicationStatus Canceled = new ApplicationStatus(_Canceled);
    public static final ApplicationStatus Template = new ApplicationStatus(_Template);
    public static final ApplicationStatus ToPay = new ApplicationStatus(_ToPay);
    public java.lang.String getValue() { return _value_;}
    public static ApplicationStatus fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        ApplicationStatus enumeration = (ApplicationStatus)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static ApplicationStatus fromString(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        return fromValue(value);
    }
    public boolean equals(java.lang.Object obj) {return (obj == this);}
    public int hashCode() { return toString().hashCode();}
    public java.lang.String toString() { return _value_;}
    public java.lang.Object readResolve() throws java.io.ObjectStreamException { return fromValue(_value_);}
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumSerializer(
            _javaType, _xmlType);
    }
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumDeserializer(
            _javaType, _xmlType);
    }
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ApplicationStatus.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "ApplicationStatus"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
