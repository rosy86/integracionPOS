/**
 * BasicHttpBinding_ITAURUSSyncStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.taurus.openbravo.soapclient.dev;

public class BasicHttpBinding_ITAURUSSyncStub extends org.apache.axis.client.Stub implements com.taurus.openbravo.soapclient.dev.ITAURUSSync {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[5];
        _initOperationDesc1();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DownloadFile");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://grupotaurus.com.mx", "request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/GrupoTaurus.Framework.DataSynchronizer.Entities.Files", "DownloadFileRequest"), com.taurus.openbravo.soapclient.entities.files.DownloadFileRequest.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/GrupoTaurus.Framework.DataSynchronizer.Entities.Files", "DownloadFileResponse"));
        oper.setReturnClass(com.taurus.openbravo.soapclient.entities.files.DownloadFileResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://grupotaurus.com.mx", "DownloadFileResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("UploadFile");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://grupotaurus.com.mx", "request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/GrupoTaurus.Framework.DataSynchronizer.Entities.Files", "UploadFileRequest"), com.taurus.openbravo.soapclient.entities.files.UploadFileRequest.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/GrupoTaurus.Framework.DataSynchronizer.Entities.Files", "UploadFileResponse"));
        oper.setReturnClass(com.taurus.openbravo.soapclient.entities.files.UploadFileResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://grupotaurus.com.mx", "UploadFileResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("SearchFile");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://grupotaurus.com.mx", "request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/GrupoTaurus.Framework.DataSynchronizer.Entities.Files", "SearchFileRequest"), com.taurus.openbravo.soapclient.entities.files.SearchFileRequest.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/GrupoTaurus.Framework.DataSynchronizer.Entities.Files", "SearchFileResponse"));
        oper.setReturnClass(com.taurus.openbravo.soapclient.entities.files.SearchFileResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://grupotaurus.com.mx", "SearchFileResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ShowLog");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://grupotaurus.com.mx", "request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/GrupoTaurus.Framework.DataSynchronizer.Entities.Files", "ShowLogRequest"), com.taurus.openbravo.soapclient.entities.files.ShowLogRequest.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/GrupoTaurus.Framework.DataSynchronizer.Entities.Files", "ShowLogResponse"));
        oper.setReturnClass(com.taurus.openbravo.soapclient.entities.files.ShowLogResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://grupotaurus.com.mx", "ShowLogResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ProcessingFile");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://grupotaurus.com.mx", "request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/GrupoTaurus.Framework.DataSynchronizer.Entities.Files", "ProcessingFileRequest"), com.taurus.openbravo.soapclient.entities.files.ProcessingFileRequest.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/GrupoTaurus.Framework.DataSynchronizer.Entities.Files", "ProcessingFileResponse"));
        oper.setReturnClass(com.taurus.openbravo.soapclient.entities.files.ProcessingFileResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://grupotaurus.com.mx", "ProcessingFileResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[4] = oper;

    }

    public BasicHttpBinding_ITAURUSSyncStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public BasicHttpBinding_ITAURUSSyncStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public BasicHttpBinding_ITAURUSSyncStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.2");
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/creaworlds.Framework.Entities.Responses", "ResponseBase");
            cachedSerQNames.add(qName);
            cls = com.taurus.openbravo.soapclient.entities.responses.ResponseBase.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/creaworlds.Framework.Enumerators.Responses", "Codes");
            cachedSerQNames.add(qName);
            cls = com.taurus.openbravo.soapclient.enumerators.responses.Codes.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/GrupoTaurus.Framework.DataSynchronizer.Entities.Files", "ArrayOfFileContainer");
            cachedSerQNames.add(qName);
            cls = com.taurus.openbravo.soapclient.entities.files.FileContainer[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/GrupoTaurus.Framework.DataSynchronizer.Entities.Files", "FileContainer");
            qName2 = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/GrupoTaurus.Framework.DataSynchronizer.Entities.Files", "FileContainer");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/GrupoTaurus.Framework.DataSynchronizer.Entities.Files", "ArrayOfLogData");
            cachedSerQNames.add(qName);
            cls = com.taurus.openbravo.soapclient.entities.files.LogData[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/GrupoTaurus.Framework.DataSynchronizer.Entities.Files", "LogData");
            qName2 = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/GrupoTaurus.Framework.DataSynchronizer.Entities.Files", "LogData");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/GrupoTaurus.Framework.DataSynchronizer.Entities.Files", "DownloadFileBase");
            cachedSerQNames.add(qName);
            cls = com.taurus.openbravo.soapclient.entities.files.DownloadFileBase.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/GrupoTaurus.Framework.DataSynchronizer.Entities.Files", "DownloadFileRequest");
            cachedSerQNames.add(qName);
            cls = com.taurus.openbravo.soapclient.entities.files.DownloadFileRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/GrupoTaurus.Framework.DataSynchronizer.Entities.Files", "DownloadFileResponse");
            cachedSerQNames.add(qName);
            cls = com.taurus.openbravo.soapclient.entities.files.DownloadFileResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/GrupoTaurus.Framework.DataSynchronizer.Entities.Files", "FileBase");
            cachedSerQNames.add(qName);
            cls = com.taurus.openbravo.soapclient.entities.files.FileBase.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/GrupoTaurus.Framework.DataSynchronizer.Entities.Files", "FileContainer");
            cachedSerQNames.add(qName);
            cls = com.taurus.openbravo.soapclient.entities.files.FileContainer.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/GrupoTaurus.Framework.DataSynchronizer.Entities.Files", "FileData");
            cachedSerQNames.add(qName);
            cls = com.taurus.openbravo.soapclient.entities.files.FileData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/GrupoTaurus.Framework.DataSynchronizer.Entities.Files", "LogData");
            cachedSerQNames.add(qName);
            cls = com.taurus.openbravo.soapclient.entities.files.LogData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/GrupoTaurus.Framework.DataSynchronizer.Entities.Files", "ProcessingFileBase");
            cachedSerQNames.add(qName);
            cls = com.taurus.openbravo.soapclient.entities.files.ProcessingFileBase.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/GrupoTaurus.Framework.DataSynchronizer.Entities.Files", "ProcessingFileRequest");
            cachedSerQNames.add(qName);
            cls = com.taurus.openbravo.soapclient.entities.files.ProcessingFileRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/GrupoTaurus.Framework.DataSynchronizer.Entities.Files", "ProcessingFileResponse");
            cachedSerQNames.add(qName);
            cls = com.taurus.openbravo.soapclient.entities.files.ProcessingFileResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/GrupoTaurus.Framework.DataSynchronizer.Entities.Files", "SearchFileRequest");
            cachedSerQNames.add(qName);
            cls = com.taurus.openbravo.soapclient.entities.files.SearchFileRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/GrupoTaurus.Framework.DataSynchronizer.Entities.Files", "SearchFileResponse");
            cachedSerQNames.add(qName);
            cls = com.taurus.openbravo.soapclient.entities.files.SearchFileResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/GrupoTaurus.Framework.DataSynchronizer.Entities.Files", "ShowLogRequest");
            cachedSerQNames.add(qName);
            cls = com.taurus.openbravo.soapclient.entities.files.ShowLogRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/GrupoTaurus.Framework.DataSynchronizer.Entities.Files", "ShowLogResponse");
            cachedSerQNames.add(qName);
            cls = com.taurus.openbravo.soapclient.entities.files.ShowLogResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/GrupoTaurus.Framework.DataSynchronizer.Entities.Files", "UploadFileBase");
            cachedSerQNames.add(qName);
            cls = com.taurus.openbravo.soapclient.entities.files.UploadFileBase.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/GrupoTaurus.Framework.DataSynchronizer.Entities.Files", "UploadFileRequest");
            cachedSerQNames.add(qName);
            cls = com.taurus.openbravo.soapclient.entities.files.UploadFileRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/GrupoTaurus.Framework.DataSynchronizer.Entities.Files", "UploadFileResponse");
            cachedSerQNames.add(qName);
            cls = com.taurus.openbravo.soapclient.entities.files.UploadFileResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/GrupoTaurus.Framework.DataSynchronizer.Entities.Security", "CredentialBase");
            cachedSerQNames.add(qName);
            cls = com.taurus.openbravo.soapclient.entities.security.CredentialBase.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/GrupoTaurus.Framework.DataSynchronizer.Entities.Security", "CredentialData");
            cachedSerQNames.add(qName);
            cls = com.taurus.openbravo.soapclient.entities.security.CredentialData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                java.lang.String key = (java.lang.String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setEncodingStyle(null);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        java.lang.Class cls = (java.lang.Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        java.lang.Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            java.lang.Class sf = (java.lang.Class)
                                 cachedSerFactories.get(i);
                            java.lang.Class df = (java.lang.Class)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                        else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
                                 cachedSerFactories.get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        }
        catch (java.lang.Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public com.taurus.openbravo.soapclient.entities.files.DownloadFileResponse downloadFile(com.taurus.openbravo.soapclient.entities.files.DownloadFileRequest request) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://grupotaurus.com.mx/ITAURUSSync/DownloadFile");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://grupotaurus.com.mx", "DownloadFile"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.taurus.openbravo.soapclient.entities.files.DownloadFileResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.taurus.openbravo.soapclient.entities.files.DownloadFileResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.taurus.openbravo.soapclient.entities.files.DownloadFileResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.taurus.openbravo.soapclient.entities.files.UploadFileResponse uploadFile(com.taurus.openbravo.soapclient.entities.files.UploadFileRequest request) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://grupotaurus.com.mx/ITAURUSSync/UploadFile");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://grupotaurus.com.mx", "UploadFile"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.taurus.openbravo.soapclient.entities.files.UploadFileResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.taurus.openbravo.soapclient.entities.files.UploadFileResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.taurus.openbravo.soapclient.entities.files.UploadFileResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.taurus.openbravo.soapclient.entities.files.SearchFileResponse searchFile(com.taurus.openbravo.soapclient.entities.files.SearchFileRequest request) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://grupotaurus.com.mx/ITAURUSSync/SearchFile");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://grupotaurus.com.mx", "SearchFile"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.taurus.openbravo.soapclient.entities.files.SearchFileResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.taurus.openbravo.soapclient.entities.files.SearchFileResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.taurus.openbravo.soapclient.entities.files.SearchFileResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.taurus.openbravo.soapclient.entities.files.ShowLogResponse showLog(com.taurus.openbravo.soapclient.entities.files.ShowLogRequest request) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://grupotaurus.com.mx/ITAURUSSync/ShowLog");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://grupotaurus.com.mx", "ShowLog"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.taurus.openbravo.soapclient.entities.files.ShowLogResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.taurus.openbravo.soapclient.entities.files.ShowLogResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.taurus.openbravo.soapclient.entities.files.ShowLogResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.taurus.openbravo.soapclient.entities.files.ProcessingFileResponse processingFile(com.taurus.openbravo.soapclient.entities.files.ProcessingFileRequest request) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://grupotaurus.com.mx/ITAURUSSync/ProcessingFile");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://grupotaurus.com.mx", "ProcessingFile"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.taurus.openbravo.soapclient.entities.files.ProcessingFileResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.taurus.openbravo.soapclient.entities.files.ProcessingFileResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.taurus.openbravo.soapclient.entities.files.ProcessingFileResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

}
