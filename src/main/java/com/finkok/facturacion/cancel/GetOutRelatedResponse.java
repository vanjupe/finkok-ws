
package com.finkok.facturacion.cancel;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para get_out_relatedResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="get_out_relatedResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="get_out_relatedResult" type="{apps.services.soap.core.views}RelatedResult" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "get_out_relatedResponse", propOrder = {
    "getOutRelatedResult"
})
public class GetOutRelatedResponse {

    @XmlElementRef(name = "get_out_relatedResult", namespace = "http://facturacion.finkok.com/cancel", type = JAXBElement.class, required = false)
    protected JAXBElement<RelatedResult> getOutRelatedResult;

    /**
     * Obtiene el valor de la propiedad getOutRelatedResult.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RelatedResult }{@code >}
     *     
     */
    public JAXBElement<RelatedResult> getGetOutRelatedResult() {
        return getOutRelatedResult;
    }

    /**
     * Define el valor de la propiedad getOutRelatedResult.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RelatedResult }{@code >}
     *     
     */
    public void setGetOutRelatedResult(JAXBElement<RelatedResult> value) {
        this.getOutRelatedResult = value;
    }

}
