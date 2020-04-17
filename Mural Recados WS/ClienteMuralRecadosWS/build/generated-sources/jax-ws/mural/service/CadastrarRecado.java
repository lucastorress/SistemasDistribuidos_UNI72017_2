
package mural.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de cadastrarRecado complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="cadastrarRecado">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="usuario" type="{http://service.mural/}usuarioWS" minOccurs="0"/>
 *         &lt;element name="recado" type="{http://service.mural/}recadoWS" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cadastrarRecado", propOrder = {
    "usuario",
    "recado"
})
public class CadastrarRecado {

    protected UsuarioWS usuario;
    protected RecadoWS recado;

    /**
     * Obtém o valor da propriedade usuario.
     * 
     * @return
     *     possible object is
     *     {@link UsuarioWS }
     *     
     */
    public UsuarioWS getUsuario() {
        return usuario;
    }

    /**
     * Define o valor da propriedade usuario.
     * 
     * @param value
     *     allowed object is
     *     {@link UsuarioWS }
     *     
     */
    public void setUsuario(UsuarioWS value) {
        this.usuario = value;
    }

    /**
     * Obtém o valor da propriedade recado.
     * 
     * @return
     *     possible object is
     *     {@link RecadoWS }
     *     
     */
    public RecadoWS getRecado() {
        return recado;
    }

    /**
     * Define o valor da propriedade recado.
     * 
     * @param value
     *     allowed object is
     *     {@link RecadoWS }
     *     
     */
    public void setRecado(RecadoWS value) {
        this.recado = value;
    }

}
