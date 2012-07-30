
package edu.txstate.cs4398.vc.desktop.services;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Logger;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.6 in JDK 6
 * Generated source version: 2.1
 * 
 */
@WebServiceClient(name = "MobileServicesImplService", targetNamespace = "http://services.desktop.vc.cs4398.txstate.edu/", wsdlLocation = "http://192.168.1.111:8796/MobileServices?wsdl")
public class MobileServicesImplService
    extends Service
{

    private final static URL MOBILESERVICESIMPLSERVICE_WSDL_LOCATION;
    private final static Logger logger = Logger.getLogger(edu.txstate.cs4398.vc.desktop.services.MobileServicesImplService.class.getName());

    static {
        URL url = null;
        try {
            URL baseUrl;
            baseUrl = edu.txstate.cs4398.vc.desktop.services.MobileServicesImplService.class.getResource(".");
            url = new URL(baseUrl, "http://192.168.1.111:8796/MobileServices?wsdl");
        } catch (MalformedURLException e) {
            logger.warning("Failed to create URL for the wsdl Location: 'http://192.168.1.111:8796/MobileServices?wsdl', retrying as a local file");
            logger.warning(e.getMessage());
        }
        MOBILESERVICESIMPLSERVICE_WSDL_LOCATION = url;
    }

    public MobileServicesImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public MobileServicesImplService() {
        super(MOBILESERVICESIMPLSERVICE_WSDL_LOCATION, new QName("http://services.desktop.vc.cs4398.txstate.edu/", "MobileServicesImplService"));
    }

    /**
     * 
     * @return
     *     returns MobileServices
     */
    @WebEndpoint(name = "MobileServicesImplPort")
    public MobileServices getMobileServicesImplPort() {
        return super.getPort(new QName("http://services.desktop.vc.cs4398.txstate.edu/", "MobileServicesImplPort"), MobileServices.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns MobileServices
     */
    @WebEndpoint(name = "MobileServicesImplPort")
    public MobileServices getMobileServicesImplPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://services.desktop.vc.cs4398.txstate.edu/", "MobileServicesImplPort"), MobileServices.class, features);
    }

}
