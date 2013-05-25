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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GeometricShapeEntity complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GeometricShapeEntity">
 *   &lt;complexContent>
 *     &lt;extension base="{gme://caCORE.caCORE/4.4/edu.northwestern.radiology.AIM}MarkupEntity">
 *       &lt;sequence>
 *         &lt;element name="questionTypeCode" type="{uri:iso.org:21090}CD" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="shapeIdentifier" type="{uri:iso.org:21090}INT"/>
 *         &lt;element name="label" type="{uri:iso.org:21090}ST" minOccurs="0"/>
 *         &lt;element name="description" type="{uri:iso.org:21090}ST" minOccurs="0"/>
 *         &lt;element name="includeFlag" type="{uri:iso.org:21090}BL"/>
 *         &lt;element name="comment" type="{uri:iso.org:21090}ST" minOccurs="0"/>
 *         &lt;element name="lineColor" type="{uri:iso.org:21090}ST" minOccurs="0"/>
 *         &lt;element name="lineOpacity" type="{uri:iso.org:21090}ST" minOccurs="0"/>
 *         &lt;element name="lineStyle" type="{uri:iso.org:21090}ST" minOccurs="0"/>
 *         &lt;element name="lineThickness" type="{uri:iso.org:21090}ST" minOccurs="0"/>
 *         &lt;element name="questionIndex" type="{uri:iso.org:21090}INT" minOccurs="0"/>
 *         &lt;element name="interpolationMethod" type="{uri:iso.org:21090}CD" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GeometricShapeEntity", namespace = "gme://caCORE.caCORE/4.4/edu.northwestern.radiology.AIM", propOrder = {
    "questionTypeCode",
    "shapeIdentifier",
    "label",
    "description",
    "includeFlag",
    "comment",
    "lineColor",
    "lineOpacity",
    "lineStyle",
    "lineThickness",
    "questionIndex",
    "interpolationMethod"
})
@XmlSeeAlso({
    TwoDimensionGeometricShapeEntity.class,
    ThreeDimensionGeometricShapeEntity.class
})
public abstract class GeometricShapeEntity
    extends MarkupEntity
{

    protected List<CD> questionTypeCode;
    @XmlElement(required = true)
    protected INT shapeIdentifier;
    protected ST label;
    protected ST description;
    @XmlElement(required = true)
    protected BL includeFlag;
    protected ST comment;
    protected ST lineColor;
    protected ST lineOpacity;
    protected ST lineStyle;
    protected ST lineThickness;
    protected INT questionIndex;
    protected CD interpolationMethod;

    /**
     * Gets the value of the questionTypeCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the questionTypeCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQuestionTypeCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CD }
     * 
     * 
     */
    public List<CD> getQuestionTypeCode() {
        if (questionTypeCode == null) {
            questionTypeCode = new ArrayList<CD>();
        }
        return this.questionTypeCode;
    }

    /**
     * Gets the value of the shapeIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link INT }
     *     
     */
    public INT getShapeIdentifier() {
        return shapeIdentifier;
    }

    /**
     * Sets the value of the shapeIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link INT }
     *     
     */
    public void setShapeIdentifier(INT value) {
        this.shapeIdentifier = value;
    }

    /**
     * Gets the value of the label property.
     * 
     * @return
     *     possible object is
     *     {@link ST }
     *     
     */
    public ST getLabel() {
        return label;
    }

    /**
     * Sets the value of the label property.
     * 
     * @param value
     *     allowed object is
     *     {@link ST }
     *     
     */
    public void setLabel(ST value) {
        this.label = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link ST }
     *     
     */
    public ST getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link ST }
     *     
     */
    public void setDescription(ST value) {
        this.description = value;
    }

    /**
     * Gets the value of the includeFlag property.
     * 
     * @return
     *     possible object is
     *     {@link BL }
     *     
     */
    public BL getIncludeFlag() {
        return includeFlag;
    }

    /**
     * Sets the value of the includeFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link BL }
     *     
     */
    public void setIncludeFlag(BL value) {
        this.includeFlag = value;
    }

    /**
     * Gets the value of the comment property.
     * 
     * @return
     *     possible object is
     *     {@link ST }
     *     
     */
    public ST getComment() {
        return comment;
    }

    /**
     * Sets the value of the comment property.
     * 
     * @param value
     *     allowed object is
     *     {@link ST }
     *     
     */
    public void setComment(ST value) {
        this.comment = value;
    }

    /**
     * Gets the value of the lineColor property.
     * 
     * @return
     *     possible object is
     *     {@link ST }
     *     
     */
    public ST getLineColor() {
        return lineColor;
    }

    /**
     * Sets the value of the lineColor property.
     * 
     * @param value
     *     allowed object is
     *     {@link ST }
     *     
     */
    public void setLineColor(ST value) {
        this.lineColor = value;
    }

    /**
     * Gets the value of the lineOpacity property.
     * 
     * @return
     *     possible object is
     *     {@link ST }
     *     
     */
    public ST getLineOpacity() {
        return lineOpacity;
    }

    /**
     * Sets the value of the lineOpacity property.
     * 
     * @param value
     *     allowed object is
     *     {@link ST }
     *     
     */
    public void setLineOpacity(ST value) {
        this.lineOpacity = value;
    }

    /**
     * Gets the value of the lineStyle property.
     * 
     * @return
     *     possible object is
     *     {@link ST }
     *     
     */
    public ST getLineStyle() {
        return lineStyle;
    }

    /**
     * Sets the value of the lineStyle property.
     * 
     * @param value
     *     allowed object is
     *     {@link ST }
     *     
     */
    public void setLineStyle(ST value) {
        this.lineStyle = value;
    }

    /**
     * Gets the value of the lineThickness property.
     * 
     * @return
     *     possible object is
     *     {@link ST }
     *     
     */
    public ST getLineThickness() {
        return lineThickness;
    }

    /**
     * Sets the value of the lineThickness property.
     * 
     * @param value
     *     allowed object is
     *     {@link ST }
     *     
     */
    public void setLineThickness(ST value) {
        this.lineThickness = value;
    }

    /**
     * Gets the value of the questionIndex property.
     * 
     * @return
     *     possible object is
     *     {@link INT }
     *     
     */
    public INT getQuestionIndex() {
        return questionIndex;
    }

    /**
     * Sets the value of the questionIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link INT }
     *     
     */
    public void setQuestionIndex(INT value) {
        this.questionIndex = value;
    }

    /**
     * Gets the value of the interpolationMethod property.
     * 
     * @return
     *     possible object is
     *     {@link CD }
     *     
     */
    public CD getInterpolationMethod() {
        return interpolationMethod;
    }

    /**
     * Sets the value of the interpolationMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link CD }
     *     
     */
    public void setInterpolationMethod(CD value) {
        this.interpolationMethod = value;
    }

}
