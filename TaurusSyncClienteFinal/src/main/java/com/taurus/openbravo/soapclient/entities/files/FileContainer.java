/**
 * FileContainer.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.taurus.openbravo.soapclient.entities.files;

public class FileContainer  extends com.taurus.openbravo.soapclient.entities.files.FileBase  implements java.io.Serializable {
    private java.lang.String ID;

    private java.util.Calendar publishedDate;

    public FileContainer() {
    }

    public FileContainer(
           java.lang.String key,
           java.lang.Long length,
           java.lang.String mimeType,
           java.lang.String name,
           java.lang.String ID,
           java.util.Calendar publishedDate) {
        super(
            key,
            length,
            mimeType,
            name);
        this.ID = ID;
        this.publishedDate = publishedDate;
    }


    /**
     * Gets the ID value for this FileContainer.
     * 
     * @return ID
     */
    public java.lang.String getID() {
        return ID;
    }


    /**
     * Sets the ID value for this FileContainer.
     * 
     * @param ID
     */
    public void setID(java.lang.String ID) {
        this.ID = ID;
    }


    /**
     * Gets the publishedDate value for this FileContainer.
     * 
     * @return publishedDate
     */
    public java.util.Calendar getPublishedDate() {
        return publishedDate;
    }


    /**
     * Sets the publishedDate value for this FileContainer.
     * 
     * @param publishedDate
     */
    public void setPublishedDate(java.util.Calendar publishedDate) {
        this.publishedDate = publishedDate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FileContainer)) return false;
        FileContainer other = (FileContainer) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.ID==null && other.getID()==null) || 
             (this.ID!=null &&
              this.ID.equals(other.getID()))) &&
            ((this.publishedDate==null && other.getPublishedDate()==null) || 
             (this.publishedDate!=null &&
              this.publishedDate.equals(other.getPublishedDate())));
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
        if (getID() != null) {
            _hashCode += getID().hashCode();
        }
        if (getPublishedDate() != null) {
            _hashCode += getPublishedDate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FileContainer.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/GrupoTaurus.Framework.DataSynchronizer.Entities.Files", "FileContainer"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/GrupoTaurus.Framework.DataSynchronizer.Entities.Files", "ID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("publishedDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/GrupoTaurus.Framework.DataSynchronizer.Entities.Files", "PublishedDate"));
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
