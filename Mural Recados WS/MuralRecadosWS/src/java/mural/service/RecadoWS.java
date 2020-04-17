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
@WebService(serviceName = "RecadoWS")
public class RecadoWS {
    private int codigoRecado;
    private String textoRecado;
    private String apelidoRecado;
    
    @WebMethod(operationName = "getCodigo")
    public int getCodigo() {
        return this.codigoRecado;
    }
    @WebMethod(operationName = "setCodigo")
    public void setCodigo(@WebParam(name="codigo") int codigo) {
        this.codigoRecado = codigo;
    }
    
    @WebMethod(operationName = "getTexto")
    public String getTexto() {
        return this.textoRecado;
    }
    @WebMethod(operationName = "setTexto")
    public void setTexto(@WebParam(name="texto") String texto) {
        this.textoRecado = texto;
    }
    
    @WebMethod(operationName = "getApelidoRecado")
    public String getApelidoRecado() {
        return this.apelidoRecado;
    }
    @WebMethod(operationName = "setApelidoRecado")
    public void setApelidoRecado(@WebParam(name="apelidoRecado") String apelido) {
        this.apelidoRecado = apelido;
    }

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }
}
