
package com.finkok.facturacion.cancel.test;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para get_out_pendingResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="get_out_pendingResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="get_out_pendingResult" type="{apps.services.soap.core.views}CancelPendingResult" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "get_out_pendingResponse", propOrder = {
    "getOutPendingResult"
})
public class GetOutPendingResponse {

    @XmlElementRef(name = "get_out_pendingResult", namespace = "http://facturacion.finkok.com/cancel", type = JAXBElement.class, required = false)
    protected JAXBElement<CancelPendingResult> getOutPendingResult;

    /**
     * Obtiene el valor de la propiedad getOutPendingResult.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CancelPendingResult }{@code >}
     *     
     */
    public JAXBElement<CancelPendingResult> getGetOutPendingResult() {
        return getOutPendingResult;
    }

    /**
     * Define el valor de la propiedad getOutPendingResult.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CancelPendingResult }{@code >}
     *     
     */
    public void setGetOutPendingResult(JAXBElement<CancelPendingResult> value) {
        this.getOutPendingResult = value;
    }

}
