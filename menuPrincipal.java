package PFinal;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JFrame;

public class menuPrincipal extends JFrame {
	
	public menuPrincipal(){
		super("Calculador de tarjetas");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setLocation(700, 300);
		panelControles pc = new panelControles();
		panelDatos pd = new panelDatos();
		this.add(pc, BorderLayout.NORTH);
		this.add(pd);
		
		this.pack();
		this.setVisible(true);
	}

	public static void main(String[] args) {
	
		menuPrincipal m = new menuPrincipal();

	}

}
