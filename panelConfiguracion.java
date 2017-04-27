package PFinal;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class panelConfiguracion extends JPanel {

	
	private JFrame win;
	
	private JLabel instruccion; 
	
	private JButton btAceptar; 
	
	
	
	public panelConfiguracion(JFrame frame){
		this.setPreferredSize(new Dimension(400,400));
	
		this.setBackground( Color.LIGHT_GRAY);
		setFont(new Font("Default",Font.BOLD,18));

		this.win = frame; 
		
		this.instruccion = new JLabel("Que modificacion quiere hacer"); 
		this.instruccion.setPreferredSize(new Dimension(300,25));
		this.add(instruccion); 
		
	
		this.btAceptar= new JButton("Aceptar"); 
		this.btAceptar.setPreferredSize(new Dimension(200,30));
		this.add(this.btAceptar);
		
		
	}
	
}
