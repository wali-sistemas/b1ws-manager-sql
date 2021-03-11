
package co.manager.b1ws.item;

import javax.xml.bind.annotation.*;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.sap.com/SBO/DIS}ItemParams" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "itemParams"
})
@XmlRootElement(name = "GetByParams", namespace = "ItemsService")
public class GetByParams {

    @XmlElement(name = "ItemParams")
    protected ItemParams itemParams;

    /**
     * Obtiene el valor de la propiedad itemParams.
     * 
     * @return
     *     possible object is
     *     {@link ItemParams }
     *     
     */
    public ItemParams getItemParams() {
        return itemParams;
    }

    /**
     * Define el valor de la propiedad itemParams.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemParams }
     *     
     */
    public void setItemParams(ItemParams value) {
        this.itemParams = value;
    }

}
