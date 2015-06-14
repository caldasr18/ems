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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.ToString;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;


/**
 * <p>Java class for BlacklistUpdatesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BlacklistUpdatesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="is_address_blacklist" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="is_email_blacklist" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="is_fraud_blacklist" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="is_identity_blacklist" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="period_address_blacklist" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="period_email_blacklist" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="period_fraud_blacklist" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="period_identity_blacklist" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BlacklistUpdatesType", propOrder = {
    "isAddressBlacklist",
    "isEmailBlacklist",
    "isFraudBlacklist",
    "isIdentityBlacklist",
    "periodAddressBlacklist",
    "periodEmailBlacklist",
    "periodFraudBlacklist",
    "periodIdentityBlacklist"
})
public class BlacklistUpdatesType
    implements ToString
{

    @XmlElement(name = "is_address_blacklist")
    protected boolean isAddressBlacklist;
    @XmlElement(name = "is_email_blacklist")
    protected boolean isEmailBlacklist;
    @XmlElement(name = "is_fraud_blacklist")
    protected boolean isFraudBlacklist;
    @XmlElement(name = "is_identity_blacklist")
    protected boolean isIdentityBlacklist;
    @XmlElement(name = "period_address_blacklist")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar periodAddressBlacklist;
    @XmlElement(name = "period_email_blacklist")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar periodEmailBlacklist;
    @XmlElement(name = "period_fraud_blacklist")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar periodFraudBlacklist;
    @XmlElement(name = "period_identity_blacklist")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar periodIdentityBlacklist;

    /**
     * Gets the value of the isAddressBlacklist property.
     * 
     */
    public boolean isIsAddressBlacklist() {
        return isAddressBlacklist;
    }

    /**
     * Sets the value of the isAddressBlacklist property.
     * 
     */
    public void setIsAddressBlacklist(boolean value) {
        this.isAddressBlacklist = value;
    }

    /**
     * Gets the value of the isEmailBlacklist property.
     * 
     */
    public boolean isIsEmailBlacklist() {
        return isEmailBlacklist;
    }

    /**
     * Sets the value of the isEmailBlacklist property.
     * 
     */
    public void setIsEmailBlacklist(boolean value) {
        this.isEmailBlacklist = value;
    }

    /**
     * Gets the value of the isFraudBlacklist property.
     * 
     */
    public boolean isIsFraudBlacklist() {
        return isFraudBlacklist;
    }

    /**
     * Sets the value of the isFraudBlacklist property.
     * 
     */
    public void setIsFraudBlacklist(boolean value) {
        this.isFraudBlacklist = value;
    }

    /**
     * Gets the value of the isIdentityBlacklist property.
     * 
     */
    public boolean isIsIdentityBlacklist() {
        return isIdentityBlacklist;
    }

    /**
     * Sets the value of the isIdentityBlacklist property.
     * 
     */
    public void setIsIdentityBlacklist(boolean value) {
        this.isIdentityBlacklist = value;
    }

    /**
     * Gets the value of the periodAddressBlacklist property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPeriodAddressBlacklist() {
        return periodAddressBlacklist;
    }

    /**
     * Sets the value of the periodAddressBlacklist property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPeriodAddressBlacklist(XMLGregorianCalendar value) {
        this.periodAddressBlacklist = value;
    }

    /**
     * Gets the value of the periodEmailBlacklist property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPeriodEmailBlacklist() {
        return periodEmailBlacklist;
    }

    /**
     * Sets the value of the periodEmailBlacklist property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPeriodEmailBlacklist(XMLGregorianCalendar value) {
        this.periodEmailBlacklist = value;
    }

    /**
     * Gets the value of the periodFraudBlacklist property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPeriodFraudBlacklist() {
        return periodFraudBlacklist;
    }

    /**
     * Sets the value of the periodFraudBlacklist property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPeriodFraudBlacklist(XMLGregorianCalendar value) {
        this.periodFraudBlacklist = value;
    }

    /**
     * Gets the value of the periodIdentityBlacklist property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPeriodIdentityBlacklist() {
        return periodIdentityBlacklist;
    }

    /**
     * Sets the value of the periodIdentityBlacklist property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPeriodIdentityBlacklist(XMLGregorianCalendar value) {
        this.periodIdentityBlacklist = value;
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
            boolean theIsAddressBlacklist;
            theIsAddressBlacklist = (true?this.isIsAddressBlacklist():false);
            strategy.appendField(locator, this, "isAddressBlacklist", buffer, theIsAddressBlacklist);
        }
        {
            boolean theIsEmailBlacklist;
            theIsEmailBlacklist = (true?this.isIsEmailBlacklist():false);
            strategy.appendField(locator, this, "isEmailBlacklist", buffer, theIsEmailBlacklist);
        }
        {
            boolean theIsFraudBlacklist;
            theIsFraudBlacklist = (true?this.isIsFraudBlacklist():false);
            strategy.appendField(locator, this, "isFraudBlacklist", buffer, theIsFraudBlacklist);
        }
        {
            boolean theIsIdentityBlacklist;
            theIsIdentityBlacklist = (true?this.isIsIdentityBlacklist():false);
            strategy.appendField(locator, this, "isIdentityBlacklist", buffer, theIsIdentityBlacklist);
        }
        {
            XMLGregorianCalendar thePeriodAddressBlacklist;
            thePeriodAddressBlacklist = this.getPeriodAddressBlacklist();
            strategy.appendField(locator, this, "periodAddressBlacklist", buffer, thePeriodAddressBlacklist);
        }
        {
            XMLGregorianCalendar thePeriodEmailBlacklist;
            thePeriodEmailBlacklist = this.getPeriodEmailBlacklist();
            strategy.appendField(locator, this, "periodEmailBlacklist", buffer, thePeriodEmailBlacklist);
        }
        {
            XMLGregorianCalendar thePeriodFraudBlacklist;
            thePeriodFraudBlacklist = this.getPeriodFraudBlacklist();
            strategy.appendField(locator, this, "periodFraudBlacklist", buffer, thePeriodFraudBlacklist);
        }
        {
            XMLGregorianCalendar thePeriodIdentityBlacklist;
            thePeriodIdentityBlacklist = this.getPeriodIdentityBlacklist();
            strategy.appendField(locator, this, "periodIdentityBlacklist", buffer, thePeriodIdentityBlacklist);
        }
        return buffer;
    }

}
