package PFinal;

import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class panelConfiguracion extends JPanel {

	
	private JFrame win;
	
	
	
	public panelConfiguracion(JFrame frame){
		this.setPreferredSize(new Dimension(400,400));
		this.win = frame; 
	}
	
}
