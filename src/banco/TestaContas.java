package banco;

import javax.swing.JOptionPane;

public class TestaContas {

	public static void main(String[] args) {

		Conta minhaConta = new Conta();
		minhaConta.setAgencia("555");
		minhaConta.setNome("Gabriel Faria");
		minhaConta.setNumero(5623);
		minhaConta.setSaldo(1000);
		minhaConta.deposita(500);
		minhaConta.saca(250);
		
		Data data = new Data();
		data.setDia(Integer.parseInt(JOptionPane.showInputDialog("Digite o dia da abertura ")));
		data.setMes(Integer.parseInt(JOptionPane.showInputDialog("Digite o mes da abertura ")));
		data.setAno(Integer.parseInt(JOptionPane.showInputDialog("Digite o ano da abertura ")));
		minhaConta.setDataDeAbertura(data.toString());
		
		minhaConta.recuperaDadosParaImpressao();
		
		// comparar se duas contas sao iguais.
		
		Conta conta = new Conta();
		conta.setNome("Joao");
		conta.setSaldo(250);
		
		Conta conta1 = new Conta();
		conta1.setNome("Joao");
		conta1.setSaldo(250);
		
		if(conta==conta1) {
			System.out.println("As conta sao identicas.");
		} else {
			System.out.println("As contas sao diferentes.");
		}
		
		Conta c = new Conta();
		c.setNome("Flavio");
		c.setSaldo(300);
		
		Conta c1 = c;
		
		if(c==c1) {
			System.out.println("As conta sao identicas.");
		} else {
			System.out.println("As contas sao diferentes.");
		}
	}

}
