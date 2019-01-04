
package com.finkok.facturacion.cancel;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para AceptaArray complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="AceptaArray">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Acepta" type="{apps.services.soap.core.views}Acepta" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AceptaArray", namespace = "apps.services.soap.core.views", propOrder = {
    "acepta"
})
public class AceptaArray {

    @XmlElement(name = "Acepta", nillable = true)
    protected List<Acepta> acepta;

    /**
     * Gets the value of the acepta property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the acepta property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAcepta().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Acepta }
     * 
     * 
     */
    public List<Acepta> getAcepta() {
        if (acepta == null) {
            acepta = new ArrayList<Acepta>();
        }
        return this.acepta;
    }

}
