/**
 * DownloadFileBase.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.taurus.openbravo.soapclient.entities.files;

public class DownloadFileBase  implements java.io.Serializable {
    private java.lang.String fileID;

    private java.lang.String fileKey;

    public DownloadFileBase() {
    }

    public DownloadFileBase(
           java.lang.String fileID,
           java.lang.String fileKey) {
           this.fileID = fileID;
           this.fileKey = fileKey;
    }


    /**
     * Gets the fileID value for this DownloadFileBase.
     * 
     * @return fileID
     */
    public java.lang.String getFileID() {
        return fileID;
    }


    /**
     * Sets the fileID value for this DownloadFileBase.
     * 
     * @param fileID
     */
    public void setFileID(java.lang.String fileID) {
        this.fileID = fileID;
    }


    /**
     * Gets the fileKey value for this DownloadFileBase.
     * 
     * @return fileKey
     */
    public java.lang.String getFileKey() {
        return fileKey;
    }


    /**
     * Sets the fileKey value for this DownloadFileBase.
     * 
     * @param fileKey
     */
    public void setFileKey(java.lang.String fileKey) {
        this.fileKey = fileKey;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DownloadFileBase)) return false;
        DownloadFileBase other = (DownloadFileBase) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.fileID==null && other.getFileID()==null) || 
             (this.fileID!=null &&
              this.fileID.equals(other.getFileID()))) &&
            ((this.fileKey==null && other.getFileKey()==null) || 
             (this.fileKey!=null &&
              this.fileKey.equals(other.getFileKey())));
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
        if (getFileID() != null) {
            _hashCode += getFileID().hashCode();
        }
        if (getFileKey() != null) {
            _hashCode += getFileKey().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DownloadFileBase.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/GrupoTaurus.Framework.DataSynchronizer.Entities.Files", "DownloadFileBase"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fileID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/GrupoTaurus.Framework.DataSynchronizer.Entities.Files", "FileID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fileKey");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/GrupoTaurus.Framework.DataSynchronizer.Entities.Files", "FileKey"));
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
