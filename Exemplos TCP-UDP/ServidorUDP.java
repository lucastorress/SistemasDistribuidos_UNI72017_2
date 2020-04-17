import java.io.*;
import java.net.*;

public class ServidorUDP
{
	public static void main(String args[]) throws Exception {
        byte[] dadosRecebidos = new byte[1024];
        byte[] dadosEnviados = new byte[1024];

        DatagramSocket socketServidor = null;
        try{
	        //Inicializa o socket com a porta 9876
			socketServidor = new DatagramSocket(9876);
	
			while(true) {
	        	//Socket recebe um pacote
	        	DatagramPacket pacoteRecebido = 
					new DatagramPacket(dadosRecebidos, dadosRecebidos.length);
	        	System.out.println("Esperando clientes:");
	        	socketServidor.receive(pacoteRecebido);

	        	//O conteúdo é mostrado
	            String conteudoRecebido = new String(pacoteRecebido.getData());
	            System.out.println("Recebido: " + conteudoRecebido);
	            
	            //Endereço e porta de origem são recuperados
	            InetAddress IPAddress = pacoteRecebido.getAddress();
	            int port = pacoteRecebido.getPort();
	            //Os dados recebidos são alterados (transformados em maiúsculas)
	            String conteudoAlterado = conteudoRecebido.toUpperCase();
	            dadosEnviados = conteudoAlterado.getBytes();
	            //Um pacote é preparado e enviado
	            DatagramPacket pacoteEnviado = 
					new DatagramPacket(dadosEnviados, dadosEnviados.length, 
					IPAddress, port);
	            socketServidor.send(pacoteEnviado);
	            System.out.println("Enviado para porta " + port + ": " + conteudoAlterado);
	        }
        }catch (SocketException e){System.out.println("Socket: " + e.getMessage());
		}catch (IOException e) {System.out.println("IO: " + e.getMessage());
		}finally {if(socketServidor != null) socketServidor.close();}
	}
}