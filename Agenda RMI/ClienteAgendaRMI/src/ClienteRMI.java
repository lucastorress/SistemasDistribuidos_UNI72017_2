
import java.rmi.Naming;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 1727819
 */
public class ClienteRMI {
    public static void main(String[] args) {
        try {
            IAgenda agenda = (IAgenda) Naming.lookup("//localhost:2020/AgendaServer");
            
            Contato c1 = new Contato();
            c1.setCod(1);
            c1.setNome("Lucas");
            c1.setFone("85 996426187");
            agenda.registrarContato(c1);
            
            Contato c2 = new Contato();
            c2.setCod(2);
            c2.setNome("Kalebe");
            c2.setFone("85 34932558");
            agenda.registrarContato(c2);
            
            List<Contato> contatos = agenda.consultarContatos();
            for (Contato c : contatos) {
                System.out.println("Nome: " + c.getNome());
                System.out.println("Telefone: " + c.getFone());
            }
            
        } catch (Exception e) {
            System.out.println("HelloClient exception: " + e.getMessage());
            e.printStackTrace();
        }
    }    
}
