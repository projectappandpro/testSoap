//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.11.21 at 10:19:48 AM ICT 
//


package tmbscfinbound.irp.ws.payment_service.dto.common.request;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the tmbscfinbound.irp.ws.payment_service.dto.common.request package. 
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


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: tmbscfinbound.irp.ws.payment_service.dto.common.request
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CutReturnMessageRequest }
     * 
     */
    public CutReturnMessageRequest createCutReturnMessageRequest() {
        return new CutReturnMessageRequest();
    }

    /**
     * Create an instance of {@link PaymentServiceRequest }
     * 
     */
    public PaymentServiceRequest createPaymentServiceRequest() {
        return new PaymentServiceRequest();
    }

    /**
     * Create an instance of {@link RequestMessage }
     * 
     */
    public RequestMessage createRequestMessage() {
        return new RequestMessage();
    }

    /**
     * Create an instance of {@link Header }
     * 
     */
    public Header createHeader() {
        return new Header();
    }

    /**
     * Create an instance of {@link RequestData }
     * 
     */
    public RequestData createRequestData() {
        return new RequestData();
    }

    /**
     * Create an instance of {@link ArrayOfDocument }
     * 
     */
    public ArrayOfDocument createArrayOfDocument() {
        return new ArrayOfDocument();
    }

    /**
     * Create an instance of {@link Document }
     * 
     */
    public Document createDocument() {
        return new Document();
    }

}
