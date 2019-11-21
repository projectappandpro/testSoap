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
 * <p>Java class for Header complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Header">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="bankCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="customerCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="paymentAmt" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="paymentAmtFlag" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="paymentDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="paymentDetail" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="paymentType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sendDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sendTime" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sponsorCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="totalDocuments" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="trackingNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Header", propOrder = {
    "bankCode",
    "customerCode",
    "paymentAmt",
    "paymentAmtFlag",
    "paymentDate",
    "paymentDetail",
    "paymentType",
    "sendDate",
    "sendTime",
    "sponsorCode",
    "totalDocuments",
    "trackingNumber"
})
public class Header {

    @XmlElement(required = true, nillable = true)
    protected String bankCode;
    @XmlElement(required = true, nillable = true)
    protected String customerCode;
    protected double paymentAmt;
    @XmlElement(required = true, nillable = true)
    protected String paymentAmtFlag;
    @XmlElement(required = true, nillable = true)
    protected String paymentDate;
    @XmlElement(required = true, nillable = true)
    protected String paymentDetail;
    @XmlElement(required = true, nillable = true)
    protected String paymentType;
    @XmlElement(required = true, nillable = true)
    protected String sendDate;
    @XmlElement(required = true, nillable = true)
    protected String sendTime;
    @XmlElement(required = true, nillable = true)
    protected String sponsorCode;
    protected int totalDocuments;
    @XmlElement(required = true, nillable = true)
    protected String trackingNumber;

    /**
     * Gets the value of the bankCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankCode() {
        return bankCode;
    }

    /**
     * Sets the value of the bankCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankCode(String value) {
        this.bankCode = value;
    }

    /**
     * Gets the value of the customerCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerCode() {
        return customerCode;
    }

    /**
     * Sets the value of the customerCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerCode(String value) {
        this.customerCode = value;
    }

    /**
     * Gets the value of the paymentAmt property.
     * 
     */
    public double getPaymentAmt() {
        return paymentAmt;
    }

    /**
     * Sets the value of the paymentAmt property.
     * 
     */
    public void setPaymentAmt(double value) {
        this.paymentAmt = value;
    }

    /**
     * Gets the value of the paymentAmtFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentAmtFlag() {
        return paymentAmtFlag;
    }

    /**
     * Sets the value of the paymentAmtFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentAmtFlag(String value) {
        this.paymentAmtFlag = value;
    }

    /**
     * Gets the value of the paymentDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentDate() {
        return paymentDate;
    }

    /**
     * Sets the value of the paymentDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentDate(String value) {
        this.paymentDate = value;
    }

    /**
     * Gets the value of the paymentDetail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentDetail() {
        return paymentDetail;
    }

    /**
     * Sets the value of the paymentDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentDetail(String value) {
        this.paymentDetail = value;
    }

    /**
     * Gets the value of the paymentType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentType() {
        return paymentType;
    }

    /**
     * Sets the value of the paymentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentType(String value) {
        this.paymentType = value;
    }

    /**
     * Gets the value of the sendDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSendDate() {
        return sendDate;
    }

    /**
     * Sets the value of the sendDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSendDate(String value) {
        this.sendDate = value;
    }

    /**
     * Gets the value of the sendTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSendTime() {
        return sendTime;
    }

    /**
     * Sets the value of the sendTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSendTime(String value) {
        this.sendTime = value;
    }

    /**
     * Gets the value of the sponsorCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSponsorCode() {
        return sponsorCode;
    }

    /**
     * Sets the value of the sponsorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSponsorCode(String value) {
        this.sponsorCode = value;
    }

    /**
     * Gets the value of the totalDocuments property.
     * 
     */
    public int getTotalDocuments() {
        return totalDocuments;
    }

    /**
     * Sets the value of the totalDocuments property.
     * 
     */
    public void setTotalDocuments(int value) {
        this.totalDocuments = value;
    }

    /**
     * Gets the value of the trackingNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrackingNumber() {
        return trackingNumber;
    }

    /**
     * Sets the value of the trackingNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrackingNumber(String value) {
        this.trackingNumber = value;
    }

}
