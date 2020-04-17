import java.net.*;
import java.io.*;

public class ServidorTCP {
    public static void main (String args[]) {

	try{
		//Cria o socket do servidor
		ServerSocket socketServidor = new ServerSocket(7896);
		while(true) {
			System.out.println("Aguardando cliente...");
			//Recebe solicitação de socket do cliente
			Socket socketCliente = socketServidor.accept();
			//Estabelece conexão instanciando a thread 
			Connection c = new Connection(socketCliente);
		}
	} catch(IOException e) {System.out.println("Listen :"+e.getMessage());}
    }
}

class Connection extends Thread {
	DataInputStream entrada;
	DataOutputStream saida;
	Socket socketCliente;
	public Connection (Socket aSocketCliente) {
	    try {
	    	socketCliente = aSocketCliente;
	    	//Vincula streams de entrada e saída ao socket
	    	entrada = new DataInputStream(socketCliente.getInputStream());
	    	saida = new DataOutputStream(socketCliente.getOutputStream());
	    	//Inicia thread
	    	this.start();
	     } catch(IOException e) {System.out.println("Connection:"+e.getMessage());}
	}
	public void run(){
	    try {
	    	String dadosEntrada = entrada.readUTF();	                 
	    	saida.writeUTF("Servidor "+ dadosEntrada);
            System.out.println("Recebeu " + dadosEntrada);
            System.out.println("Saida " + saida.size());
	    } catch(EOFException e) {System.out.println("EOF:"+e.getMessage());
	    } catch(IOException e) {System.out.println("IO:"+e.getMessage());
	    } finally{ 
            try {
            	socketCliente.close();
            }catch (IOException e){/*erro ao fechar*/}
        }
	}
}

