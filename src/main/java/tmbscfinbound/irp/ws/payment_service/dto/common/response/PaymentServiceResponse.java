//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.11.21 at 10:19:48 AM ICT 
//


package tmbscfinbound.irp.ws.payment_service.dto.common.response;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="paymentServiceReturn" type="{http://response.common.dto.payment_service.ws.irp.tmbscfinbound}ResponseMessage"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "paymentServiceReturn"
})
@XmlRootElement(name = "paymentServiceResponse")
public class PaymentServiceResponse {

    @XmlElement(required = true)
    protected ResponseMessage paymentServiceReturn;

    /**
     * Gets the value of the paymentServiceReturn property.
     * 
     * @return
     *     possible object is
     *     {@link ResponseMessage }
     *     
     */
    public ResponseMessage getPaymentServiceReturn() {
        return paymentServiceReturn;
    }

    /**
     * Sets the value of the paymentServiceReturn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseMessage }
     *     
     */
    public void setPaymentServiceReturn(ResponseMessage value) {
        this.paymentServiceReturn = value;
    }

}
