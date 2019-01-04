
package com.finkok.facturacion.cancel;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para accept_rejectResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="accept_rejectResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="accept_rejectResult" type="{apps.services.soap.core.views}AcceptRejectResult" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "accept_rejectResponse", propOrder = {
    "acceptRejectResult"
})
public class AcceptRejectResponse {

    @XmlElementRef(name = "accept_rejectResult", namespace = "http://facturacion.finkok.com/cancel", type = JAXBElement.class, required = false)
    protected JAXBElement<AcceptRejectResult> acceptRejectResult;

    /**
     * Obtiene el valor de la propiedad acceptRejectResult.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AcceptRejectResult }{@code >}
     *     
     */
    public JAXBElement<AcceptRejectResult> getAcceptRejectResult() {
        return acceptRejectResult;
    }

    /**
     * Define el valor de la propiedad acceptRejectResult.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AcceptRejectResult }{@code >}
     *     
     */
    public void setAcceptRejectResult(JAXBElement<AcceptRejectResult> value) {
        this.acceptRejectResult = value;
    }

}
