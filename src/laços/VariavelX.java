package laços;

import javax.swing.JOptionPane;

public class VariavelX {
	
	public static void main(String[] args) {
		
		int x = Integer.parseInt(JOptionPane.showInputDialog("Digite o número que deseja"));
		
		while(x>1) {
			if(x%2==0) {
				x = x/2;
			} else {
				x = 3 * x + 1;
			}
			System.out.print(x+" ");
		}
	}

}
