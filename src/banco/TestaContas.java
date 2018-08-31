package banco;

public class TestaContas {

	public static void main(String[] args) {

		Conta minhaConta = new Conta();
		minhaConta.setAgencia("555");
		minhaConta.setNome("Gabriel Faria");
		minhaConta.setNumero(5623);
		minhaConta.setDataDeAbertura("06/07/2019");
		minhaConta.setSaldo(1000);
		minhaConta.deposita(500);
		minhaConta.saca(250);
		minhaConta.recuperaDadosParaImpressao();
		
	}

}
