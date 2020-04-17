import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lucas
 */
public class ServidorRMI {
    public static void main(String[] args) {
        try {
            MuralImpl mural = new MuralImpl();
            LocateRegistry.createRegistry(2020);
            Naming.rebind("//localhost:2020/MuralServer", mural);
            
            System.out.println("Servidor Mural ativo.");
        } catch (Exception e) {
            System.out.println("Servidor Mural erro: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
