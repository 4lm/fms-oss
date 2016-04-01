//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.02.13 at 06:20:39 AM CET 
//


package com.openfms.model.core.media.dcp.subtitles;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.openfms.model.core.media.dcp.subtitles package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Rb_QNAME = new QName("", "Rb");
    private final static QName _HGroup_QNAME = new QName("", "HGroup");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.openfms.model.core.media.dcp.subtitles
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Rt }
     * 
     */
    public Rt createRt() {
        return new Rt();
    }

    /**
     * Create an instance of {@link Subtitle }
     * 
     */
    public Subtitle createSubtitle() {
        return new Subtitle();
    }

    /**
     * Create an instance of {@link Font }
     * 
     */
    public Font createFont() {
        return new Font();
    }

    /**
     * Create an instance of {@link Text }
     * 
     */
    public Text createText() {
        return new Text();
    }

    /**
     * Create an instance of {@link Ruby }
     * 
     */
    public Ruby createRuby() {
        return new Ruby();
    }

    /**
     * Create an instance of {@link Space }
     * 
     */
    public Space createSpace() {
        return new Space();
    }

    /**
     * Create an instance of {@link Rotate }
     * 
     */
    public Rotate createRotate() {
        return new Rotate();
    }

    /**
     * Create an instance of {@link Image }
     * 
     */
    public Image createImage() {
        return new Image();
    }

    /**
     * Create an instance of {@link DCSubtitle }
     * 
     */
    public DCSubtitle createDCSubtitle() {
        return new DCSubtitle();
    }

    /**
     * Create an instance of {@link LoadFont }
     * 
     */
    public LoadFont createLoadFont() {
        return new LoadFont();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Rb")
    public JAXBElement<String> createRb(String value) {
        return new JAXBElement<String>(_Rb_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "HGroup")
    public JAXBElement<String> createHGroup(String value) {
        return new JAXBElement<String>(_HGroup_QNAME, String.class, null, value);
    }

}
