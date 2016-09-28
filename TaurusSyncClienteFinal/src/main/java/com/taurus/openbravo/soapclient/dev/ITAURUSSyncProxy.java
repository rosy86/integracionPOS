package com.taurus.openbravo.soapclient.dev;

public class ITAURUSSyncProxy implements com.taurus.openbravo.soapclient.dev.ITAURUSSync {
  private String _endpoint = null;
  private com.taurus.openbravo.soapclient.dev.ITAURUSSync iTAURUSSync = null;
  
  public ITAURUSSyncProxy() {
    _initITAURUSSyncProxy();
  }
  
  public ITAURUSSyncProxy(String endpoint) {
    _endpoint = endpoint;
    _initITAURUSSyncProxy();
  }
  
  private void _initITAURUSSyncProxy() {
    try {
      iTAURUSSync = (new com.taurus.openbravo.soapclient.dev.TAURUSSyncLocator()).getBasicHttpBinding_ITAURUSSync();
      if (iTAURUSSync != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)iTAURUSSync)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)iTAURUSSync)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (iTAURUSSync != null)
      ((javax.xml.rpc.Stub)iTAURUSSync)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.taurus.openbravo.soapclient.dev.ITAURUSSync getITAURUSSync() {
    if (iTAURUSSync == null)
      _initITAURUSSyncProxy();
    return iTAURUSSync;
  }
  
  public com.taurus.openbravo.soapclient.entities.files.DownloadFileResponse downloadFile(com.taurus.openbravo.soapclient.entities.files.DownloadFileRequest request) throws java.rmi.RemoteException{
    if (iTAURUSSync == null)
      _initITAURUSSyncProxy();
    return iTAURUSSync.downloadFile(request);
  }
  
  public com.taurus.openbravo.soapclient.entities.files.UploadFileResponse uploadFile(com.taurus.openbravo.soapclient.entities.files.UploadFileRequest request) throws java.rmi.RemoteException{
    if (iTAURUSSync == null)
      _initITAURUSSyncProxy();
    return iTAURUSSync.uploadFile(request);
  }
  
  public com.taurus.openbravo.soapclient.entities.files.SearchFileResponse searchFile(com.taurus.openbravo.soapclient.entities.files.SearchFileRequest request) throws java.rmi.RemoteException{
    if (iTAURUSSync == null)
      _initITAURUSSyncProxy();
    return iTAURUSSync.searchFile(request);
  }
  
  public com.taurus.openbravo.soapclient.entities.files.ShowLogResponse showLog(com.taurus.openbravo.soapclient.entities.files.ShowLogRequest request) throws java.rmi.RemoteException{
    if (iTAURUSSync == null)
      _initITAURUSSyncProxy();
    return iTAURUSSync.showLog(request);
  }
  
  public com.taurus.openbravo.soapclient.entities.files.ProcessingFileResponse processingFile(com.taurus.openbravo.soapclient.entities.files.ProcessingFileRequest request) throws java.rmi.RemoteException{
    if (iTAURUSSync == null)
      _initITAURUSSyncProxy();
    return iTAURUSSync.processingFile(request);
  }
  
  
}