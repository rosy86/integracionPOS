/**
 * UploadFileRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.taurus.openbravo.soapclient.entities.files;

public class UploadFileRequest  extends com.taurus.openbravo.soapclient.entities.files.UploadFileBase  implements java.io.Serializable {
    private com.taurus.openbravo.soapclient.entities.security.CredentialData credentials;

    private com.taurus.openbravo.soapclient.entities.files.FileData fileData;

    public UploadFileRequest() {
    }

    public UploadFileRequest(
           java.lang.String fileKey,
           com.taurus.openbravo.soapclient.entities.security.CredentialData credentials,
           com.taurus.openbravo.soapclient.entities.files.FileData fileData) {
        super(
            fileKey);
        this.credentials = credentials;
        this.fileData = fileData;
    }


    /**
     * Gets the credentials value for this UploadFileRequest.
     * 
     * @return credentials
     */
    public com.taurus.openbravo.soapclient.entities.security.CredentialData getCredentials() {
        return credentials;
    }


    /**
     * Sets the credentials value for this UploadFileRequest.
     * 
     * @param credentials
     */
    public void setCredentials(com.taurus.openbravo.soapclient.entities.security.CredentialData credentials) {
        this.credentials = credentials;
    }


    /**
     * Gets the fileData value for this UploadFileRequest.
     * 
     * @return fileData
     */
    public com.taurus.openbravo.soapclient.entities.files.FileData getFileData() {
        return fileData;
    }


    /**
     * Sets the fileData value for this UploadFileRequest.
     * 
     * @param fileData
     */
    public void setFileData(com.taurus.openbravo.soapclient.entities.files.FileData fileData) {
        this.fileData = fileData;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UploadFileRequest)) return false;
        UploadFileRequest other = (UploadFileRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.credentials==null && other.getCredentials()==null) || 
             (this.credentials!=null &&
              this.credentials.equals(other.getCredentials()))) &&
            ((this.fileData==null && other.getFileData()==null) || 
             (this.fileData!=null &&
              this.fileData.equals(other.getFileData())));
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
        if (getCredentials() != null) {
            _hashCode += getCredentials().hashCode();
        }
        if (getFileData() != null) {
            _hashCode += getFileData().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UploadFileRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/GrupoTaurus.Framework.DataSynchronizer.Entities.Files", "UploadFileRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("credentials");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/GrupoTaurus.Framework.DataSynchronizer.Entities.Files", "Credentials"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/GrupoTaurus.Framework.DataSynchronizer.Entities.Security", "CredentialData"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fileData");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/GrupoTaurus.Framework.DataSynchronizer.Entities.Files", "FileData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/GrupoTaurus.Framework.DataSynchronizer.Entities.Files", "FileData"));
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
