
package com.finkok.facturacion.cancel.test;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para UUID_ARArray complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="UUID_ARArray">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="UUID_AR" type="{apps.services.soap.core.views}UUID_AR" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UUID_ARArray", namespace = "apps.services.soap.core.views", propOrder = {
    "uuidar"
})
public class UUIDARArray {

    @XmlElement(name = "UUID_AR", required = true, nillable = true)
    protected List<UUIDAR> uuidar;

    /**
     * Gets the value of the uuidar property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the uuidar property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUUIDAR().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UUIDAR }
     * 
     * 
     */
    public List<UUIDAR> getUUIDAR() {
        if (uuidar == null) {
            uuidar = new ArrayList<UUIDAR>();
        }
        return this.uuidar;
    }

}
