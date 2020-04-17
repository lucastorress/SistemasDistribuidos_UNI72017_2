/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mural.service;

/**
 *
 * @author Lucas
 */
public class Recado {
    private int codigoRecado;
    private String textoRecado;
    private String apelidoRecado;
    
    public Recado(int codigo, String texto, String apelido) {
        this.codigoRecado = codigo;
        this.textoRecado = texto;
        this.apelidoRecado = apelido;
    }
    
    public int getCodigo() {
        return this.codigoRecado;
    }
    public void setCodigo(int codigo) {
        this.codigoRecado = codigo;
    }
    
    public String getTexto() {
        return this.textoRecado;
    }
    public void setTexto(String texto) {
        this.textoRecado = texto;
    }
    
    public String getApelidoRecado() {
        return this.apelidoRecado;
    }
    public void setApelidoRecado(String apelido) {
        this.apelidoRecado = apelido;
    }
}