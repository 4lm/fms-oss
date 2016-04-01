//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.02.18 at 10:12:23 PM CST 
//


package com.openfms.utils.dcp.interop.pkl;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlList;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for PictureTrackFileAssetType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PictureTrackFileAssetType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.digicine.com/PROTO-ASDCP-CPL-20040511#}TrackFileAssetType">
 *       &lt;sequence>
 *         &lt;element name="FrameRate" type="{http://www.digicine.com/PROTO-ASDCP-CPL-20040511#}Rational"/>
 *         &lt;element name="ScreenAspectRatio">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
 *                 &lt;attribute name="scope" type="{http://www.w3.org/2001/XMLSchema}anyURI" default="http://www.digicine.com/PROTO-ASDCP-CPL-20040511#standard-aspectratio" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PictureTrackFileAssetType", namespace = "http://www.digicine.com/PROTO-ASDCP-CPL-20040511#", propOrder = {
    "frameRate",
    "screenAspectRatio"
})
public class PictureTrackFileAssetType
    extends TrackFileAssetType
{

    @XmlList
    @XmlElement(name = "FrameRate", type = Long.class)
    protected List<Long> frameRate;
    @XmlElement(name = "ScreenAspectRatio", required = true)
    protected PictureTrackFileAssetType.ScreenAspectRatio screenAspectRatio;

    /**
     * Gets the value of the frameRate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the frameRate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFrameRate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Long }
     * 
     * 
     */
    public List<Long> getFrameRate() {
        if (frameRate == null) {
            frameRate = new ArrayList<Long>();
        }
        return this.frameRate;
    }

    /**
     * Gets the value of the screenAspectRatio property.
     * 
     * @return
     *     possible object is
     *     {@link PictureTrackFileAssetType.ScreenAspectRatio }
     *     
     */
    public PictureTrackFileAssetType.ScreenAspectRatio getScreenAspectRatio() {
        return screenAspectRatio;
    }

    /**
     * Sets the value of the screenAspectRatio property.
     * 
     * @param value
     *     allowed object is
     *     {@link PictureTrackFileAssetType.ScreenAspectRatio }
     *     
     */
    public void setScreenAspectRatio(PictureTrackFileAssetType.ScreenAspectRatio value) {
        this.screenAspectRatio = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
     *       &lt;attribute name="scope" type="{http://www.w3.org/2001/XMLSchema}anyURI" default="http://www.digicine.com/PROTO-ASDCP-CPL-20040511#standard-aspectratio" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class ScreenAspectRatio {

        @XmlValue
        protected BigDecimal value;
        @XmlAttribute(name = "scope")
        @XmlSchemaType(name = "anyURI")
        protected String scope;

        /**
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setValue(BigDecimal value) {
            this.value = value;
        }

        /**
         * Gets the value of the scope property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getScope() {
            if (scope == null) {
                return "http://www.digicine.com/PROTO-ASDCP-CPL-20040511#standard-aspectratio";
            } else {
                return scope;
            }
        }

        /**
         * Sets the value of the scope property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setScope(String value) {
            this.scope = value;
        }

    }

}
