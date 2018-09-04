package swing;

import java.awt.Color;

import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.LineBorder;

public class Table {
	
	public static void main(String[] args) {
		
		JTable table = new JTable();
		
		table.setBorder(new LineBorder(Color.black));
		table.setGridColor(Color.black);
		table.setShowGrid(true);
		
		JScrollPane scroll = new JScrollPane();
		scroll.getViewport().setBorder(null);
		scroll.getViewport().add(table);
		scroll.setSize(450, 450);
	}

}
