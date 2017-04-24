package PFinal;

import javax.swing.JFrame;

public class ventanaGTarjeta extends JFrame{
	
	public ventanaGTarjeta(panelDatos pd){
		super("Gasto con tarjeta");
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);

		this.setResizable(false);
		
		panelGTarjeta pgt = new panelGTarjeta(pd,this);
		this.add(pgt);
		
		this.setLocation(800, 300);		
		
		this.pack();
		this.setVisible(true);
	}

}
