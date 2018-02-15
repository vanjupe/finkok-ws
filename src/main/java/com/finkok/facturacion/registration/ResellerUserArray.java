
package com.finkok.facturacion.registration;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ResellerUserArray complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ResellerUserArray">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ResellerUser" type="{apps.services.soap.core.views}ResellerUser" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResellerUserArray", namespace = "apps.services.soap.core.views", propOrder = {
    "resellerUser"
})
public class ResellerUserArray {

    @XmlElement(name = "ResellerUser", nillable = true)
    protected List<ResellerUser> resellerUser;

    /**
     * Gets the value of the resellerUser property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the resellerUser property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResellerUser().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ResellerUser }
     * 
     * 
     */
    public List<ResellerUser> getResellerUser() {
        if (resellerUser == null) {
            resellerUser = new ArrayList<ResellerUser>();
        }
        return this.resellerUser;
    }

}
