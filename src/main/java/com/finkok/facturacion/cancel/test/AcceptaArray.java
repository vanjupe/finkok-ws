
package com.finkok.facturacion.cancel.test;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para AcceptaArray complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="AcceptaArray">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Accepta" type="{apps.services.soap.core.views}Accepta" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AcceptaArray", namespace = "apps.services.soap.core.views", propOrder = {
    "accepta"
})
public class AcceptaArray {

    @XmlElement(name = "Accepta", nillable = true)
    protected List<Accepta> accepta;

    /**
     * Gets the value of the accepta property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the accepta property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAccepta().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Accepta }
     * 
     * 
     */
    public List<Accepta> getAccepta() {
        if (accepta == null) {
            accepta = new ArrayList<Accepta>();
        }
        return this.accepta;
    }

}
