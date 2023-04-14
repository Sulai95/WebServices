package travel.client;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.5.5
 * 2023-04-14T17:36:01.002+03:00
 * Generated source version: 3.5.5
 *
 */
@WebServiceClient(name = "TravelService",
                  wsdlLocation = "file:/C:/Users/etudiant/Documents/Eclipse/travelagent/src/main/webapp/wsdl/travel.wsdl",
                  targetNamespace = "http://www.travel")
public class TravelService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://www.travel", "TravelService");
    public final static QName TravelPort = new QName("http://www.travel", "TravelPort");
    static {
        URL url = null;
        try {
            url = new URL("file:/C:/Users/etudiant/Documents/Eclipse/travelagent/src/main/webapp/wsdl/travel.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(TravelService.class.getName())
                .log(java.util.logging.Level.INFO,
                     "Can not initialize the default wsdl from {0}", "file:/C:/Users/etudiant/Documents/Eclipse/travelagent/src/main/webapp/wsdl/travel.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public TravelService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public TravelService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public TravelService() {
        super(WSDL_LOCATION, SERVICE);
    }

    public TravelService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public TravelService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public TravelService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }




    /**
     *
     * @return
     *     returns Travel
     */
    @WebEndpoint(name = "TravelPort")
    public Travel getTravelPort() {
        return super.getPort(TravelPort, Travel.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns Travel
     */
    @WebEndpoint(name = "TravelPort")
    public Travel getTravelPort(WebServiceFeature... features) {
        return super.getPort(TravelPort, Travel.class, features);
    }

}
