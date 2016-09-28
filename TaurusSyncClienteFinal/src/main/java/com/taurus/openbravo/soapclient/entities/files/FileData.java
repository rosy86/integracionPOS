/**
 * FileData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.taurus.openbravo.soapclient.entities.files;

public class FileData  extends com.taurus.openbravo.soapclient.entities.files.FileBase  implements java.io.Serializable {
    private java.lang.String checkSum;

    private java.lang.String data;

    private java.lang.String ID;

    public FileData() {
    }

    public FileData(
           java.lang.String key,
           java.lang.Long length,
           java.lang.String mimeType,
           java.lang.String name,
           java.lang.String checkSum,
           java.lang.String data,
           java.lang.String ID) {
        super(
            key,
            length,
            mimeType,
            name);
        this.checkSum = checkSum;
        this.data = data;
        this.ID = ID;
    }


    /**
     * Gets the checkSum value for this FileData.
     * 
     * @return checkSum
     */
    public java.lang.String getCheckSum() {
        return checkSum;
    }


    /**
     * Sets the checkSum value for this FileData.
     * 
     * @param checkSum
     */
    public void setCheckSum(java.lang.String checkSum) {
        this.checkSum = checkSum;
    }


    /**
     * Gets the data value for this FileData.
     * 
     * @return data
     */
    public java.lang.String getData() {
        return data;
    }


    /**
     * Sets the data value for this FileData.
     * 
     * @param data
     */
    public void setData(java.lang.String data) {
        this.data = data;
    }


    /**
     * Gets the ID value for this FileData.
     * 
     * @return ID
     */
    public java.lang.String getID() {
        return ID;
    }


    /**
     * Sets the ID value for this FileData.
     * 
     * @param ID
     */
    public void setID(java.lang.String ID) {
        this.ID = ID;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FileData)) return false;
        FileData other = (FileData) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.checkSum==null && other.getCheckSum()==null) || 
             (this.checkSum!=null &&
              this.checkSum.equals(other.getCheckSum()))) &&
            ((this.data==null && other.getData()==null) || 
             (this.data!=null &&
              this.data.equals(other.getData()))) &&
            ((this.ID==null && other.getID()==null) || 
             (this.ID!=null &&
              this.ID.equals(other.getID())));
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
        if (getCheckSum() != null) {
            _hashCode += getCheckSum().hashCode();
        }
        if (getData() != null) {
            _hashCode += getData().hashCode();
        }
        if (getID() != null) {
            _hashCode += getID().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FileData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/GrupoTaurus.Framework.DataSynchronizer.Entities.Files", "FileData"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("checkSum");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/GrupoTaurus.Framework.DataSynchronizer.Entities.Files", "CheckSum"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("data");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/GrupoTaurus.Framework.DataSynchronizer.Entities.Files", "Data"));
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
