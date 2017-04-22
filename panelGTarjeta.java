package PFinal;

import java.awt.Dimension;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class panelGTarjeta extends JPanel implements ActionListener{
	
	
	private Label etiqueta, 
				  tarjeta; 
	
	private JTextField gasto; 
	
	private JButton aceptar; 
	
	public panelGTarjeta(){
		this.setPreferredSize(new Dimension(300,300));
		
		this.etiqueta= new Label("Seleccione la tarjeta y el monto que gasto"); 
		this.add(this.etiqueta);
		
		this.tarjeta= new Label("Nombre de la Tarjeta");
		this.add(tarjeta);
		
		this.gasto= new JTextField(15); 
		this.add(gasto);
		
		
		
		this.aceptar= new JButton("Aceptar");
		this.aceptar.addActionListener(this);
		this.add(this.aceptar);
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==this.aceptar){
				
		}
		
	}

}
