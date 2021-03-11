
package co.manager.b1ws.businessPartners;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.sap.com/SBO/DIS}BusinessPartnerParams" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "businessPartnerParams"
})
@XmlRootElement(name = "GetByParams", namespace = "BusinessPartnersService")
public class GetByParams {

    @XmlElement(name = "BusinessPartnerParams")
    protected BusinessPartnerParams businessPartnerParams;

    /**
     * Obtiene el valor de la propiedad businessPartnerParams.
     * 
     * @return
     *     possible object is
     *     {@link BusinessPartnerParams }
     *     
     */
    public BusinessPartnerParams getBusinessPartnerParams() {
        return businessPartnerParams;
    }

    /**
     * Define el valor de la propiedad businessPartnerParams.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessPartnerParams }
     *     
     */
    public void setBusinessPartnerParams(BusinessPartnerParams value) {
        this.businessPartnerParams = value;
    }

}
