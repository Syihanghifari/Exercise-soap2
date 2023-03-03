
package id.co.ogya.soap;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the id.co.ogya.soap package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _TransferDana_QNAME = new QName("http://soap.ogya.co.id/", "transferDana");
    private final static QName _TransferDanaResponse_QNAME = new QName("http://soap.ogya.co.id/", "transferDanaResponse");
    private final static QName _TransferRequest_QNAME = new QName("http://soap.ogya.co.id/", "transferRequest");
    private final static QName _TransferResponse_QNAME = new QName("http://soap.ogya.co.id/", "transferResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: id.co.ogya.soap
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link TransferDana }
     * 
     */
    public TransferDana createTransferDana() {
        return new TransferDana();
    }

    /**
     * Create an instance of {@link TransferDanaResponse }
     * 
     */
    public TransferDanaResponse createTransferDanaResponse() {
        return new TransferDanaResponse();
    }

    /**
     * Create an instance of {@link TransferRequest }
     * 
     */
    public TransferRequest createTransferRequest() {
        return new TransferRequest();
    }

    /**
     * Create an instance of {@link TransferResponse }
     * 
     */
    public TransferResponse createTransferResponse() {
        return new TransferResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransferDana }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TransferDana }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap.ogya.co.id/", name = "transferDana")
    public JAXBElement<TransferDana> createTransferDana(TransferDana value) {
        return new JAXBElement<TransferDana>(_TransferDana_QNAME, TransferDana.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransferDanaResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TransferDanaResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap.ogya.co.id/", name = "transferDanaResponse")
    public JAXBElement<TransferDanaResponse> createTransferDanaResponse(TransferDanaResponse value) {
        return new JAXBElement<TransferDanaResponse>(_TransferDanaResponse_QNAME, TransferDanaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransferRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TransferRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap.ogya.co.id/", name = "transferRequest")
    public JAXBElement<TransferRequest> createTransferRequest(TransferRequest value) {
        return new JAXBElement<TransferRequest>(_TransferRequest_QNAME, TransferRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransferResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TransferResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap.ogya.co.id/", name = "transferResponse")
    public JAXBElement<TransferResponse> createTransferResponse(TransferResponse value) {
        return new JAXBElement<TransferResponse>(_TransferResponse_QNAME, TransferResponse.class, null, value);
    }

}
