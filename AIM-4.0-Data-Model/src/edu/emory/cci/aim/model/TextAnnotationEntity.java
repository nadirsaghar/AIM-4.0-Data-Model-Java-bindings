//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.05.24 at 10:41:57 PM EDT 
//


package edu.emory.cci.aim.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TextAnnotationEntity complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TextAnnotationEntity">
 *   &lt;complexContent>
 *     &lt;extension base="{gme://caCORE.caCORE/4.4/edu.northwestern.radiology.AIM}MarkupEntity">
 *       &lt;sequence>
 *         &lt;element name="text" type="{uri:iso.org:21090}ST"/>
 *         &lt;element name="font" type="{uri:iso.org:21090}ST" minOccurs="0"/>
 *         &lt;element name="fontColor" type="{uri:iso.org:21090}ST" minOccurs="0"/>
 *         &lt;element name="fontEffect" type="{uri:iso.org:21090}ST" minOccurs="0"/>
 *         &lt;element name="fontSize" type="{uri:iso.org:21090}ST" minOccurs="0"/>
 *         &lt;element name="fontStyle" type="{uri:iso.org:21090}ST" minOccurs="0"/>
 *         &lt;element name="textJustify" type="{uri:iso.org:21090}ST" minOccurs="0"/>
 *         &lt;element name="fontOpacity" type="{uri:iso.org:21090}ST" minOccurs="0"/>
 *         &lt;element name="geometricShapeEntity" type="{gme://caCORE.caCORE/4.4/edu.northwestern.radiology.AIM}GeometricShapeEntity" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TextAnnotationEntity", namespace = "gme://caCORE.caCORE/4.4/edu.northwestern.radiology.AIM", propOrder = {
    "text",
    "font",
    "fontColor",
    "fontEffect",
    "fontSize",
    "fontStyle",
    "textJustify",
    "fontOpacity",
    "geometricShapeEntity"
})
public class TextAnnotationEntity
    extends MarkupEntity
{

    @XmlElement(required = true)
    protected ST text;
    protected ST font;
    protected ST fontColor;
    protected ST fontEffect;
    protected ST fontSize;
    protected ST fontStyle;
    protected ST textJustify;
    protected ST fontOpacity;
    protected GeometricShapeEntity geometricShapeEntity;

    /**
     * Gets the value of the text property.
     * 
     * @return
     *     possible object is
     *     {@link ST }
     *     
     */
    public ST getText() {
        return text;
    }

    /**
     * Sets the value of the text property.
     * 
     * @param value
     *     allowed object is
     *     {@link ST }
     *     
     */
    public void setText(ST value) {
        this.text = value;
    }

    /**
     * Gets the value of the font property.
     * 
     * @return
     *     possible object is
     *     {@link ST }
     *     
     */
    public ST getFont() {
        return font;
    }

    /**
     * Sets the value of the font property.
     * 
     * @param value
     *     allowed object is
     *     {@link ST }
     *     
     */
    public void setFont(ST value) {
        this.font = value;
    }

    /**
     * Gets the value of the fontColor property.
     * 
     * @return
     *     possible object is
     *     {@link ST }
     *     
     */
    public ST getFontColor() {
        return fontColor;
    }

    /**
     * Sets the value of the fontColor property.
     * 
     * @param value
     *     allowed object is
     *     {@link ST }
     *     
     */
    public void setFontColor(ST value) {
        this.fontColor = value;
    }

    /**
     * Gets the value of the fontEffect property.
     * 
     * @return
     *     possible object is
     *     {@link ST }
     *     
     */
    public ST getFontEffect() {
        return fontEffect;
    }

    /**
     * Sets the value of the fontEffect property.
     * 
     * @param value
     *     allowed object is
     *     {@link ST }
     *     
     */
    public void setFontEffect(ST value) {
        this.fontEffect = value;
    }

    /**
     * Gets the value of the fontSize property.
     * 
     * @return
     *     possible object is
     *     {@link ST }
     *     
     */
    public ST getFontSize() {
        return fontSize;
    }

    /**
     * Sets the value of the fontSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link ST }
     *     
     */
    public void setFontSize(ST value) {
        this.fontSize = value;
    }

    /**
     * Gets the value of the fontStyle property.
     * 
     * @return
     *     possible object is
     *     {@link ST }
     *     
     */
    public ST getFontStyle() {
        return fontStyle;
    }

    /**
     * Sets the value of the fontStyle property.
     * 
     * @param value
     *     allowed object is
     *     {@link ST }
     *     
     */
    public void setFontStyle(ST value) {
        this.fontStyle = value;
    }

    /**
     * Gets the value of the textJustify property.
     * 
     * @return
     *     possible object is
     *     {@link ST }
     *     
     */
    public ST getTextJustify() {
        return textJustify;
    }

    /**
     * Sets the value of the textJustify property.
     * 
     * @param value
     *     allowed object is
     *     {@link ST }
     *     
     */
    public void setTextJustify(ST value) {
        this.textJustify = value;
    }

    /**
     * Gets the value of the fontOpacity property.
     * 
     * @return
     *     possible object is
     *     {@link ST }
     *     
     */
    public ST getFontOpacity() {
        return fontOpacity;
    }

    /**
     * Sets the value of the fontOpacity property.
     * 
     * @param value
     *     allowed object is
     *     {@link ST }
     *     
     */
    public void setFontOpacity(ST value) {
        this.fontOpacity = value;
    }

    /**
     * Gets the value of the geometricShapeEntity property.
     * 
     * @return
     *     possible object is
     *     {@link GeometricShapeEntity }
     *     
     */
    public GeometricShapeEntity getGeometricShapeEntity() {
        return geometricShapeEntity;
    }

    /**
     * Sets the value of the geometricShapeEntity property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeometricShapeEntity }
     *     
     */
    public void setGeometricShapeEntity(GeometricShapeEntity value) {
        this.geometricShapeEntity = value;
    }

}
