
package com.finkok.facturacion.cancel.test;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para get_relatedResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="get_relatedResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="get_relatedResult" type="{apps.services.soap.core.views}RelatedResult" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "get_relatedResponse", propOrder = {
    "getRelatedResult"
})
public class GetRelatedResponse {

    @XmlElementRef(name = "get_relatedResult", namespace = "http://facturacion.finkok.com/cancel", type = JAXBElement.class, required = false)
    protected JAXBElement<RelatedResult> getRelatedResult;

    /**
     * Obtiene el valor de la propiedad getRelatedResult.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RelatedResult }{@code >}
     *     
     */
    public JAXBElement<RelatedResult> getGetRelatedResult() {
        return getRelatedResult;
    }

    /**
     * Define el valor de la propiedad getRelatedResult.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RelatedResult }{@code >}
     *     
     */
    public void setGetRelatedResult(JAXBElement<RelatedResult> value) {
        this.getRelatedResult = value;
    }

}
