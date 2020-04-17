
package mural.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de SetApelido complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="SetApelido">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="apelidoUsuario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SetApelido", propOrder = {
    "apelidoUsuario"
})
public class SetApelido {

    protected String apelidoUsuario;

    /**
     * Obtém o valor da propriedade apelidoUsuario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApelidoUsuario() {
        return apelidoUsuario;
    }

    /**
     * Define o valor da propriedade apelidoUsuario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApelidoUsuario(String value) {
        this.apelidoUsuario = value;
    }

}
