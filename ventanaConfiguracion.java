package PFinal;

import javax.swing.JFrame;

public class ventanaConfiguracion extends JFrame{

	public ventanaConfiguracion(){
		super("Configuraci�n del programa"); 
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		this.setResizable(false);
		this.setLocation(800,200);
		
		panelConfiguracion pc= new panelConfiguracion(this); 
		this.add(pc);
		
		this.pack();
		this.setVisible(true);
	}
	
}
