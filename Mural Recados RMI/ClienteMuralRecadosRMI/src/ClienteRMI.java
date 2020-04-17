import java.rmi.Naming;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lucas
 */
public class ClienteRMI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            IMural mural = (IMural) Naming.lookup("//localhost:2020/MuralServer");
            
            //Inicializa os usuários
            Usuario u1 = new Usuario();
            u1.setId(1);
            u1.setApelido("lucas");
            
            Usuario u2 = new Usuario();
            u2.setId(2);
            u2.setApelido("torres");
            
            //Inicializa os recados
            Recado r1 = new Recado();
            r1.setCodigo(1);
            r1.setApelidoRecado(u1.getApelido());
            r1.setTexto("Meu primeiro recado. -Lucas");
            mural.cadastrarRecado(u1, r1);
            
            Recado r2 = new Recado();
            r2.setCodigo(1);
            r2.setApelidoRecado(u2.getApelido());
            r2.setTexto("Meu primeiro recado. -Torres");
            mural.cadastrarRecado(u2, r2);
            
            Recado r3 = new Recado();
            r3.setCodigo(2);
            r3.setApelidoRecado(u2.getApelido());
            r3.setTexto("Meu segundo recado. -Torres");
            mural.cadastrarRecado(u2, r3);
            
            //Inicializa os recados
            Recado r4 = new Recado();
            r4.setCodigo(3);
            r4.setApelidoRecado(u1.getApelido());
            r4.setTexto("Meu segundo recado. -Lucas");
            mural.cadastrarRecado(u1, r4);
            
            Recado r5 = new Recado();
            r5.setCodigo(2);
            r5.setApelidoRecado(u2.getApelido());
            r5.setTexto("Meu terceiro recado. -Torres");
            mural.cadastrarRecado(u2, r5);
            
            List<Recado> recadosLista = mural.consultarRecados();
            for (Recado r : recadosLista) {
                System.out.println("Codigo do Recado: " + r.getCodigo());
                System.out.println("Apelido: " + r.getApelidoRecado());
                System.out.println("--- Mensagem:\n" + r.getTexto() + "\n--- FIM");
            }
            System.out.println("Quantidade total de recados: " + recadosLista.size());
            
            List<Recado> recadosU1 = mural.consultarRecados(u1);
            for (Recado r : recadosU1) {
                System.out.println("Codigo do Recado: " + r.getCodigo());
                System.out.println("Apelido: " + r.getApelidoRecado());
                System.out.println("--- Mensagem:\n" + r.getTexto() + "\n--- FIM");
            }
            System.out.println("Quantidade total de recados: " + recadosU1.size());
            
            List<Recado> recadosU2 = mural.consultarRecados(u2);
            for (Recado r : recadosU2) {
                System.out.println("Codigo do Recado: " + r.getCodigo());
                System.out.println("Apelido: " + r.getApelidoRecado());
                System.out.println("--- Mensagem:\n" + r.getTexto() + "\n--- FIM");
            }
            System.out.println("Quantidade total de recados: " + recadosU2.size());            
            
        } catch (Exception e) {
            System.out.println("HelloClient exception: " + e.getMessage());
            e.printStackTrace();
        }
    }
    
}
