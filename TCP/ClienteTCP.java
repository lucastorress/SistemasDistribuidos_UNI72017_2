import java.net.*;
import java.util.Scanner;
import java.io.*;
 
public class ClienteTCP {
    public static void main (String args[]) {
        Socket socketCliente = null;
        try{
            //Cria o socket
            socketCliente = new Socket("localhost", 7896);    
            //Vincula os streams de entrada e saida
            DataInputStream entrada = new DataInputStream(socketCliente.getInputStream());
            DataOutputStream saida = new DataOutputStream(socketCliente.getOutputStream());
            //Prepara leitura do teclado
            Scanner s = new Scanner(System.in);
            System.out.println("Digite 1 para Solicitar\nDigite 2 para Devolver\n------------->");
            int respostaOperacao = s.nextInt();
           
            if (respostaOperacao == 1) {
                //Escreve no stream de saida
                //Tipo da Operação Solicitação
                saida.writeInt(1);
                
                //Digita o nome da Pessoa
                //System.out.println("Digite o seu nome:\n------------->");
                //String respostaPessoa = s.nextLine();
                saida.writeUTF("Lucas");
                
                //Digita o ID da Estação
                System.out.println("Escolha a estação:\n1. Maraponga\n2. Aldeota\n3. UNI7\n------------->");
                int respostaEstacao = s.nextInt();
                saida.writeInt(respostaEstacao);
            } else {
                //Escreve no stream de saida
                //Tipo da Operação Solicitação
                saida.writeInt(2);
                
                //Digita o nome da Pessoa
                //System.out.println("Digite o seu nome:\n------------->");
                //String respostaPessoa = s.nextLine();
                saida.writeUTF("Lucas");
                
                //Digita o ID da Estação
                System.out.println("Escolha a estação:\n1. Maraponga\n2. Aldeota\n3. UNI7\n------------->");
                int respostaEstacao = s.nextInt();
                saida.writeInt(respostaEstacao);
            }
           
            //Recebe no stream de entrada
            String data = entrada.readUTF();         
            System.out.println("Recebeu do servidor:\n"+ data);      
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