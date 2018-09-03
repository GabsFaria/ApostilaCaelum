package br.com.caelum.argentum.ui;

import java.io.FileNotFoundException;
import java.io.FileReader;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import java.util.List;


// ARQUIVO INICIADO MAS FALTANDO ENTENDIMENTO SOBRE OUTROS ASSUNTOS PARA TERMINAR DE FORMA CORRETA

public class EscolhedorDeXML {
	
	public void escolhe() {
		try {
			JFileChooser chooser = new JFileChooser();
			int retorno = chooser.showOpenDialog(null);
			
			if(retorno == JFileChooser.APPROVE_OPTION) {
				FileReader reader = new FileReader(chooser.getSelectedFile());
				//List<Negocio> negocios = new LeitorXML().carrega(reader);
				
				//Negocio primeiroNegocio = negocios.get(0);
				//String mensagem = "Primeiro negocio: "+ primeiroNegocio.getPreco();
				//JOptionPane.showMessageDialog(null, mensagem);
			}
		} catch(FileNotFoundException e){
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		new EscolhedorDeXML().escolhe();
	}

}

