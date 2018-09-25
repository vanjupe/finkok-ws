
package com.finkok.facturacion.cancel.test;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para UUIDS_AR complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="UUIDS_AR">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="uuids_ar" type="{apps.services.soap.core.views}UUID_ARArray" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UUIDS_AR", namespace = "apps.services.soap.core.views", propOrder = {
    "uuidsAr"
})
public class UUIDSAR {

    @XmlElementRef(name = "uuids_ar", namespace = "apps.services.soap.core.views", type = JAXBElement.class, required = false)
    protected JAXBElement<UUIDARArray> uuidsAr;

    /**
     * Obtiene el valor de la propiedad uuidsAr.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UUIDARArray }{@code >}
     *     
     */
    public JAXBElement<UUIDARArray> getUuidsAr() {
        return uuidsAr;
    }

    /**
     * Define el valor de la propiedad uuidsAr.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UUIDARArray }{@code >}
     *     
     */
    public void setUuidsAr(JAXBElement<UUIDARArray> value) {
        this.uuidsAr = value;
    }

}
