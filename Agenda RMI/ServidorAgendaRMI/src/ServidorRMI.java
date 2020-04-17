
import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 1727819
 */
public class ServidorRMI {
    public static void main(String[] args) {
        try {
            AgendaImpl agenda = new AgendaImpl();
            LocateRegistry.createRegistry(2020);
            Naming.rebind("//localhost:2020/AgendaServer", agenda);
            
            System.out.println("Servidor Agenda ativo.");
        } catch (Exception e) {
            System.out.println("Servidor Agenda erro: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
