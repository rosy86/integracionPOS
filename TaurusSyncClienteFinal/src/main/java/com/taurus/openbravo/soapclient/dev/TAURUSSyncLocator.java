/**
 * TAURUSSyncLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.taurus.openbravo.soapclient.dev;

public class TAURUSSyncLocator extends org.apache.axis.client.Service implements com.taurus.openbravo.soapclient.dev.TAURUSSync {

    public TAURUSSyncLocator() {
    }


    public TAURUSSyncLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public TAURUSSyncLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for BasicHttpBinding_ITAURUSSync
    private java.lang.String BasicHttpBinding_ITAURUSSync_address = "http://mgaray-main.cloudapp.net/TAURUSSync/TAURUSSync.svc";//"http://13.92.133.96/TAURUSSync/TAURUSSync.svc";//"http://166.62.35.40/TAURUSSync/TAURUSSync.svc";

    public java.lang.String getBasicHttpBinding_ITAURUSSyncAddress() {
        return BasicHttpBinding_ITAURUSSync_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String BasicHttpBinding_ITAURUSSyncWSDDServiceName = "BasicHttpBinding_ITAURUSSync";

    public java.lang.String getBasicHttpBinding_ITAURUSSyncWSDDServiceName() {
        return BasicHttpBinding_ITAURUSSyncWSDDServiceName;
    }

    public void setBasicHttpBinding_ITAURUSSyncWSDDServiceName(java.lang.String name) {
        BasicHttpBinding_ITAURUSSyncWSDDServiceName = name;
    }

    public com.taurus.openbravo.soapclient.dev.ITAURUSSync getBasicHttpBinding_ITAURUSSync() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(BasicHttpBinding_ITAURUSSync_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getBasicHttpBinding_ITAURUSSync(endpoint);
    }

    public com.taurus.openbravo.soapclient.dev.ITAURUSSync getBasicHttpBinding_ITAURUSSync(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.taurus.openbravo.soapclient.dev.BasicHttpBinding_ITAURUSSyncStub _stub = new com.taurus.openbravo.soapclient.dev.BasicHttpBinding_ITAURUSSyncStub(portAddress, this);
            _stub.setPortName(getBasicHttpBinding_ITAURUSSyncWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setBasicHttpBinding_ITAURUSSyncEndpointAddress(java.lang.String address) {
        BasicHttpBinding_ITAURUSSync_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.taurus.openbravo.soapclient.dev.ITAURUSSync.class.isAssignableFrom(serviceEndpointInterface)) {
                com.taurus.openbravo.soapclient.dev.BasicHttpBinding_ITAURUSSyncStub _stub = new com.taurus.openbravo.soapclient.dev.BasicHttpBinding_ITAURUSSyncStub(new java.net.URL(BasicHttpBinding_ITAURUSSync_address), this);
                _stub.setPortName(getBasicHttpBinding_ITAURUSSyncWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("BasicHttpBinding_ITAURUSSync".equals(inputPortName)) {
            return getBasicHttpBinding_ITAURUSSync();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://grupotaurus.com.mx", "TAURUSSync");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://grupotaurus.com.mx", "BasicHttpBinding_ITAURUSSync"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("BasicHttpBinding_ITAURUSSync".equals(portName)) {
            setBasicHttpBinding_ITAURUSSyncEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
