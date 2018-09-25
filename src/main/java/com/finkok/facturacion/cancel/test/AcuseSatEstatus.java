
package com.finkok.facturacion.cancel.test;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para AcuseSatEstatus complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="AcuseSatEstatus">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="error" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sat" type="{apps.services.soap.core.views}AcuseSATConsulta" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AcuseSatEstatus", namespace = "apps.services.soap.core.views", propOrder = {
    "error",
    "sat"
})
public class AcuseSatEstatus {

    @XmlElementRef(name = "error", namespace = "apps.services.soap.core.views", type = JAXBElement.class, required = false)
    protected JAXBElement<String> error;
    @XmlElementRef(name = "sat", namespace = "apps.services.soap.core.views", type = JAXBElement.class, required = false)
    protected JAXBElement<AcuseSATConsulta> sat;

    /**
     * Obtiene el valor de la propiedad error.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getError() {
        return error;
    }

    /**
     * Define el valor de la propiedad error.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setError(JAXBElement<String> value) {
        this.error = value;
    }

    /**
     * Obtiene el valor de la propiedad sat.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AcuseSATConsulta }{@code >}
     *     
     */
    public JAXBElement<AcuseSATConsulta> getSat() {
        return sat;
    }

    /**
     * Define el valor de la propiedad sat.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AcuseSATConsulta }{@code >}
     *     
     */
    public void setSat(JAXBElement<AcuseSATConsulta> value) {
        this.sat = value;
    }

}
