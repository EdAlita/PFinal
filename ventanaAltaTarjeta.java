package PFinal;

import javax.swing.JFrame;

public class ventanaAltaTarjeta extends JFrame{
	
	public ventanaAltaTarjeta(){
		super("Alta de Tarjeta");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setLocation(800, 300);
		
		panelAltaTarjeta pat = new panelAltaTarjeta();
		this.add(pat);
		
		this.pack();
		this.setVisible(true);
	}

}
