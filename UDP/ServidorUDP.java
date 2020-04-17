import java.io.*;
import java.net.*;
 
public class ServidorUDP
{
    public static void main(String args[]) throws Exception {
        byte[] dadosRecebidos1 = new byte[1024];
        byte[] dadosRecebidos2 = new byte[1024];
        byte[] dadosEnviados = new byte[1024];
 
        try(DatagramSocket socketServidor = new DatagramSocket(9876)) {
   
        //Inicializa o socket com a porta 9876
        while(true) {
                //Socket recebe um pacote (IMPAR)
                DatagramPacket pacoteRecebido1 =
                    new DatagramPacket(dadosRecebidos1, dadosRecebidos1.length);
                System.out.println("Esperando clientes (1):");
                socketServidor.receive(pacoteRecebido1);
               
                //Socket recebe outro pacote (PAR)
                DatagramPacket pacoteRecebido2 =
                    new DatagramPacket(dadosRecebidos2, dadosRecebidos2.length);
                System.out.println("Esperando clientes (2):");
                socketServidor.receive(pacoteRecebido2);
 
                //O conteúdo é mostrado (1)
                String conteudoRecebido1 = new String(pacoteRecebido1.getData());
                System.out.println("Recebido (1): " + conteudoRecebido1);
               
                //O conteúdo é mostrado (2)
                String conteudoRecebido2 = new String(pacoteRecebido2.getData());
                System.out.println("Recebido (2): " + conteudoRecebido2);
               
                String conteudoEnviado = "Sem resultado";
                
                System.out.println(conteudoRecebido1.equals("1"));
                System.out.println(conteudoRecebido2.equals("2"));
                
                //Integer cr1 = new Integer(conteudoRecebido1);
                //Integer cr2 = new Integer(conteudoRecebido2);
               
                int teste_paridade = 1 + 2;
                if (teste_paridade%2 == 0) {
                    //Os dados são enviados
                    //String conteudoEnviado = conteudoRecebido2;
                    //dadosEnviados = conteudoEnviado.getBytes();
                    conteudoEnviado = "Vencedor 1 (PAR)";
                } else {
                    //Os dados são enviados
                    //String conteudoEnviado = conteudoRecebido1;
                    //dadosEnviados = conteudoEnviado.getBytes();
                    conteudoEnviado = "Vencedor 2 (IMPAR)";
                }
                
                //Utiliza método getBytes para String
                dadosEnviados = conteudoEnviado.getBytes();
                
                //Endereço e porta de origem são recuperados (1)
                InetAddress IPAddress1 = pacoteRecebido1.getAddress();
                int port1 = pacoteRecebido1.getPort();
               
                //Endereço e porta de origem são recuperados (2)
                InetAddress IPAddress2 = pacoteRecebido2.getAddress();
                int port2 = pacoteRecebido2.getPort();
               
                //Um pacote é preparado e enviado (1)
                DatagramPacket pacoteEnviado1 =
                    new DatagramPacket(dadosEnviados, dadosEnviados.length,
                    IPAddress1, port1);
                socketServidor.send(pacoteEnviado1);
                System.out.println("Enviado para porta " + port1 + ": " + conteudoEnviado);
               
              //Um pacote é preparado e enviado (2)
                DatagramPacket pacoteEnviado2 =
                    new DatagramPacket(dadosEnviados, dadosEnviados.length,
                    IPAddress2, port2);
                socketServidor.send(pacoteEnviado2);
                System.out.println("Enviado para porta " + port2 + ": " + conteudoEnviado);
               
            }
        }catch (SocketException e){System.out.println("Socket: " + e.getMessage());
        }catch (IOException e) {System.out.println("IO: " + e.getMessage());
        }
    }
}