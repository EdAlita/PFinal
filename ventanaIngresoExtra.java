package PFinal;

import javax.swing.JFrame;

public class ventanaIngresoExtra extends JFrame{

	public ventanaIngresoExtra(){
		super("Ingreso extra"); 
		this.setResizable(false);
		this.setLocation(800,200);
		
		panelIngresoExtra pd= new panelIngresoExtra(this); 
		this.add(pd); 
		
		this.pack();
		this.setVisible(true);
		
		
	}
	
	
}
