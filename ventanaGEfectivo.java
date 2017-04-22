package PFinal;

import java.awt.Dimension;
import java.awt.Label;

import javax.swing.JFrame;
import javax.swing.JTextField;

public class ventanaGEfectivo extends JFrame{
	
	
	public ventanaGEfectivo(){
		super("Gasto efectivo");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		this.setResizable(false);
		this.setLocation(800, 200);
			
		this.pack();
		this.setVisible(true);
		
		
	}
	
}
