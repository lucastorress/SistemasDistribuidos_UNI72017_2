
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
 * @author 1727819
 */
public class AgendaImpl extends UnicastRemoteObject implements IAgenda {
    
    private static final long serialVersionUID = 1L;
    private ArrayList<Contato> contatos;
    
    public AgendaImpl() throws RemoteException{
        contatos = new ArrayList<Contato>();
    }

    @Override
    public void registrarContato(Contato contato) throws RemoteException {
        boolean existe = false;
        for (Contato c : contatos) {
            if (c.getCod() == contato.getCod()) {
                c.setNome(contato.getNome());
                c.setFone(contato.getFone());
                existe = true;
            }
        }
        if (!existe) {
            contatos.add(contato);
        }
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Contato consultarContato(int codigo) throws RemoteException {
        for (Contato c : contatos) {
            if (c.getCod() == codigo) {
                return c;
            }
        }
        return null;
    }

    @Override
    public List<Contato> consultarContatos() throws RemoteException {
        return contatos;
    }
    
}
