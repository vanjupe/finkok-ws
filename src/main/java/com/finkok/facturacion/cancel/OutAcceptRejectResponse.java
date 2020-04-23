
package com.finkok.facturacion.cancel;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para out_accept_rejectResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="out_accept_rejectResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="out_accept_rejectResult" type="{apps.services.soap.core.views}AcceptRejectResult" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "out_accept_rejectResponse", propOrder = {
    "outAcceptRejectResult"
})
public class OutAcceptRejectResponse {

    @XmlElementRef(name = "out_accept_rejectResult", namespace = "http://facturacion.finkok.com/cancel", type = JAXBElement.class, required = false)
    protected JAXBElement<AcceptRejectResult> outAcceptRejectResult;

    /**
     * Obtiene el valor de la propiedad outAcceptRejectResult.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AcceptRejectResult }{@code >}
     *     
     */
    public JAXBElement<AcceptRejectResult> getOutAcceptRejectResult() {
        return outAcceptRejectResult;
    }

    /**
     * Define el valor de la propiedad outAcceptRejectResult.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AcceptRejectResult }{@code >}
     *     
     */
    public void setOutAcceptRejectResult(JAXBElement<AcceptRejectResult> value) {
        this.outAcceptRejectResult = value;
    }

}
