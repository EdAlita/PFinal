package PFinal;

import java.awt.GridLayout;

import javax.swing.JFrame;

public class ventanaGasto extends JFrame{

	
	public ventanaGasto(panelDatos pd){
	
		super("Gastos");
		
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);

		this.setResizable(false);
		this.setLocation(800, 200);		
		
		panelGastos panel= new panelGastos(pd,this); 
		this.add(panel); 
		
		this.pack();
		this.setVisible(true);
	}
	
}
