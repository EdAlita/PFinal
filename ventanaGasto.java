package PFinal;

import javax.swing.JFrame;

public class ventanaGasto extends JFrame{

	public ventanaGasto(){
		super("Gastos");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);

		this.setResizable(false);
		this.setLocation(800, 300);
		
		
		this.pack();
		this.setVisible(true);
	}
}
