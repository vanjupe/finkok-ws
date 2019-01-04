
package com.finkok.facturacion.cancel.test;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para HijoArray complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="HijoArray">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Hijo" type="{apps.services.soap.core.views}Hijo" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HijoArray", namespace = "apps.services.soap.core.views", propOrder = {
    "hijo"
})
public class HijoArray {

    @XmlElement(name = "Hijo", nillable = true)
    protected List<Hijo> hijo;

    /**
     * Gets the value of the hijo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hijo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHijo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Hijo }
     * 
     * 
     */
    public List<Hijo> getHijo() {
        if (hijo == null) {
            hijo = new ArrayList<Hijo>();
        }
        return this.hijo;
    }

}
