package PFinal;

import java.awt.GridLayout;

import javax.swing.JFrame;

public class ventanaGasto extends JFrame{

	
	public ventanaGasto(){
	
		super("Gastos");
		
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);

		this.setResizable(false);
		this.setLocation(800, 200);		
		
		panelGastos panel= new panelGastos(); 
		this.add(panel); 
		
		this.pack();
		this.setVisible(true);
	}
	
	public static void main(String[] args){
		ventanaGasto win= new ventanaGasto(); 
	}
}
