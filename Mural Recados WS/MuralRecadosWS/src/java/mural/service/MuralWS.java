/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mural.service;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.ejb.Stateless;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Lucas
 */
@WebService(serviceName = "MuralWS")
@Stateless()
public class MuralWS {
    
    private ArrayList<RecadoWS> recados;
    
    //@WebMethod(operationName = "construtor")
    public MuralWS(){
        this.recados = new ArrayList<>();
    }
    
    @WebMethod(operationName = "cadastrarRecado")
    public void cadastrarRecado(
    @WebParam(name="usuario") UsuarioWS usuario,
    @WebParam(name="recado") RecadoWS recado) {
        boolean existe = false;
        for (RecadoWS r : recados) {
            if (r.getCodigo() == recado.getCodigo()) {
                if (r.getApelidoRecado().equals(usuario.getApelido())) {
                    r.setTexto(recado.getTexto());
                    r.setApelidoRecado(recado.getApelidoRecado());
                    System.out.println("Recado ATUALIZADO com sucesso.");
                    System.out.println("--- Codigo do recado: " + recado.getCodigo());
                    System.out.println("--- Apelido do usuario: " + recado.getApelidoRecado());
                } else {
                    System.out.println("O recado não correspondente ao usuário. Tente novamente.");
                }
                existe = true;
            }
        }
        if (!existe) {
            recados.add(recado);
            System.out.println("Recado ADICIONADO com sucesso.");
        }
    }
    
    @WebMethod(operationName = "removerRecado")
    public void removerRecado(
    @WebParam(name="usuario") UsuarioWS usuario,
    @WebParam(name="codigoRecado") int codigoRecado) {
        boolean removido = false;
        for (RecadoWS r : recados) {
            if ((r.getCodigo() == codigoRecado) && (r.getApelidoRecado().equals(usuario.getApelido()))) {
                recados.remove(r);
                removido = true;
            }
        }
        if (removido) {
            System.out.println("Recado REMOVIDO com sucesso.");
        } else {
            System.out.println("Recado NÃO REMOVIDO.\n--- Verifique se o recado existe ou se o usuário é correspondente.");
        }
    }
    
    @WebMethod(operationName = "consultarRecados")
    public List<RecadoWS> consultarRecados() {
        return recados;
    }
    
    @WebMethod(operationName = "consultarRecado")
    public List<RecadoWS> consultarRecados(
    @WebParam(name="usuario") UsuarioWS usuario) {
        ArrayList<RecadoWS> recadosUsuario =  new ArrayList<>();
        for (RecadoWS r : recados) {
            if (r.getApelidoRecado().equals(usuario.getApelido())) {
                recadosUsuario.add(r);
            }
        }
        return recadosUsuario;
    }

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }
}
