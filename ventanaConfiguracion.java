package PFinal;

import javax.swing.JFrame;

public class ventanaConfiguracion extends JFrame{

	public ventanaConfiguracion(panelDatos pd){
		super("Configuración del programa"); 
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
		this.setResizable(false);
		this.setLocation(800,200);
		
		panelConfiguracion pc= new panelConfiguracion(pd,this); 
		this.add(pc);
		
		this.pack();
		this.setVisible(true);
	}
	
}
