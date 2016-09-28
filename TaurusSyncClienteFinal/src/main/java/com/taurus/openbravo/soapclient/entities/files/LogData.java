/**
 * LogData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.taurus.openbravo.soapclient.entities.files;

public class LogData  implements java.io.Serializable {
    private java.util.Calendar date;

    private java.lang.String fileID;

    private java.lang.String fileKey;

    private java.lang.Long fileLength;

    private java.lang.String fileName;

    private java.lang.String ID;

    private java.lang.String mimeType;

    private java.lang.String userName;

    public LogData() {
    }

    public LogData(
           java.util.Calendar date,
           java.lang.String fileID,
           java.lang.String fileKey,
           java.lang.Long fileLength,
           java.lang.String fileName,
           java.lang.String ID,
           java.lang.String mimeType,
           java.lang.String userName) {
           this.date = date;
           this.fileID = fileID;
           this.fileKey = fileKey;
           this.fileLength = fileLength;
           this.fileName = fileName;
           this.ID = ID;
           this.mimeType = mimeType;
           this.userName = userName;
    }


    /**
     * Gets the date value for this LogData.
     * 
     * @return date
     */
    public java.util.Calendar getDate() {
        return date;
    }


    /**
     * Sets the date value for this LogData.
     * 
     * @param date
     */
    public void setDate(java.util.Calendar date) {
        this.date = date;
    }


    /**
     * Gets the fileID value for this LogData.
     * 
     * @return fileID
     */
    public java.lang.String getFileID() {
        return fileID;
    }


    /**
     * Sets the fileID value for this LogData.
     * 
     * @param fileID
     */
    public void setFileID(java.lang.String fileID) {
        this.fileID = fileID;
    }


    /**
     * Gets the fileKey value for this LogData.
     * 
     * @return fileKey
     */
    public java.lang.String getFileKey() {
        return fileKey;
    }


    /**
     * Sets the fileKey value for this LogData.
     * 
     * @param fileKey
     */
    public void setFileKey(java.lang.String fileKey) {
        this.fileKey = fileKey;
    }


    /**
     * Gets the fileLength value for this LogData.
     * 
     * @return fileLength
     */
    public java.lang.Long getFileLength() {
        return fileLength;
    }


    /**
     * Sets the fileLength value for this LogData.
     * 
     * @param fileLength
     */
    public void setFileLength(java.lang.Long fileLength) {
        this.fileLength = fileLength;
    }


    /**
     * Gets the fileName value for this LogData.
     * 
     * @return fileName
     */
    public java.lang.String getFileName() {
        return fileName;
    }


    /**
     * Sets the fileName value for this LogData.
     * 
     * @param fileName
     */
    public void setFileName(java.lang.String fileName) {
        this.fileName = fileName;
    }


    /**
     * Gets the ID value for this LogData.
     * 
     * @return ID
     */
    public java.lang.String getID() {
        return ID;
    }


    /**
     * Sets the ID value for this LogData.
     * 
     * @param ID
     */
    public void setID(java.lang.String ID) {
        this.ID = ID;
    }


    /**
     * Gets the mimeType value for this LogData.
     * 
     * @return mimeType
     */
    public java.lang.String getMimeType() {
        return mimeType;
    }


    /**
     * Sets the mimeType value for this LogData.
     * 
     * @param mimeType
     */
    public void setMimeType(java.lang.String mimeType) {
        this.mimeType = mimeType;
    }


    /**
     * Gets the userName value for this LogData.
     * 
     * @return userName
     */
    public java.lang.String getUserName() {
        return userName;
    }


    /**
     * Sets the userName value for this LogData.
     * 
     * @param userName
     */
    public void setUserName(java.lang.String userName) {
        this.userName = userName;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LogData)) return false;
        LogData other = (LogData) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.date==null && other.getDate()==null) || 
             (this.date!=null &&
              this.date.equals(other.getDate()))) &&
            ((this.fileID==null && other.getFileID()==null) || 
             (this.fileID!=null &&
              this.fileID.equals(other.getFileID()))) &&
            ((this.fileKey==null && other.getFileKey()==null) || 
             (this.fileKey!=null &&
              this.fileKey.equals(other.getFileKey()))) &&
            ((this.fileLength==null && other.getFileLength()==null) || 
             (this.fileLength!=null &&
              this.fileLength.equals(other.getFileLength()))) &&
            ((this.fileName==null && other.getFileName()==null) || 
             (this.fileName!=null &&
              this.fileName.equals(other.getFileName()))) &&
            ((this.ID==null && other.getID()==null) || 
             (this.ID!=null &&
              this.ID.equals(other.getID()))) &&
            ((this.mimeType==null && other.getMimeType()==null) || 
             (this.mimeType!=null &&
              this.mimeType.equals(other.getMimeType()))) &&
            ((this.userName==null && other.getUserName()==null) || 
             (this.userName!=null &&
              this.userName.equals(other.getUserName())));
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
        if (getDate() != null) {
            _hashCode += getDate().hashCode();
        }
        if (getFileID() != null) {
            _hashCode += getFileID().hashCode();
        }
        if (getFileKey() != null) {
            _hashCode += getFileKey().hashCode();
        }
        if (getFileLength() != null) {
            _hashCode += getFileLength().hashCode();
        }
        if (getFileName() != null) {
            _hashCode += getFileName().hashCode();
        }
        if (getID() != null) {
            _hashCode += getID().hashCode();
        }
        if (getMimeType() != null) {
            _hashCode += getMimeType().hashCode();
        }
        if (getUserName() != null) {
            _hashCode += getUserName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(LogData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/GrupoTaurus.Framework.DataSynchronizer.Entities.Files", "LogData"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("date");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/GrupoTaurus.Framework.DataSynchronizer.Entities.Files", "Date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fileLength");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/GrupoTaurus.Framework.DataSynchronizer.Entities.Files", "FileLength"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fileName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/GrupoTaurus.Framework.DataSynchronizer.Entities.Files", "FileName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/GrupoTaurus.Framework.DataSynchronizer.Entities.Files", "ID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mimeType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/GrupoTaurus.Framework.DataSynchronizer.Entities.Files", "MimeType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/GrupoTaurus.Framework.DataSynchronizer.Entities.Files", "UserName"));
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
