package swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class TestandoSwing {
	
	public static void main(String[] args) {
		
		JButton botaoCarregar = new JButton("Carregar XML");
		JButton botaoSair = new JButton("Sair");
		botaoSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
				
			}
		});
		
		JPanel painel = new JPanel();
		painel.add(botaoCarregar);
		painel.add(botaoSair);
		
		JFrame janela = new JFrame("Argentum");
		janela.add(painel);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.pack();
		janela.setVisible(true);
	}
	

}
