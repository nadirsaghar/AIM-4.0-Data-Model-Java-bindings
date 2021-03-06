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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ImageSeries complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ImageSeries">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="instanceUid" type="{uri:iso.org:21090}II"/>
 *         &lt;element name="modality" type="{uri:iso.org:21090}CD"/>
 *         &lt;element name="imageCollection">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Image" type="{gme://caCORE.caCORE/4.4/edu.northwestern.radiology.AIM}Image" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ImageSeries", namespace = "gme://caCORE.caCORE/4.4/edu.northwestern.radiology.AIM", propOrder = {
    "instanceUid",
    "modality",
    "imageCollection"
})
public class ImageSeries {

    @XmlElement(required = true)
    protected II instanceUid;
    @XmlElement(required = true)
    protected CD modality;
    @XmlElement(required = true)
    protected ImageSeries.ImageCollection imageCollection;

    /**
     * Gets the value of the instanceUid property.
     * 
     * @return
     *     possible object is
     *     {@link II }
     *     
     */
    public II getInstanceUid() {
        return instanceUid;
    }

    /**
     * Sets the value of the instanceUid property.
     * 
     * @param value
     *     allowed object is
     *     {@link II }
     *     
     */
    public void setInstanceUid(II value) {
        this.instanceUid = value;
    }

    /**
     * Gets the value of the modality property.
     * 
     * @return
     *     possible object is
     *     {@link CD }
     *     
     */
    public CD getModality() {
        return modality;
    }

    /**
     * Sets the value of the modality property.
     * 
     * @param value
     *     allowed object is
     *     {@link CD }
     *     
     */
    public void setModality(CD value) {
        this.modality = value;
    }

    /**
     * Gets the value of the imageCollection property.
     * 
     * @return
     *     possible object is
     *     {@link ImageSeries.ImageCollection }
     *     
     */
    public ImageSeries.ImageCollection getImageCollection() {
        return imageCollection;
    }

    /**
     * Sets the value of the imageCollection property.
     * 
     * @param value
     *     allowed object is
     *     {@link ImageSeries.ImageCollection }
     *     
     */
    public void setImageCollection(ImageSeries.ImageCollection value) {
        this.imageCollection = value;
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
     *         &lt;element name="Image" type="{gme://caCORE.caCORE/4.4/edu.northwestern.radiology.AIM}Image" maxOccurs="unbounded"/>
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
        "image"
    })
    public static class ImageCollection {

        @XmlElement(name = "Image", namespace = "gme://caCORE.caCORE/4.4/edu.northwestern.radiology.AIM", required = true)
        protected List<Image> image;

        /**
         * Gets the value of the image property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the image property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getImage().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Image }
         * 
         * 
         */
        public List<Image> getImage() {
            if (image == null) {
                image = new ArrayList<Image>();
            }
            return this.image;
        }

    }

}
