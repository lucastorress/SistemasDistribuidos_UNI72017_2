import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
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
public class MuralImpl extends UnicastRemoteObject implements IMural {
    
    private static final long serialVersionUID = 1L;
    private ArrayList<Recado> recados;
    
    public MuralImpl() throws RemoteException{
        this.recados = new ArrayList<Recado>();
    }

    @Override
    public void cadastrarRecado(Usuario usuario, Recado recado) throws RemoteException {
            boolean existe = false;
            for (Recado r : recados) {
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
        
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void removerRecado(Usuario usuario, int codigoRecado) throws RemoteException {
        boolean removido = false;
        for (Recado r : recados) {
            if ((r.getCodigo() == codigoRecado) && (r.getApelidoRecado() == usuario.getApelido())) {
                recados.remove(r);
                removido = true;
            }
        }
        if (removido) {
            System.out.println("Recado REMOVIDO com sucesso.");
        } else {
            System.out.println("Recado NÃO REMOVIDO.\n--- Verifique se o recado existe ou se o usuário é correspondente.");
        }
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Recado> consultarRecados() throws RemoteException {
        return recados;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public List<Recado> consultarRecados(Usuario usuario) throws RemoteException {
        ArrayList<Recado> recadosUsuario =  new ArrayList<>();
        for (Recado r : recados) {
            if (r.getApelidoRecado().equals(usuario.getApelido())) {
                recadosUsuario.add(r);
            }
        }
        return recadosUsuario;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
