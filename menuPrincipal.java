package PFinal;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JFrame;

public class menuPrincipal extends JFrame {
	
	public menuPrincipal(){
		super("Rastreador de tarjetas");
		this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
		this.setResizable(false);
<<<<<<< HEAD
		this.setLocation(300, 70);
		panelDatos pd = new panelDatos();
=======
		this.setLocation(300, 100);
		panelDatos pd = new panelDatos(this);
>>>>>>> origin/master
		panelControles pc = new panelControles(pd);
		panelresultados pr = new panelresultados(pd,this);
		pd.setPr(pr);
		this.add(pc, BorderLayout.NORTH);
		this.add(pr, BorderLayout.SOUTH);
		this.add(pd);
		
		this.pack();
		this.setVisible(true);
	}

	public static void main(String[] args) {
	
		menuPrincipal m = new menuPrincipal();

	}

}
