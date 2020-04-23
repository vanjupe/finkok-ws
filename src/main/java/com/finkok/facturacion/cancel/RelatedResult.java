
package com.finkok.facturacion.cancel;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para RelatedResult complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="RelatedResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Padres" type="{apps.services.soap.core.views}PadreArray" minOccurs="0"/&gt;
 *         &lt;element name="error" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Hijos" type="{apps.services.soap.core.views}HijoArray" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RelatedResult", namespace = "apps.services.soap.core.views", propOrder = {
    "padres",
    "error",
    "hijos"
})
public class RelatedResult {

    @XmlElementRef(name = "Padres", namespace = "apps.services.soap.core.views", type = JAXBElement.class, required = false)
    protected JAXBElement<PadreArray> padres;
    @XmlElementRef(name = "error", namespace = "apps.services.soap.core.views", type = JAXBElement.class, required = false)
    protected JAXBElement<String> error;
    @XmlElementRef(name = "Hijos", namespace = "apps.services.soap.core.views", type = JAXBElement.class, required = false)
    protected JAXBElement<HijoArray> hijos;

    /**
     * Obtiene el valor de la propiedad padres.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PadreArray }{@code >}
     *     
     */
    public JAXBElement<PadreArray> getPadres() {
        return padres;
    }

    /**
     * Define el valor de la propiedad padres.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PadreArray }{@code >}
     *     
     */
    public void setPadres(JAXBElement<PadreArray> value) {
        this.padres = value;
    }

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
     * Obtiene el valor de la propiedad hijos.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link HijoArray }{@code >}
     *     
     */
    public JAXBElement<HijoArray> getHijos() {
        return hijos;
    }

    /**
     * Define el valor de la propiedad hijos.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link HijoArray }{@code >}
     *     
     */
    public void setHijos(JAXBElement<HijoArray> value) {
        this.hijos = value;
    }

}
