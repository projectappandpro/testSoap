//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.11.21 at 10:19:48 AM ICT 
//


package tmbscfinbound.irp.ws.payment_service.dto.common.request;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RequestData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RequestData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="documents" type="{http://request.common.dto.payment_service.ws.irp.tmbscfinbound}ArrayOfDocument"/>
 *         &lt;element name="header" type="{http://request.common.dto.payment_service.ws.irp.tmbscfinbound}Header"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RequestData", propOrder = {
    "documents",
    "header"
})
public class RequestData {

    @XmlElement(required = true, nillable = true)
    protected ArrayOfDocument documents;
    @XmlElement(required = true, nillable = true)
    protected Header header;

    /**
     * Gets the value of the documents property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDocument }
     *     
     */
    public ArrayOfDocument getDocuments() {
        return documents;
    }

    /**
     * Sets the value of the documents property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDocument }
     *     
     */
    public void setDocuments(ArrayOfDocument value) {
        this.documents = value;
    }

    /**
     * Gets the value of the header property.
     * 
     * @return
     *     possible object is
     *     {@link Header }
     *     
     */
    public Header getHeader() {
        return header;
    }

    /**
     * Sets the value of the header property.
     * 
     * @param value
     *     allowed object is
     *     {@link Header }
     *     
     */
    public void setHeader(Header value) {
        this.header = value;
    }

}
