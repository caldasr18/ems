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
 * <p>Java class for OrderDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrderDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="number_articles" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="quantity" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="currency" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="order_amount" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="total_amount" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="payment_method" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="portal_id" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="shop_limit" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="hour_of_day" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="day_of_week" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="merchant_order_id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderDetailsType", propOrder = {
    "numberArticles",
    "quantity",
    "currency",
    "orderAmount",
    "totalAmount",
    "paymentMethod",
    "portalId",
    "shopLimit",
    "hourOfDay",
    "dayOfWeek",
    "merchantOrderId"
})
public class OrderDetailsType
    implements ToString
{

    @XmlElement(name = "number_articles")
    protected long numberArticles;
    protected long quantity;
    @XmlElement(required = true)
    protected String currency;
    @XmlElement(name = "order_amount")
    protected long orderAmount;
    @XmlElement(name = "total_amount")
    protected long totalAmount;
    @XmlElement(name = "payment_method")
    protected long paymentMethod;
    @XmlElement(name = "portal_id")
    protected long portalId;
    @XmlElement(name = "shop_limit")
    protected long shopLimit;
    @XmlElement(name = "hour_of_day")
    protected long hourOfDay;
    @XmlElement(name = "day_of_week", required = true)
    protected String dayOfWeek;
    @XmlElement(name = "merchant_order_id", required = true)
    protected String merchantOrderId;

    /**
     * Gets the value of the numberArticles property.
     * 
     */
    public long getNumberArticles() {
        return numberArticles;
    }

    /**
     * Sets the value of the numberArticles property.
     * 
     */
    public void setNumberArticles(long value) {
        this.numberArticles = value;
    }

    /**
     * Gets the value of the quantity property.
     * 
     */
    public long getQuantity() {
        return quantity;
    }

    /**
     * Sets the value of the quantity property.
     * 
     */
    public void setQuantity(long value) {
        this.quantity = value;
    }

    /**
     * Gets the value of the currency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * Sets the value of the currency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrency(String value) {
        this.currency = value;
    }

    /**
     * Gets the value of the orderAmount property.
     * 
     */
    public long getOrderAmount() {
        return orderAmount;
    }

    /**
     * Sets the value of the orderAmount property.
     * 
     */
    public void setOrderAmount(long value) {
        this.orderAmount = value;
    }

    /**
     * Gets the value of the totalAmount property.
     * 
     */
    public long getTotalAmount() {
        return totalAmount;
    }

    /**
     * Sets the value of the totalAmount property.
     * 
     */
    public void setTotalAmount(long value) {
        this.totalAmount = value;
    }

    /**
     * Gets the value of the paymentMethod property.
     * 
     */
    public long getPaymentMethod() {
        return paymentMethod;
    }

    /**
     * Sets the value of the paymentMethod property.
     * 
     */
    public void setPaymentMethod(long value) {
        this.paymentMethod = value;
    }

    /**
     * Gets the value of the portalId property.
     * 
     */
    public long getPortalId() {
        return portalId;
    }

    /**
     * Sets the value of the portalId property.
     * 
     */
    public void setPortalId(long value) {
        this.portalId = value;
    }

    /**
     * Gets the value of the shopLimit property.
     * 
     */
    public long getShopLimit() {
        return shopLimit;
    }

    /**
     * Sets the value of the shopLimit property.
     * 
     */
    public void setShopLimit(long value) {
        this.shopLimit = value;
    }

    /**
     * Gets the value of the hourOfDay property.
     * 
     */
    public long getHourOfDay() {
        return hourOfDay;
    }

    /**
     * Sets the value of the hourOfDay property.
     * 
     */
    public void setHourOfDay(long value) {
        this.hourOfDay = value;
    }

    /**
     * Gets the value of the dayOfWeek property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDayOfWeek() {
        return dayOfWeek;
    }

    /**
     * Sets the value of the dayOfWeek property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDayOfWeek(String value) {
        this.dayOfWeek = value;
    }

    /**
     * Gets the value of the merchantOrderId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerchantOrderId() {
        return merchantOrderId;
    }

    /**
     * Sets the value of the merchantOrderId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerchantOrderId(String value) {
        this.merchantOrderId = value;
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
            long theNumberArticles;
            theNumberArticles = (true?this.getNumberArticles(): 0L);
            strategy.appendField(locator, this, "numberArticles", buffer, theNumberArticles);
        }
        {
            long theQuantity;
            theQuantity = (true?this.getQuantity(): 0L);
            strategy.appendField(locator, this, "quantity", buffer, theQuantity);
        }
        {
            String theCurrency;
            theCurrency = this.getCurrency();
            strategy.appendField(locator, this, "currency", buffer, theCurrency);
        }
        {
            long theOrderAmount;
            theOrderAmount = (true?this.getOrderAmount(): 0L);
            strategy.appendField(locator, this, "orderAmount", buffer, theOrderAmount);
        }
        {
            long theTotalAmount;
            theTotalAmount = (true?this.getTotalAmount(): 0L);
            strategy.appendField(locator, this, "totalAmount", buffer, theTotalAmount);
        }
        {
            long thePaymentMethod;
            thePaymentMethod = (true?this.getPaymentMethod(): 0L);
            strategy.appendField(locator, this, "paymentMethod", buffer, thePaymentMethod);
        }
        {
            long thePortalId;
            thePortalId = (true?this.getPortalId(): 0L);
            strategy.appendField(locator, this, "portalId", buffer, thePortalId);
        }
        {
            long theShopLimit;
            theShopLimit = (true?this.getShopLimit(): 0L);
            strategy.appendField(locator, this, "shopLimit", buffer, theShopLimit);
        }
        {
            long theHourOfDay;
            theHourOfDay = (true?this.getHourOfDay(): 0L);
            strategy.appendField(locator, this, "hourOfDay", buffer, theHourOfDay);
        }
        {
            String theDayOfWeek;
            theDayOfWeek = this.getDayOfWeek();
            strategy.appendField(locator, this, "dayOfWeek", buffer, theDayOfWeek);
        }
        {
            String theMerchantOrderId;
            theMerchantOrderId = this.getMerchantOrderId();
            strategy.appendField(locator, this, "merchantOrderId", buffer, theMerchantOrderId);
        }
        return buffer;
    }

}
