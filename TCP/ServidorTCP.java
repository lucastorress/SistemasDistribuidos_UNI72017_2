import java.net.*;
import java.io.*;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
 
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
    DataOperation dados;
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
    @Override
    public void run(){
        try {
            int dadosEntradaOp = entrada.readInt();
            String dadosEntradaPessoa = entrada.readUTF();
            int dadosEntradaEstacao = entrada.readInt();
                       
            if (dadosEntradaOp == 1) {
                dados = new DataOperation();
                
                DateFormat dataReal = new SimpleDateFormat("dd/MM/yyyy");
                DateFormat hourReal = new SimpleDateFormat("HH:mm:ss");
                DateFormat dataFull = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
                Date date = new Date();
                
                dados.setOperation(dadosEntradaOp);
                dados.setNome(dadosEntradaPessoa);
                dados.setEstacao(dadosEntradaEstacao);
                dados.setData(dataReal.format(date));
                dados.setHora(hourReal.format(date));
                dados.setDataFull(dataFull.format(date));
                
                saida.writeUTF(
                        "Operação: Solicitação\n" +
                        "Nome: " + dadosEntradaPessoa + "\n" +
                        "Estação: " + dadosEntradaEstacao + "\n" +
                        "Data: " + dataReal.format(date) + "\n" +
                        "Hora: " + hourReal.format(date)
                );
            } else {
                //DateFormat dataReal = new SimpleDateFormat("dd/MM/yyyy");
                //DateFormat hourReal = new SimpleDateFormat("HH:mm:ss");
                //Date date = new Date();
                //saida.writeUTF("Operação: Devolucao, Data: " + dataReal.format(date) + ", Hora: " + hourReal.format(date));
                saida.writeUTF(
                        "Operação: Devolução\n" +
                        "Nome: " + dados.getNome() + "\n" +
                        "Estação: " + dados.getEstacao() + "\n" +
                        "Data: " + dados.getData() + "\n" +
                        "Hora: " + dados.getHora()
                );
                
                try {
                    if (dados.diferenca("10/09/2018 18:10:45")) {
                        saida.writeUTF("Cobrança: R$5");
                    } else {
                        saida.writeUTF("Cobrança: NADA");
                    }
                } catch (ParseException ex) {
                    Logger.getLogger(Connection.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
           
        } catch(EOFException e) {System.out.println("EOF:"+e.getMessage());
        } catch(IOException e) {System.out.println("IO:"+e.getMessage());
        } finally{
            try {
                socketCliente.close();
            }catch (IOException e){/*erro ao fechar*/}
        }
    }
}