
package com.finkok.facturacion.cancel.test;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para get_pendingResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="get_pendingResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="get_pendingResult" type="{apps.services.soap.core.views}CancelPendingResult" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "get_pendingResponse", propOrder = {
    "getPendingResult"
})
public class GetPendingResponse {

    @XmlElementRef(name = "get_pendingResult", namespace = "http://facturacion.finkok.com/cancel", type = JAXBElement.class, required = false)
    protected JAXBElement<CancelPendingResult> getPendingResult;

    /**
     * Obtiene el valor de la propiedad getPendingResult.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CancelPendingResult }{@code >}
     *     
     */
    public JAXBElement<CancelPendingResult> getGetPendingResult() {
        return getPendingResult;
    }

    /**
     * Define el valor de la propiedad getPendingResult.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CancelPendingResult }{@code >}
     *     
     */
    public void setGetPendingResult(JAXBElement<CancelPendingResult> value) {
        this.getPendingResult = value;
    }

}
