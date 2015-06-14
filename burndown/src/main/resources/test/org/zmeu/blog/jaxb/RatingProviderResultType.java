//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.04.19 at 01:24:49 AM CEST 
//


package org.zmeu.blog.jaxb;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.ToString;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;


/**
 * <p>Java class for RatingProviderResultType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RatingProviderResultType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="person_returned" type="{}PersonReturnedType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="exception_occured" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="is_approved" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="list_textual_field" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
 *         &lt;element name="person_identified" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="rating_provider_id" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="score" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RatingProviderResultType", propOrder = {
    "personReturned",
    "exceptionOccured",
    "isApproved",
    "listTextualField",
    "personIdentified",
    "ratingProviderId",
    "score"
})
public class RatingProviderResultType
    implements ToString
{

    @XmlElement(name = "person_returned")
    protected List<PersonReturnedType> personReturned;
    @XmlElement(name = "exception_occured")
    protected boolean exceptionOccured;
    @XmlElement(name = "is_approved")
    protected boolean isApproved;
    @XmlElement(name = "list_textual_field", required = true)
    protected List<String> listTextualField;
    @XmlElement(name = "person_identified")
    protected boolean personIdentified;
    @XmlElement(name = "rating_provider_id")
    protected long ratingProviderId;
    @XmlElement(required = true)
    protected String score;

    /**
     * Gets the value of the personReturned property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the personReturned property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPersonReturned().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PersonReturnedType }
     * 
     * 
     */
    public List<PersonReturnedType> getPersonReturned() {
        if (personReturned == null) {
            personReturned = new ArrayList<PersonReturnedType>();
        }
        return this.personReturned;
    }

    /**
     * Gets the value of the exceptionOccured property.
     * 
     */
    public boolean isExceptionOccured() {
        return exceptionOccured;
    }

    /**
     * Sets the value of the exceptionOccured property.
     * 
     */
    public void setExceptionOccured(boolean value) {
        this.exceptionOccured = value;
    }

    /**
     * Gets the value of the isApproved property.
     * 
     */
    public boolean isIsApproved() {
        return isApproved;
    }

    /**
     * Sets the value of the isApproved property.
     * 
     */
    public void setIsApproved(boolean value) {
        this.isApproved = value;
    }

    /**
     * Gets the value of the listTextualField property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listTextualField property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListTextualField().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getListTextualField() {
        if (listTextualField == null) {
            listTextualField = new ArrayList<String>();
        }
        return this.listTextualField;
    }

    /**
     * Gets the value of the personIdentified property.
     * 
     */
    public boolean isPersonIdentified() {
        return personIdentified;
    }

    /**
     * Sets the value of the personIdentified property.
     * 
     */
    public void setPersonIdentified(boolean value) {
        this.personIdentified = value;
    }

    /**
     * Gets the value of the ratingProviderId property.
     * 
     */
    public long getRatingProviderId() {
        return ratingProviderId;
    }

    /**
     * Sets the value of the ratingProviderId property.
     * 
     */
    public void setRatingProviderId(long value) {
        this.ratingProviderId = value;
    }

    /**
     * Gets the value of the score property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScore() {
        return score;
    }

    /**
     * Sets the value of the score property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScore(String value) {
        this.score = value;
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
            List<PersonReturnedType> thePersonReturned;
            thePersonReturned = (((this.personReturned!= null)&&(!this.personReturned.isEmpty()))?this.getPersonReturned():null);
            strategy.appendField(locator, this, "personReturned", buffer, thePersonReturned);
        }
        {
            boolean theExceptionOccured;
            theExceptionOccured = (true?this.isExceptionOccured():false);
            strategy.appendField(locator, this, "exceptionOccured", buffer, theExceptionOccured);
        }
        {
            boolean theIsApproved;
            theIsApproved = (true?this.isIsApproved():false);
            strategy.appendField(locator, this, "isApproved", buffer, theIsApproved);
        }
        {
            List<String> theListTextualField;
            theListTextualField = (((this.listTextualField!= null)&&(!this.listTextualField.isEmpty()))?this.getListTextualField():null);
            strategy.appendField(locator, this, "listTextualField", buffer, theListTextualField);
        }
        {
            boolean thePersonIdentified;
            thePersonIdentified = (true?this.isPersonIdentified():false);
            strategy.appendField(locator, this, "personIdentified", buffer, thePersonIdentified);
        }
        {
            long theRatingProviderId;
            theRatingProviderId = (true?this.getRatingProviderId(): 0L);
            strategy.appendField(locator, this, "ratingProviderId", buffer, theRatingProviderId);
        }
        {
            String theScore;
            theScore = this.getScore();
            strategy.appendField(locator, this, "score", buffer, theScore);
        }
        return buffer;
    }

}