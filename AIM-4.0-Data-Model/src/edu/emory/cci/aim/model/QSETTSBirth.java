//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.05.24 at 10:41:57 PM EDT 
//


package edu.emory.cci.aim.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QSET_TS.Birth complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QSET_TS.Birth">
 *   &lt;complexContent>
 *     &lt;extension base="{uri:iso.org:21090}ANY">
 *       &lt;sequence>
 *         &lt;element name="originalText" type="{uri:iso.org:21090}ED.Text" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QSET_TS.Birth", propOrder = {
    "originalText"
})
@XmlSeeAlso({
    QSUTSBirth.class,
    PIVLTSBirth.class,
    QSSTSBirth.class,
    QSITSBirth.class,
    QSDTSBirth.class,
    QSPTSBirth.class,
    EIVLTSBirth.class,
    IVLTSBirth.class
})
public abstract class QSETTSBirth
    extends ANY
{

    protected EDText originalText;

    /**
     * Gets the value of the originalText property.
     * 
     * @return
     *     possible object is
     *     {@link EDText }
     *     
     */
    public EDText getOriginalText() {
        return originalText;
    }

    /**
     * Sets the value of the originalText property.
     * 
     * @param value
     *     allowed object is
     *     {@link EDText }
     *     
     */
    public void setOriginalText(EDText value) {
        this.originalText = value;
    }

}
