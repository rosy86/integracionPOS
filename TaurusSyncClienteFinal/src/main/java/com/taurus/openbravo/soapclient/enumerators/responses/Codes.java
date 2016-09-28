/**
 * Codes.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.taurus.openbravo.soapclient.enumerators.responses;

public class Codes implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected Codes(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _OK = "OK";
    public static final java.lang.String _Unauthorized = "Unauthorized";
    public static final java.lang.String _BadRequest = "BadRequest";
    public static final java.lang.String _Conflict = "Conflict";
    public static final java.lang.String _InternalServerError = "InternalServerError";
    public static final java.lang.String _ServiceUnavailable = "ServiceUnavailable";
    public static final java.lang.String _NotImplemented = "NotImplemented";
    public static final java.lang.String _Found = "Found";
    public static final java.lang.String _NotFound = "NotFound";
    public static final Codes OK = new Codes(_OK);
    public static final Codes Unauthorized = new Codes(_Unauthorized);
    public static final Codes BadRequest = new Codes(_BadRequest);
    public static final Codes Conflict = new Codes(_Conflict);
    public static final Codes InternalServerError = new Codes(_InternalServerError);
    public static final Codes ServiceUnavailable = new Codes(_ServiceUnavailable);
    public static final Codes NotImplemented = new Codes(_NotImplemented);
    public static final Codes Found = new Codes(_Found);
    public static final Codes NotFound = new Codes(_NotFound);
    public java.lang.String getValue() { return _value_;}
    public static Codes fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        Codes enumeration = (Codes)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static Codes fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(Codes.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/creaworlds.Framework.Enumerators.Responses", "Codes"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
