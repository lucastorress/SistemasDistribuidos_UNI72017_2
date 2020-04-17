
import java.net.*;
import java.io.*;

public class ClienteTCP {
	public static void main (String args[]) {
		Socket socketCliente = null;
	    try{
	    	//Cria o socket
	    	socketCliente = new Socket("localhost", 7896);    
			//Vincula os streams de enrada e saida
	    	DataInputStream entrada = new DataInputStream(socketCliente.getInputStream());
			DataOutputStream saida = new DataOutputStream(socketCliente.getOutputStream());
			//Escreve no stream de saida
			saida.writeUTF("Msg para o servidor");
			//Recebe no stream de entrada
			String data = entrada.readUTF();	      
			System.out.println("Recebeu do servidor: "+ data);      
	    }catch (UnknownHostException e){
				System.out.println("Socket:"+e.getMessage()); 
		}catch (EOFException e){System.out.println("EOF:"+e.getMessage());
    	}catch (IOException e){System.out.println("IO:"+e.getMessage());
        }finally {
        	if(socketCliente!=null) try {
        		socketCliente.close(); 
                }catch (IOException e){System.out.println("close:"+e.getMessage());
            }
        }
  	}
}