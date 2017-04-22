package PFinal;

import javax.swing.JFrame;

public class ventanaAltaTarjeta extends JFrame{
	
	public ventanaAltaTarjeta(panelDatos pd){
		super("Alta de Tarjeta");
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		this.setResizable(false);
		this.setLocation(800, 300);
		
		panelAltaTarjeta pat = new panelAltaTarjeta(this,pd);
		this.add(pat);
		
		this.pack();
		this.setVisible(true);
	}

}
