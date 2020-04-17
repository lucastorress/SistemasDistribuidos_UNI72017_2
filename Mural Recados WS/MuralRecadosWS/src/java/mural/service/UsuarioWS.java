/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mural.service;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Lucas
 */
@WebService(serviceName = "UsuarioWS")
public class UsuarioWS {
    private int id;
    private String apelidoUsuario;
    
    @WebMethod(operationName = "getId")
    public int getId() {
        return this.id;
    }
    @WebMethod(operationName = "setId")
    public void setId(@WebParam(name="id") int id) {
        this.id = id;
    }
    
    @WebMethod(operationName = "getApelido")
    public String getApelido() {
        return this.apelidoUsuario;
    }
    @WebMethod(operationName = "SetApelido")
    public void setApelido(@WebParam(name="apelidoUsuario") String apelido) {
        this.apelidoUsuario = apelido;
    }

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }
}
