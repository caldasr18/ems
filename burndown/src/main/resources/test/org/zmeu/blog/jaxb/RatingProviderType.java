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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.ToString;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;


/**
 * <p>Java class for RatingProviderType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RatingProviderType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="rating_provider_id" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="list_score" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
 *         &lt;element name="list_score_timestamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" maxOccurs="unbounded"/>
 *         &lt;element name="list_score_day_of_week" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
 *         &lt;element name="list_score_distance_in_days" type="{http://www.w3.org/2001/XMLSchema}long" maxOccurs="unbounded"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RatingProviderType", propOrder = {
    "ratingProviderId",
    "listScore",
    "listScoreTimestamp",
    "listScoreDayOfWeek",
    "listScoreDistanceInDays",
    "name"
})
public class RatingProviderType
    implements ToString
{

    @XmlElement(name = "rating_provider_id")
    protected long ratingProviderId;
    @XmlElement(name = "list_score", required = true)
    protected List<String> listScore;
    @XmlElement(name = "list_score_timestamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected List<XMLGregorianCalendar> listScoreTimestamp;
    @XmlElement(name = "list_score_day_of_week", required = true)
    protected List<String> listScoreDayOfWeek;
    @XmlElement(name = "list_score_distance_in_days", type = Long.class)
    protected List<Long> listScoreDistanceInDays;
    @XmlElement(required = true)
    protected String name;

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
     * Gets the value of the listScore property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listScore property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListScore().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getListScore() {
        if (listScore == null) {
            listScore = new ArrayList<String>();
        }
        return this.listScore;
    }

    /**
     * Gets the value of the listScoreTimestamp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listScoreTimestamp property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListScoreTimestamp().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link XMLGregorianCalendar }
     * 
     * 
     */
    public List<XMLGregorianCalendar> getListScoreTimestamp() {
        if (listScoreTimestamp == null) {
            listScoreTimestamp = new ArrayList<XMLGregorianCalendar>();
        }
        return this.listScoreTimestamp;
    }

    /**
     * Gets the value of the listScoreDayOfWeek property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listScoreDayOfWeek property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListScoreDayOfWeek().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getListScoreDayOfWeek() {
        if (listScoreDayOfWeek == null) {
            listScoreDayOfWeek = new ArrayList<String>();
        }
        return this.listScoreDayOfWeek;
    }

    /**
     * Gets the value of the listScoreDistanceInDays property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listScoreDistanceInDays property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListScoreDistanceInDays().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Long }
     * 
     * 
     */
    public List<Long> getListScoreDistanceInDays() {
        if (listScoreDistanceInDays == null) {
            listScoreDistanceInDays = new ArrayList<Long>();
        }
        return this.listScoreDistanceInDays;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
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
            long theRatingProviderId;
            theRatingProviderId = (true?this.getRatingProviderId(): 0L);
            strategy.appendField(locator, this, "ratingProviderId", buffer, theRatingProviderId);
        }
        {
            List<String> theListScore;
            theListScore = (((this.listScore!= null)&&(!this.listScore.isEmpty()))?this.getListScore():null);
            strategy.appendField(locator, this, "listScore", buffer, theListScore);
        }
        {
            List<XMLGregorianCalendar> theListScoreTimestamp;
            theListScoreTimestamp = (((this.listScoreTimestamp!= null)&&(!this.listScoreTimestamp.isEmpty()))?this.getListScoreTimestamp():null);
            strategy.appendField(locator, this, "listScoreTimestamp", buffer, theListScoreTimestamp);
        }
        {
            List<String> theListScoreDayOfWeek;
            theListScoreDayOfWeek = (((this.listScoreDayOfWeek!= null)&&(!this.listScoreDayOfWeek.isEmpty()))?this.getListScoreDayOfWeek():null);
            strategy.appendField(locator, this, "listScoreDayOfWeek", buffer, theListScoreDayOfWeek);
        }
        {
            List<Long> theListScoreDistanceInDays;
            theListScoreDistanceInDays = (((this.listScoreDistanceInDays!= null)&&(!this.listScoreDistanceInDays.isEmpty()))?this.getListScoreDistanceInDays():null);
            strategy.appendField(locator, this, "listScoreDistanceInDays", buffer, theListScoreDistanceInDays);
        }
        {
            String theName;
            theName = this.getName();
            strategy.appendField(locator, this, "name", buffer, theName);
        }
        return buffer;
    }

}
