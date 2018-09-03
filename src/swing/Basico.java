package swing;

import java.io.File;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class Basico {
	
	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "Ola, mundo!");
		
		JFileChooser fileChooser = new JFileChooser();
		int retorno = fileChooser.showOpenDialog(null);
		
		if(retorno == JFileChooser.APPROVE_OPTION) {
			File file = fileChooser.getSelectedFile();
			//faz alguma coisa com o arquivo
		} else {
			//dialogo cancelado
		}
	}

}
