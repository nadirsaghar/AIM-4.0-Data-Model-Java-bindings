//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.05.24 at 10:41:57 PM EDT 
//


package edu.emory.cci.aim.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CalculationResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CalculationResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="unitOfMeasure" type="{uri:iso.org:21090}ST"/>
 *         &lt;element name="dataType" type="{uri:iso.org:21090}CD"/>
 *         &lt;element name="dimensionCollection">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Dimension" type="{gme://caCORE.caCORE/4.4/edu.northwestern.radiology.AIM}Dimension" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="type" use="required" type="{gme://caCORE.caCORE/4.4/edu.northwestern.radiology.AIM}CalculationResultIdentifier" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CalculationResult", namespace = "gme://caCORE.caCORE/4.4/edu.northwestern.radiology.AIM", propOrder = {
    "unitOfMeasure",
    "dataType",
    "dimensionCollection"
})
@XmlSeeAlso({
    ExtendedCalculationResult.class,
    CompactCalculationResult.class
})
public abstract class CalculationResult {

    @XmlElement(required = true)
    protected ST unitOfMeasure;
    @XmlElement(required = true)
    protected CD dataType;
    @XmlElement(required = true)
    protected CalculationResult.DimensionCollection dimensionCollection;
    @XmlAttribute(required = true)
    protected CalculationResultIdentifier type;

    /**
     * Gets the value of the unitOfMeasure property.
     * 
     * @return
     *     possible object is
     *     {@link ST }
     *     
     */
    public ST getUnitOfMeasure() {
        return unitOfMeasure;
    }

    /**
     * Sets the value of the unitOfMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link ST }
     *     
     */
    public void setUnitOfMeasure(ST value) {
        this.unitOfMeasure = value;
    }

    /**
     * Gets the value of the dataType property.
     * 
     * @return
     *     possible object is
     *     {@link CD }
     *     
     */
    public CD getDataType() {
        return dataType;
    }

    /**
     * Sets the value of the dataType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CD }
     *     
     */
    public void setDataType(CD value) {
        this.dataType = value;
    }

    /**
     * Gets the value of the dimensionCollection property.
     * 
     * @return
     *     possible object is
     *     {@link CalculationResult.DimensionCollection }
     *     
     */
    public CalculationResult.DimensionCollection getDimensionCollection() {
        return dimensionCollection;
    }

    /**
     * Sets the value of the dimensionCollection property.
     * 
     * @param value
     *     allowed object is
     *     {@link CalculationResult.DimensionCollection }
     *     
     */
    public void setDimensionCollection(CalculationResult.DimensionCollection value) {
        this.dimensionCollection = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link CalculationResultIdentifier }
     *     
     */
    public CalculationResultIdentifier getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link CalculationResultIdentifier }
     *     
     */
    public void setType(CalculationResultIdentifier value) {
        this.type = value;
    }


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
     *         &lt;element name="Dimension" type="{gme://caCORE.caCORE/4.4/edu.northwestern.radiology.AIM}Dimension" maxOccurs="unbounded"/>
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
        "dimension"
    })
    public static class DimensionCollection {

        @XmlElement(name = "Dimension", namespace = "gme://caCORE.caCORE/4.4/edu.northwestern.radiology.AIM", required = true)
        protected List<Dimension> dimension;

        /**
         * Gets the value of the dimension property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the dimension property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDimension().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Dimension }
         * 
         * 
         */
        public List<Dimension> getDimension() {
            if (dimension == null) {
                dimension = new ArrayList<Dimension>();
            }
            return this.dimension;
        }

    }

}
