
import java.io.Serializable;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 1727819
 */

public class Contato implements Serializable {
    private static final long serialVersionUID = 1L;
    private int cod;
    private String nome;
    private String fone;
    
    public int getCod() {
        return this.cod;
    }
    public void setCod(int cod) {
        this.cod = cod;
    }
    
    public String getNome() {
        return this.nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getFone() {
        return this.fone;
    }
    public void setFone(String fone) {
        this.fone = fone;
    }
    
}
