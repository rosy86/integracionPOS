/**
 * ResponseBase.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.taurus.openbravo.soapclient.entities.responses;

public class ResponseBase  implements java.io.Serializable {
    private com.taurus.openbravo.soapclient.enumerators.responses.Codes codeName;

    private java.lang.Integer codeNumber;

    private java.lang.Integer errorNumber;

    private java.lang.String message;

    private java.lang.String serverName;

    public ResponseBase() {
    }

    public ResponseBase(
           com.taurus.openbravo.soapclient.enumerators.responses.Codes codeName,
           java.lang.Integer codeNumber,
           java.lang.Integer errorNumber,
           java.lang.String message,
           java.lang.String serverName) {
           this.codeName = codeName;
           this.codeNumber = codeNumber;
           this.errorNumber = errorNumber;
           this.message = message;
           this.serverName = serverName;
    }


    /**
     * Gets the codeName value for this ResponseBase.
     * 
     * @return codeName
     */
    public com.taurus.openbravo.soapclient.enumerators.responses.Codes getCodeName() {
        return codeName;
    }


    /**
     * Sets the codeName value for this ResponseBase.
     * 
     * @param codeName
     */
    public void setCodeName(com.taurus.openbravo.soapclient.enumerators.responses.Codes codeName) {
        this.codeName = codeName;
    }


    /**
     * Gets the codeNumber value for this ResponseBase.
     * 
     * @return codeNumber
     */
    public java.lang.Integer getCodeNumber() {
        return codeNumber;
    }


    /**
     * Sets the codeNumber value for this ResponseBase.
     * 
     * @param codeNumber
     */
    public void setCodeNumber(java.lang.Integer codeNumber) {
        this.codeNumber = codeNumber;
    }


    /**
     * Gets the errorNumber value for this ResponseBase.
     * 
     * @return errorNumber
     */
    public java.lang.Integer getErrorNumber() {
        return errorNumber;
    }


    /**
     * Sets the errorNumber value for this ResponseBase.
     * 
     * @param errorNumber
     */
    public void setErrorNumber(java.lang.Integer errorNumber) {
        this.errorNumber = errorNumber;
    }


    /**
     * Gets the message value for this ResponseBase.
     * 
     * @return message
     */
    public java.lang.String getMessage() {
        return message;
    }


    /**
     * Sets the message value for this ResponseBase.
     * 
     * @param message
     */
    public void setMessage(java.lang.String message) {
        this.message = message;
    }


    /**
     * Gets the serverName value for this ResponseBase.
     * 
     * @return serverName
     */
    public java.lang.String getServerName() {
        return serverName;
    }


    /**
     * Sets the serverName value for this ResponseBase.
     * 
     * @param serverName
     */
    public void setServerName(java.lang.String serverName) {
        this.serverName = serverName;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ResponseBase)) return false;
        ResponseBase other = (ResponseBase) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.codeName==null && other.getCodeName()==null) || 
             (this.codeName!=null &&
              this.codeName.equals(other.getCodeName()))) &&
            ((this.codeNumber==null && other.getCodeNumber()==null) || 
             (this.codeNumber!=null &&
              this.codeNumber.equals(other.getCodeNumber()))) &&
            ((this.errorNumber==null && other.getErrorNumber()==null) || 
             (this.errorNumber!=null &&
              this.errorNumber.equals(other.getErrorNumber()))) &&
            ((this.message==null && other.getMessage()==null) || 
             (this.message!=null &&
              this.message.equals(other.getMessage()))) &&
            ((this.serverName==null && other.getServerName()==null) || 
             (this.serverName!=null &&
              this.serverName.equals(other.getServerName())));
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
        if (getCodeName() != null) {
            _hashCode += getCodeName().hashCode();
        }
        if (getCodeNumber() != null) {
            _hashCode += getCodeNumber().hashCode();
        }
        if (getErrorNumber() != null) {
            _hashCode += getErrorNumber().hashCode();
        }
        if (getMessage() != null) {
            _hashCode += getMessage().hashCode();
        }
        if (getServerName() != null) {
            _hashCode += getServerName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ResponseBase.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/creaworlds.Framework.Entities.Responses", "ResponseBase"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codeName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/creaworlds.Framework.Entities.Responses", "CodeName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/creaworlds.Framework.Enumerators.Responses", "Codes"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codeNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/creaworlds.Framework.Entities.Responses", "CodeNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("errorNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/creaworlds.Framework.Entities.Responses", "ErrorNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("message");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/creaworlds.Framework.Entities.Responses", "Message"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serverName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/creaworlds.Framework.Entities.Responses", "ServerName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
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
