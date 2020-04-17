import static java.lang.Math.abs;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lucas
 */
public class DataOperation {

	private Integer operation;
	private String nome;
	private Integer estacao;
        private String data;
        private String hora;
        private String dataFull;
        
	public Integer getOperation() {
		return operation;
	}

	public void setOperation(Integer operation) {
		this.operation = operation;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getEstacao() {
		return estacao;
	}

	public void setEstacao(int estacao) {
		this.estacao = estacao;
	}
        
        public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}
        
        public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}
        
        public String getDataFull() {
		return hora;
	}

	public void setDataFull(String dataFull) {
		this.dataFull = dataFull;
	}
        
        /*
            Faz o cálculo da diferença entre o horário de solicitação e devolução
            Se for maior que 30 minutos (1.800.000 milissegundos), retorna true
        */
        public boolean diferenca(String horaDevolucao) throws ParseException {
            
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
            Date date = sdf.parse(horaDevolucao);
            long milisecondSolicita = date.getTime();
            
            date = sdf.parse(this.dataFull);
            long milisecondDevolver = date.getTime();
            
            long pagamento = abs(milisecondDevolver - milisecondSolicita);
            
            return pagamento > 1800000; //Maior do que 30 minutos
        }

	@Override
	public String toString() {

            return "Operação: "+operation+ "" +
                    "\n"+ "Nome: "+nome+"" +
                    "\n"+"Estação: "+estacao+"" +
                    "\n"+"Data: "+data+"" +
                    "\n"+"Hora: "+hora+"";
	}
} 