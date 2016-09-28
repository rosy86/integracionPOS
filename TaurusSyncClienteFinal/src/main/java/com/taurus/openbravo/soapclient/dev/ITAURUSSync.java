/**
 * ITAURUSSync.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.taurus.openbravo.soapclient.dev;

public interface ITAURUSSync extends java.rmi.Remote {
    public com.taurus.openbravo.soapclient.entities.files.DownloadFileResponse downloadFile(com.taurus.openbravo.soapclient.entities.files.DownloadFileRequest request) throws java.rmi.RemoteException;
    public com.taurus.openbravo.soapclient.entities.files.UploadFileResponse uploadFile(com.taurus.openbravo.soapclient.entities.files.UploadFileRequest request) throws java.rmi.RemoteException;
    public com.taurus.openbravo.soapclient.entities.files.SearchFileResponse searchFile(com.taurus.openbravo.soapclient.entities.files.SearchFileRequest request) throws java.rmi.RemoteException;
    public com.taurus.openbravo.soapclient.entities.files.ShowLogResponse showLog(com.taurus.openbravo.soapclient.entities.files.ShowLogRequest request) throws java.rmi.RemoteException;
    public com.taurus.openbravo.soapclient.entities.files.ProcessingFileResponse processingFile(com.taurus.openbravo.soapclient.entities.files.ProcessingFileRequest request) throws java.rmi.RemoteException;
}
