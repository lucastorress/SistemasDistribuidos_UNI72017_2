import java.rmi.Remote;
import java.rmi.RemoteException;
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
public interface IAgenda extends Remote {
    void registrarContato(Contato contato) throws RemoteException;
    Contato consultarContato(int codigo) throws RemoteException;
    List<Contato> consultarContatos() throws RemoteException;
}
