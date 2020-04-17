
package mural.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebService(name = "UsuarioWS", targetNamespace = "http://service.mural/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface UsuarioWS {


    /**
     * 
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getId", targetNamespace = "http://service.mural/", className = "mural.service.GetId")
    @ResponseWrapper(localName = "getIdResponse", targetNamespace = "http://service.mural/", className = "mural.service.GetIdResponse")
    @Action(input = "http://service.mural/UsuarioWS/getIdRequest", output = "http://service.mural/UsuarioWS/getIdResponse")
    public int getId();

    /**
     * 
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getApelido", targetNamespace = "http://service.mural/", className = "mural.service.GetApelido")
    @ResponseWrapper(localName = "getApelidoResponse", targetNamespace = "http://service.mural/", className = "mural.service.GetApelidoResponse")
    @Action(input = "http://service.mural/UsuarioWS/getApelidoRequest", output = "http://service.mural/UsuarioWS/getApelidoResponse")
    public String getApelido();

    /**
     * 
     * @param name
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "hello", targetNamespace = "http://service.mural/", className = "mural.service.Hello")
    @ResponseWrapper(localName = "helloResponse", targetNamespace = "http://service.mural/", className = "mural.service.HelloResponse")
    @Action(input = "http://service.mural/UsuarioWS/helloRequest", output = "http://service.mural/UsuarioWS/helloResponse")
    public String hello(
        @WebParam(name = "name", targetNamespace = "")
        String name);

    /**
     * 
     * @param apelidoUsuario
     */
    @WebMethod(operationName = "SetApelido")
    @RequestWrapper(localName = "SetApelido", targetNamespace = "http://service.mural/", className = "mural.service.SetApelido")
    @ResponseWrapper(localName = "SetApelidoResponse", targetNamespace = "http://service.mural/", className = "mural.service.SetApelidoResponse")
    @Action(input = "http://service.mural/UsuarioWS/SetApelidoRequest", output = "http://service.mural/UsuarioWS/SetApelidoResponse")
    public void setApelido(
        @WebParam(name = "apelidoUsuario", targetNamespace = "")
        String apelidoUsuario);

    /**
     * 
     * @param id
     */
    @WebMethod
    @RequestWrapper(localName = "setId", targetNamespace = "http://service.mural/", className = "mural.service.SetId")
    @ResponseWrapper(localName = "setIdResponse", targetNamespace = "http://service.mural/", className = "mural.service.SetIdResponse")
    @Action(input = "http://service.mural/UsuarioWS/setIdRequest", output = "http://service.mural/UsuarioWS/setIdResponse")
    public void setId(
        @WebParam(name = "id", targetNamespace = "")
        int id);

}
