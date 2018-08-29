package laços;

import javax.swing.JOptionPane;

public class Fibonacci {
	public static void main(String[] args) {
		int sequencia = Integer
				.parseInt(JOptionPane.showInputDialog("Digite o número da sequência de Fibonacci" + " que deseja:"));

		switch (sequencia) {
		case 1:
			System.out.println("0.");
			break;
		case 2:
			System.out.println("0\n1.");
			break;
		default:
			int somaNova = 1, somaAntiga = 0, somaTotal = 0;
			String imprimir = "0\n1";
			for(int i= 3; i<=sequencia; i++) {
				imprimir += "\n";
				somaTotal=somaAntiga+somaNova;
				imprimir += somaTotal;
				somaAntiga = somaNova;
				somaNova = somaTotal;
			}
			imprimir += ".";
			System.out.println(imprimir);
		}
	}
}
