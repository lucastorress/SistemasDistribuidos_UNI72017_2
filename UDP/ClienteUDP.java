import java.net.*;
import java.io.*;
 
public class ClienteUDP
{
    public static void main(String args[]) throws Exception {
        byte[] dadosEnviados = new byte[1024];
        byte[] dadosRecebidos = new byte[1024];
        DatagramSocket socketCliente = null;
        try {
            //Prepara leitura do teclado
            BufferedReader entradaDoUsuario = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Digite um numero: ");
            int dadosModificados = Integer.parseInt(entradaDoUsuario.readLine());
            String dadosCaracter = ""+dadosModificados+"";
            dadosEnviados = dadosCaracter.getBytes();
 
            //Prepara socket e endereço de servidor
            socketCliente = new DatagramSocket();
            InetAddress IPAddress = InetAddress.getByName("localhost");
           
            //Prepara pacote a ser enviado
            DatagramPacket pacoteEnviado = new DatagramPacket(dadosEnviados, dadosEnviados.length, IPAddress, 9876);
            socketCliente.send(pacoteEnviado);
           
            //Recebe pacote do servidor
            DatagramPacket pacoteRecebido = new DatagramPacket(dadosRecebidos, dadosRecebidos.length);
            System.out.println("Aguardando retorno...");
            socketCliente.receive(pacoteRecebido);
           
            //Escreve conteúdo recebido
            String entradaModificada = new String(pacoteRecebido.getData());
            System.out.println("Recebido do servidor: " + entradaModificada);
            socketCliente.close();
        }catch (SocketException e){System.out.println("Socket: " + e.getMessage());
        }catch (IOException e) {System.out.println("IO: " + e.getMessage());
        }finally {if(socketCliente != null) socketCliente.close();}
    }
}