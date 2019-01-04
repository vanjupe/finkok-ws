
package com.finkok.facturacion.cancel.test;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para PadreArray complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="PadreArray">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Padre" type="{apps.services.soap.core.views}Padre" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PadreArray", namespace = "apps.services.soap.core.views", propOrder = {
    "padre"
})
public class PadreArray {

    @XmlElement(name = "Padre", nillable = true)
    protected List<Padre> padre;

    /**
     * Gets the value of the padre property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the padre property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPadre().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Padre }
     * 
     * 
     */
    public List<Padre> getPadre() {
        if (padre == null) {
            padre = new ArrayList<Padre>();
        }
        return this.padre;
    }

}
