//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.02.13 at 06:19:14 AM CET 
//


package com.openfms.model.core.media.dcp.interop.cpl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProjectorDataAssetType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProjectorDataAssetType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.digicine.com/PROTO-ASDCP-CPL-20040511#}GenericAssetType">
 *       &lt;sequence>
 *         &lt;element name="DataInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProjectorDataAssetType", namespace = "http://www.digicine.com/PROTO-ASDCP-CPL-20040511#", propOrder = {
    "dataInfo"
})
public class ProjectorDataAssetType
    extends GenericAssetType
{

    @XmlElement(name = "DataInfo")
    protected String dataInfo;

    /**
     * Gets the value of the dataInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataInfo() {
        return dataInfo;
    }

    /**
     * Sets the value of the dataInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataInfo(String value) {
        this.dataInfo = value;
    }

}
