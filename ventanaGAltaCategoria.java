package PFinal;

import javax.swing.JFrame;

public class ventanaGAltaCategoria extends JFrame{

	public ventanaGAltaCategoria(panelDatos pd){
		super("Dar de alta una categoria");
		this.setResizable(false);
		this.setLocation(800,200);
		panelGAltaCategoria pgac = new panelGAltaCategoria(pd,this);
		this.add(pgac);
		this.pack();
		this.setVisible(true);
		
	}
	
}
