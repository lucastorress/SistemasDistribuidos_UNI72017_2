
package mural.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de setApelidoRecado complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="setApelidoRecado">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="apelidoRecado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "setApelidoRecado", propOrder = {
    "apelidoRecado"
})
public class SetApelidoRecado {

    protected String apelidoRecado;

    /**
     * Obtém o valor da propriedade apelidoRecado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApelidoRecado() {
        return apelidoRecado;
    }

    /**
     * Define o valor da propriedade apelidoRecado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApelidoRecado(String value) {
        this.apelidoRecado = value;
    }

}
