
package com.finkok.facturacion.cancel.test;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.10
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "CancelSOAP", targetNamespace = "http://facturacion.finkok.com/cancel", wsdlLocation = "file:/Users/jp/Documents/IdeaProjects/finkok-ws/src/main/resources/cancel-test.wsdl")
public class CancelSOAP
    extends Service
{

    private final static URL CANCELSOAP_WSDL_LOCATION;
    private final static WebServiceException CANCELSOAP_EXCEPTION;
    private final static QName CANCELSOAP_QNAME = new QName("http://facturacion.finkok.com/cancel", "CancelSOAP");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("file:/Users/jp/Documents/IdeaProjects/finkok-ws/src/main/resources/cancel-test.wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        CANCELSOAP_WSDL_LOCATION = url;
        CANCELSOAP_EXCEPTION = e;
    }

    public CancelSOAP() {
        super(__getWsdlLocation(), CANCELSOAP_QNAME);
    }

    public CancelSOAP(WebServiceFeature... features) {
        super(__getWsdlLocation(), CANCELSOAP_QNAME, features);
    }

    public CancelSOAP(URL wsdlLocation) {
        super(wsdlLocation, CANCELSOAP_QNAME);
    }

    public CancelSOAP(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, CANCELSOAP_QNAME, features);
    }

    public CancelSOAP(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public CancelSOAP(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns Application
     */
    @WebEndpoint(name = "Application")
    public Application getApplication() {
        return super.getPort(new QName("http://facturacion.finkok.com/cancel", "Application"), Application.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns Application
     */
    @WebEndpoint(name = "Application")
    public Application getApplication(WebServiceFeature... features) {
        return super.getPort(new QName("http://facturacion.finkok.com/cancel", "Application"), Application.class, features);
    }

    private static URL __getWsdlLocation() {
        if (CANCELSOAP_EXCEPTION!= null) {
            throw CANCELSOAP_EXCEPTION;
        }
        return CANCELSOAP_WSDL_LOCATION;
    }

}
