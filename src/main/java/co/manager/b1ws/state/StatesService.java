
package co.manager.b1ws.state;

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
 * JAX-WS RI 2.2.10-b140803.1500
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "StatesService", targetNamespace = "StatesService", wsdlLocation = "http://192.168.10.102/B1WS/WebReferences/StatesService.wsdl")
public class StatesService
    extends Service
{

    private final static URL STATESSERVICE_WSDL_LOCATION;
    private final static WebServiceException STATESSERVICE_EXCEPTION;
    private final static QName STATESSERVICE_QNAME = new QName("StatesService", "StatesService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://192.168.10.102/B1WS/WebReferences/StatesService.wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        STATESSERVICE_WSDL_LOCATION = url;
        STATESSERVICE_EXCEPTION = e;
    }

    public StatesService() {
        super(__getWsdlLocation(), STATESSERVICE_QNAME);
    }

    public StatesService(WebServiceFeature... features) {
        super(__getWsdlLocation(), STATESSERVICE_QNAME, features);
    }

    public StatesService(URL wsdlLocation) {
        super(wsdlLocation, STATESSERVICE_QNAME);
    }

    public StatesService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, STATESSERVICE_QNAME, features);
    }

    public StatesService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public StatesService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns StatesServiceSoap
     */
    @WebEndpoint(name = "StatesServiceSoap")
    public StatesServiceSoap getStatesServiceSoap() {
        return super.getPort(new QName("StatesService", "StatesServiceSoap"), StatesServiceSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns StatesServiceSoap
     */
    @WebEndpoint(name = "StatesServiceSoap")
    public StatesServiceSoap getStatesServiceSoap(WebServiceFeature... features) {
        return super.getPort(new QName("StatesService", "StatesServiceSoap"), StatesServiceSoap.class, features);
    }

    /**
     * 
     * @return
     *     returns StatesServiceSoap
     */
    @WebEndpoint(name = "StatesServiceSoap12")
    public StatesServiceSoap getStatesServiceSoap12() {
        return super.getPort(new QName("StatesService", "StatesServiceSoap12"), StatesServiceSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns StatesServiceSoap
     */
    @WebEndpoint(name = "StatesServiceSoap12")
    public StatesServiceSoap getStatesServiceSoap12(WebServiceFeature... features) {
        return super.getPort(new QName("StatesService", "StatesServiceSoap12"), StatesServiceSoap.class, features);
    }

    private static URL __getWsdlLocation() {
        if (STATESSERVICE_EXCEPTION!= null) {
            throw STATESSERVICE_EXCEPTION;
        }
        return STATESSERVICE_WSDL_LOCATION;
    }

}