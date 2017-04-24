package PFinal;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JFrame;

public class menuPrincipal extends JFrame {
	
	public menuPrincipal(){
		super("Rastreador de tarjetas");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setLocation(300, 100);
		panelDatos pd = new panelDatos();
		panelControles pc = new panelControles(pd);
		this.add(pc, BorderLayout.NORTH);
		this.add(pd);
		
		this.pack();
		this.setVisible(true);
	}

	public static void main(String[] args) {
	
		menuPrincipal m = new menuPrincipal();

	}

}
