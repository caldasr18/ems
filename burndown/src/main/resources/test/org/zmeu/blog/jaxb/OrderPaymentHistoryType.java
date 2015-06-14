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
 * <p>Java class for OrderPaymentHistoryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrderPaymentHistoryType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="order_history" type="{}OrderHistoryType"/>
 *         &lt;element name="payment_history" type="{}PaymentHistoryType"/>
 *         &lt;element name="open_debts" type="{}OpenDebtsType"/>
 *         &lt;element name="debts_in_dunning" type="{}DebtsInDunningType"/>
 *         &lt;element name="cancellation_history" type="{}CancellationHistoryType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderPaymentHistoryType", propOrder = {
    "orderHistory",
    "paymentHistory",
    "openDebts",
    "debtsInDunning",
    "cancellationHistory"
})
public class OrderPaymentHistoryType
    implements ToString
{

    @XmlElement(name = "order_history", required = true)
    protected OrderHistoryType orderHistory;
    @XmlElement(name = "payment_history", required = true)
    protected PaymentHistoryType paymentHistory;
    @XmlElement(name = "open_debts", required = true)
    protected OpenDebtsType openDebts;
    @XmlElement(name = "debts_in_dunning", required = true)
    protected DebtsInDunningType debtsInDunning;
    @XmlElement(name = "cancellation_history", required = true)
    protected CancellationHistoryType cancellationHistory;

    /**
     * Gets the value of the orderHistory property.
     * 
     * @return
     *     possible object is
     *     {@link OrderHistoryType }
     *     
     */
    public OrderHistoryType getOrderHistory() {
        return orderHistory;
    }

    /**
     * Sets the value of the orderHistory property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderHistoryType }
     *     
     */
    public void setOrderHistory(OrderHistoryType value) {
        this.orderHistory = value;
    }

    /**
     * Gets the value of the paymentHistory property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentHistoryType }
     *     
     */
    public PaymentHistoryType getPaymentHistory() {
        return paymentHistory;
    }

    /**
     * Sets the value of the paymentHistory property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentHistoryType }
     *     
     */
    public void setPaymentHistory(PaymentHistoryType value) {
        this.paymentHistory = value;
    }

    /**
     * Gets the value of the openDebts property.
     * 
     * @return
     *     possible object is
     *     {@link OpenDebtsType }
     *     
     */
    public OpenDebtsType getOpenDebts() {
        return openDebts;
    }

    /**
     * Sets the value of the openDebts property.
     * 
     * @param value
     *     allowed object is
     *     {@link OpenDebtsType }
     *     
     */
    public void setOpenDebts(OpenDebtsType value) {
        this.openDebts = value;
    }

    /**
     * Gets the value of the debtsInDunning property.
     * 
     * @return
     *     possible object is
     *     {@link DebtsInDunningType }
     *     
     */
    public DebtsInDunningType getDebtsInDunning() {
        return debtsInDunning;
    }

    /**
     * Sets the value of the debtsInDunning property.
     * 
     * @param value
     *     allowed object is
     *     {@link DebtsInDunningType }
     *     
     */
    public void setDebtsInDunning(DebtsInDunningType value) {
        this.debtsInDunning = value;
    }

    /**
     * Gets the value of the cancellationHistory property.
     * 
     * @return
     *     possible object is
     *     {@link CancellationHistoryType }
     *     
     */
    public CancellationHistoryType getCancellationHistory() {
        return cancellationHistory;
    }

    /**
     * Sets the value of the cancellationHistory property.
     * 
     * @param value
     *     allowed object is
     *     {@link CancellationHistoryType }
     *     
     */
    public void setCancellationHistory(CancellationHistoryType value) {
        this.cancellationHistory = value;
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
            OrderHistoryType theOrderHistory;
            theOrderHistory = this.getOrderHistory();
            strategy.appendField(locator, this, "orderHistory", buffer, theOrderHistory);
        }
        {
            PaymentHistoryType thePaymentHistory;
            thePaymentHistory = this.getPaymentHistory();
            strategy.appendField(locator, this, "paymentHistory", buffer, thePaymentHistory);
        }
        {
            OpenDebtsType theOpenDebts;
            theOpenDebts = this.getOpenDebts();
            strategy.appendField(locator, this, "openDebts", buffer, theOpenDebts);
        }
        {
            DebtsInDunningType theDebtsInDunning;
            theDebtsInDunning = this.getDebtsInDunning();
            strategy.appendField(locator, this, "debtsInDunning", buffer, theDebtsInDunning);
        }
        {
            CancellationHistoryType theCancellationHistory;
            theCancellationHistory = this.getCancellationHistory();
            strategy.appendField(locator, this, "cancellationHistory", buffer, theCancellationHistory);
        }
        return buffer;
    }

}