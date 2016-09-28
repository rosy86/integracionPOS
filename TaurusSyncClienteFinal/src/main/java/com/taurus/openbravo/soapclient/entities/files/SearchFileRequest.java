/**
 * SearchFileRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.taurus.openbravo.soapclient.entities.files;

import java.io.Serializable;

import com.taurus.openbravo.soapclient.entities.security.CredentialData;

public class SearchFileRequest implements Serializable {
    private CredentialData credentials;

    //private String fileDate;

    private String fileKey;

    public SearchFileRequest() {
    }

    public SearchFileRequest(
           CredentialData credentials,
           //String fileDate,
           String fileKey) {
           this.credentials = credentials;
      //     this.fileDate = fileDate;
           this.fileKey = fileKey;
    }


    /**
     * Gets the credentials value for this SearchFileRequest.
     * 
     * @return credentials
     */
    public CredentialData getCredentials() {
        return credentials;
    }


    /**
     * Sets the credentials value for this SearchFileRequest.
     * 
     * @param credentials
     */
    public void setCredentials(CredentialData credentials) {
        this.credentials = credentials;
    }


    /**
     * Gets the fileDate value for this SearchFileRequest.
     * 
     * @return fileDate
     
    public String getFileDate() {
        return fileDate;
    }
*/

    /**
     * Sets the fileDate value for this SearchFileRequest.
     * 
     * @param fileDate
    
    public void setFileDate(String fileDate) {
        this.fileDate = fileDate;
    }
 */

    /**
     * Gets the fileKey value for this SearchFileRequest.
     * 
     * @return fileKey
     */
    public String getFileKey() {
        return fileKey;
    }


    /**
     * Sets the fileKey value for this SearchFileRequest.
     * 
     * @param fileKey
     */
    public void setFileKey(java.lang.String fileKey) {
        this.fileKey = fileKey;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SearchFileRequest)) return false;
        SearchFileRequest other = (SearchFileRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        /*_equals = true && 
            ((this.credentials==null && other.getCredentials()==null) || 
             (this.credentials!=null &&
              this.credentials.equals(other.getCredentials()))) &&
            ((this.fileDate==null && other.getFileDate()==null) || 
             (this.fileDate!=null &&
              this.fileDate.equals(other.getFileDate()))) &&
            ((this.fileKey==null && other.getFileKey()==null) || 
             (this.fileKey!=null &&
              this.fileKey.equals(other.getFileKey())));*/
        _equals = true && 
                ((this.credentials==null && other.getCredentials()==null) || 
                 (this.credentials!=null &&
                  this.credentials.equals(other.getCredentials()))) &&
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
        if (getCredentials() != null) {
            _hashCode += getCredentials().hashCode();
        }
        /*if (getFileDate() != null) {
            _hashCode += getFileDate().hashCode();
        }*/
        if (getFileKey() != null) {
            _hashCode += getFileKey().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SearchFileRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/GrupoTaurus.Framework.DataSynchronizer.Entities.Files", "SearchFileRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("credentials");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/GrupoTaurus.Framework.DataSynchronizer.Entities.Files", "Credentials"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/GrupoTaurus.Framework.DataSynchronizer.Entities.Security", "CredentialData"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fileDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/GrupoTaurus.Framework.DataSynchronizer.Entities.Files", "FileDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
