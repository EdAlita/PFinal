		package PFinal;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class panelIngresoExtra extends JPanel implements ActionListener {

	private Label lEtiqueta,
				  lMonto,
				  lEspacio,
				  lAceptar;
	
	private JTextField tfCantidad; 
	private JButton btAceptar; 
	
	private JFrame win; 
	
	private double cantidad; 

	
	public panelIngresoExtra(JFrame frame){
		super(); 
		this.setPreferredSize(new Dimension(450,200));
		this.setBackground( Color.LIGHT_GRAY);
		setFont(new Font("Default",Font.BOLD,18));

		this.win= frame;
		
		this.lMonto= new Label("");
		this.lMonto.setPreferredSize(new Dimension(400,30));
		this.add(this.lMonto);
		
		this.lEtiqueta = new Label("Escriba el monto extra que recibió"); 
		this.lEtiqueta.setPreferredSize(new Dimension(300,25));
		this.add(this.lEtiqueta); 	
				
		this.tfCantidad= new JTextField();
		this.tfCantidad.setPreferredSize(new Dimension(200,25));
		this.add(this.tfCantidad);
		
		this.lEspacio= new Label("");
		this.lEspacio.setPreferredSize(new Dimension(450,25));
		this.add(this.lEspacio);
		
		this.btAceptar= new JButton("Aceptar");
		this.btAceptar.setPreferredSize(new Dimension(200,30));
		this.btAceptar.addActionListener(new ActionListener(){ 		
			public void actionPerformed(ActionEvent arg0) {
			
				frame.dispose();
				try{
					cantidad= Double.parseDouble(tfCantidad.getText());
					System.out.println(cantidad);
					
					
				}
				catch(NumberFormatException ex){
					JOptionPane.showMessageDialog(null,"Verifique que sus datos sean númericos");
				}
			}			
		});
		
		this.add(this.btAceptar);

	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
	
}
