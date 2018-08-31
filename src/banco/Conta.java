package banco;

public class Conta {
	
	private String nome;
	private int numero;
	private String agencia;
	private double saldo;
	private String dataDeAbertura;
	
	
	void saca(double valor) {
		if(valor<=saldo) {
			this.saldo -= valor;
		} else {
			System.out.println("Valor insuficiente de saldo para sacar!");
		}
	}
	
	void deposita(double valor) {
		if(valor>0) {
			this.saldo += valor;
		} else {
			System.out.println("Numero invalido!");
		}
	}
	
	double calculaRendimento() {
		return this.saldo*0.1;
	}
	
	void recuperaDadosParaImpressao() {
		String dados = "Titular da conta: "+this.getNome()+"\n"+
						"Numero da conta: "+this.getNumero()+"\n"+
						"Agencia: "+ this.getAgencia()+"\n"+
						"Data de abertura: "+this.getDataDeAbertura()+"\n"+
						"O valor do saldo e "+this.getSaldo()+"\n";
		System.out.print(dados);
		System.out.println("O rendimento foi de "+this.calculaRendimento());
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getAgencia() {
		return agencia;
	}
	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public String getDataDeAbertura() {
		return dataDeAbertura;
	}
	public void setDataDeAbertura(String dataDeAbertura) {
		this.dataDeAbertura = dataDeAbertura;
	}
	
	

}
