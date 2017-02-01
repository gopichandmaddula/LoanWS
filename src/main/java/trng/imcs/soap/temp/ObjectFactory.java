
package trng.imcs.soap.temp;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the trng.imcs.soap.temp package. 
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

    private final static QName _LoanResponse_QNAME = new QName("http://www.example.org/LoanResponse", "LoanResponse");
    private final static QName _LoanRequest_QNAME = new QName("http://www.example.org/LoanRequest", "LoanRequest");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: trng.imcs.soap.temp
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link TestEligibilityResponse }
     * 
     */
    public TestEligibilityResponse createTestEligibilityResponse() {
        return new TestEligibilityResponse();
    }

    /**
     * Create an instance of {@link TestEligibility }
     * 
     */
    public TestEligibility createTestEligibility() {
        return new TestEligibility();
    }

    /**
     * Create an instance of {@link LoanRequest }
     * 
     */
    public LoanRequest createLoanRequest() {
        return new LoanRequest();
    }

    /**
     * Create an instance of {@link LoanResponse }
     * 
     */
    public LoanResponse createLoanResponse() {
        return new LoanResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoanResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.example.org/LoanResponse", name = "LoanResponse")
    public JAXBElement<LoanResponse> createLoanResponse(LoanResponse value) {
        return new JAXBElement<LoanResponse>(_LoanResponse_QNAME, LoanResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoanRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.example.org/LoanRequest", name = "LoanRequest")
    public JAXBElement<LoanRequest> createLoanRequest(LoanRequest value) {
        return new JAXBElement<LoanRequest>(_LoanRequest_QNAME, LoanRequest.class, null, value);
    }

}
