package id.co.ogya.soap;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.3.2
 * 2023-03-06T13:35:49.859+07:00
 * Generated source version: 3.3.2
 *
 */
@WebServiceClient(name = "TransferServiceService",
                  wsdlLocation = "file:/C:/Users/Dell/Documents/GitHub/Exercise-soap2/rtgs-ws/src/main/resources/TransactionService.wsdl",
                  targetNamespace = "http://soap.ogya.co.id/")
public class TransferServiceService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://soap.ogya.co.id/", "TransferServiceService");
    public final static QName TransferServicePort = new QName("http://soap.ogya.co.id/", "TransferServicePort");
    static {
        URL url = null;
        try {
            url = new URL("file:/C:/Users/Dell/Documents/GitHub/Exercise-soap2/rtgs-ws/src/main/resources/TransactionService.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(TransferServiceService.class.getName())
                .log(java.util.logging.Level.INFO,
                     "Can not initialize the default wsdl from {0}", "file:/C:/Users/Dell/Documents/GitHub/Exercise-soap2/rtgs-ws/src/main/resources/TransactionService.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public TransferServiceService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public TransferServiceService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public TransferServiceService() {
        super(WSDL_LOCATION, SERVICE);
    }

    public TransferServiceService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public TransferServiceService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public TransferServiceService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }




    /**
     *
     * @return
     *     returns TransferService
     */
    @WebEndpoint(name = "TransferServicePort")
    public TransferService getTransferServicePort() {
        return super.getPort(TransferServicePort, TransferService.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns TransferService
     */
    @WebEndpoint(name = "TransferServicePort")
    public TransferService getTransferServicePort(WebServiceFeature... features) {
        return super.getPort(TransferServicePort, TransferService.class, features);
    }

}
