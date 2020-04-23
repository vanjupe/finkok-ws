
package com.finkok.facturacion.cancel;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para RechazaArray complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="RechazaArray"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Rechaza" type="{apps.services.soap.core.views}Rechaza" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RechazaArray", namespace = "apps.services.soap.core.views", propOrder = {
    "rechaza"
})
public class RechazaArray {

    @XmlElement(name = "Rechaza", nillable = true)
    protected List<Rechaza> rechaza;

    /**
     * Gets the value of the rechaza property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rechaza property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRechaza().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Rechaza }
     * 
     * 
     */
    public List<Rechaza> getRechaza() {
        if (rechaza == null) {
            rechaza = new ArrayList<Rechaza>();
        }
        return this.rechaza;
    }

}
