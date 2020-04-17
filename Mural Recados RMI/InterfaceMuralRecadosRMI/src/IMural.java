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
 * @author Lucas
 */
public interface IMural extends Remote {
    void cadastrarRecado(Usuario usuario, Recado recado) throws RemoteException;
    void removerRecado(Usuario usuario, int codigoRecado) throws RemoteException;
    List<Recado> consultarRecados() throws RemoteException;
    List<Recado> consultarRecados(Usuario usuario) throws RemoteException;
}
