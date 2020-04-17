
package mural.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de removerRecado complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="removerRecado">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="usuario" type="{http://service.mural/}usuarioWS" minOccurs="0"/>
 *         &lt;element name="codigoRecado" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "removerRecado", propOrder = {
    "usuario",
    "codigoRecado"
})
public class RemoverRecado {

    protected UsuarioWS usuario;
    protected int codigoRecado;

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
     * Obtém o valor da propriedade codigoRecado.
     * 
     */
    public int getCodigoRecado() {
        return codigoRecado;
    }

    /**
     * Define o valor da propriedade codigoRecado.
     * 
     */
    public void setCodigoRecado(int value) {
        this.codigoRecado = value;
    }

}
