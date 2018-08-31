package lacos;

import javax.swing.JOptionPane;

public class LacosEncadeados {

	public static void main(String[] args) {
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite o número:"));

		if (numero <= 0) {
			System.out.println("Número inválido!");
		} else {
			for (int i = 1; i <= numero; i++) {
				for (int j = 1; j <= i; j++) {
					int multiplicacao = i * j;
					System.out.print(multiplicacao + " ");
					multiplicacao = 0;
				}
				System.out.println();
			}
		}
	}

}
