package PFinal;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class panelDatos extends JPanel {
	
	private JLabel lhola;
	
	public panelDatos(){
		super();
		this.setPreferredSize(new Dimension(600,400));
		this.setBackground(Color.gray);
		
		this.lhola = new JLabel("Hola Como estas");
		this.add(lhola);
		
		
		
	}
}
