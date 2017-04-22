package PFinal;

import javax.swing.JFrame;

public class ventanaGTarjeta extends JFrame{
	
	public ventanaGTarjeta(){
		super("Gasto con tarjeta");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);

		this.setResizable(false);
		
		this.setLocation(800, 200);		
		
		this.pack();
		this.setVisible(true);
	}

}
