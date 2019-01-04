
package com.finkok.facturacion.cancel;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para get_out_sat_statusResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="get_out_sat_statusResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="get_out_sat_statusResult" type="{apps.services.soap.core.views}AcuseSatEstatus" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "get_out_sat_statusResponse", propOrder = {
    "getOutSatStatusResult"
})
public class GetOutSatStatusResponse {

    @XmlElementRef(name = "get_out_sat_statusResult", namespace = "http://facturacion.finkok.com/cancel", type = JAXBElement.class, required = false)
    protected JAXBElement<AcuseSatEstatus> getOutSatStatusResult;

    /**
     * Obtiene el valor de la propiedad getOutSatStatusResult.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AcuseSatEstatus }{@code >}
     *     
     */
    public JAXBElement<AcuseSatEstatus> getGetOutSatStatusResult() {
        return getOutSatStatusResult;
    }

    /**
     * Define el valor de la propiedad getOutSatStatusResult.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AcuseSatEstatus }{@code >}
     *     
     */
    public void setGetOutSatStatusResult(JAXBElement<AcuseSatEstatus> value) {
        this.getOutSatStatusResult = value;
    }

}
