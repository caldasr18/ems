//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.04.19 at 01:24:49 AM CEST 
//


package org.zmeu.blog.jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.ToString;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;


/**
 * <p>Java class for dataMessageType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dataMessageType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="blacklist_updates" type="{}BlacklistUpdatesType"/>
 *         &lt;element name="rating_provider_result" type="{}RatingProviderResultType"/>
 *         &lt;element name="rating_result" type="{}RatingResultType" minOccurs="0"/>
 *         &lt;element name="payment_regulation" type="{}PaymentRegulationType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dataMessageType", propOrder = {
    "blacklistUpdates",
    "ratingProviderResult",
    "ratingResult",
    "paymentRegulation"
})
public class DataMessageType
    implements ToString
{

    @XmlElement(name = "blacklist_updates", required = true)
    protected BlacklistUpdatesType blacklistUpdates;
    @XmlElement(name = "rating_provider_result", required = true)
    protected RatingProviderResultType ratingProviderResult;
    @XmlElement(name = "rating_result")
    protected RatingResultType ratingResult;
    @XmlElement(name = "payment_regulation")
    protected PaymentRegulationType paymentRegulation;

    /**
     * Gets the value of the blacklistUpdates property.
     * 
     * @return
     *     possible object is
     *     {@link BlacklistUpdatesType }
     *     
     */
    public BlacklistUpdatesType getBlacklistUpdates() {
        return blacklistUpdates;
    }

    /**
     * Sets the value of the blacklistUpdates property.
     * 
     * @param value
     *     allowed object is
     *     {@link BlacklistUpdatesType }
     *     
     */
    public void setBlacklistUpdates(BlacklistUpdatesType value) {
        this.blacklistUpdates = value;
    }

    /**
     * Gets the value of the ratingProviderResult property.
     * 
     * @return
     *     possible object is
     *     {@link RatingProviderResultType }
     *     
     */
    public RatingProviderResultType getRatingProviderResult() {
        return ratingProviderResult;
    }

    /**
     * Sets the value of the ratingProviderResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link RatingProviderResultType }
     *     
     */
    public void setRatingProviderResult(RatingProviderResultType value) {
        this.ratingProviderResult = value;
    }

    /**
     * Gets the value of the ratingResult property.
     * 
     * @return
     *     possible object is
     *     {@link RatingResultType }
     *     
     */
    public RatingResultType getRatingResult() {
        return ratingResult;
    }

    /**
     * Sets the value of the ratingResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link RatingResultType }
     *     
     */
    public void setRatingResult(RatingResultType value) {
        this.ratingResult = value;
    }

    /**
     * Gets the value of the paymentRegulation property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentRegulationType }
     *     
     */
    public PaymentRegulationType getPaymentRegulation() {
        return paymentRegulation;
    }

    /**
     * Sets the value of the paymentRegulation property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentRegulationType }
     *     
     */
    public void setPaymentRegulation(PaymentRegulationType value) {
        this.paymentRegulation = value;
    }

    public String toString() {
        final ToStringStrategy strategy = JAXBToStringStrategy.INSTANCE;
        final StringBuilder buffer = new StringBuilder();
        append(null, buffer, strategy);
        return buffer.toString();
    }

    public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        strategy.appendStart(locator, this, buffer);
        appendFields(locator, buffer, strategy);
        strategy.appendEnd(locator, this, buffer);
        return buffer;
    }

    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        {
            BlacklistUpdatesType theBlacklistUpdates;
            theBlacklistUpdates = this.getBlacklistUpdates();
            strategy.appendField(locator, this, "blacklistUpdates", buffer, theBlacklistUpdates);
        }
        {
            RatingProviderResultType theRatingProviderResult;
            theRatingProviderResult = this.getRatingProviderResult();
            strategy.appendField(locator, this, "ratingProviderResult", buffer, theRatingProviderResult);
        }
        {
            RatingResultType theRatingResult;
            theRatingResult = this.getRatingResult();
            strategy.appendField(locator, this, "ratingResult", buffer, theRatingResult);
        }
        {
            PaymentRegulationType thePaymentRegulation;
            thePaymentRegulation = this.getPaymentRegulation();
            strategy.appendField(locator, this, "paymentRegulation", buffer, thePaymentRegulation);
        }
        return buffer;
    }

}