/**
 * ShowLogRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.taurus.openbravo.soapclient.entities.files;

public class ShowLogRequest  implements java.io.Serializable {
    private com.taurus.openbravo.soapclient.entities.security.CredentialData credentials;

    private java.util.Calendar logDate;

    public ShowLogRequest() {
    }

    public ShowLogRequest(
           com.taurus.openbravo.soapclient.entities.security.CredentialData credentials,
           java.util.Calendar logDate) {
           this.credentials = credentials;
           this.logDate = logDate;
    }


    /**
     * Gets the credentials value for this ShowLogRequest.
     * 
     * @return credentials
     */
    public com.taurus.openbravo.soapclient.entities.security.CredentialData getCredentials() {
        return credentials;
    }


    /**
     * Sets the credentials value for this ShowLogRequest.
     * 
     * @param credentials
     */
    public void setCredentials(com.taurus.openbravo.soapclient.entities.security.CredentialData credentials) {
        this.credentials = credentials;
    }


    /**
     * Gets the logDate value for this ShowLogRequest.
     * 
     * @return logDate
     */
    public java.util.Calendar getLogDate() {
        return logDate;
    }


    /**
     * Sets the logDate value for this ShowLogRequest.
     * 
     * @param logDate
     */
    public void setLogDate(java.util.Calendar logDate) {
        this.logDate = logDate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ShowLogRequest)) return false;
        ShowLogRequest other = (ShowLogRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.credentials==null && other.getCredentials()==null) || 
             (this.credentials!=null &&
              this.credentials.equals(other.getCredentials()))) &&
            ((this.logDate==null && other.getLogDate()==null) || 
             (this.logDate!=null &&
              this.logDate.equals(other.getLogDate())));
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
        if (getCredentials() != null) {
            _hashCode += getCredentials().hashCode();
        }
        if (getLogDate() != null) {
            _hashCode += getLogDate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ShowLogRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/GrupoTaurus.Framework.DataSynchronizer.Entities.Files", "ShowLogRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("credentials");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/GrupoTaurus.Framework.DataSynchronizer.Entities.Files", "Credentials"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/GrupoTaurus.Framework.DataSynchronizer.Entities.Security", "CredentialData"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("logDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/GrupoTaurus.Framework.DataSynchronizer.Entities.Files", "LogDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
