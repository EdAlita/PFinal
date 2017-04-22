package PFinal;

import java.awt.Dimension;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class panelGEfectivo extends JPanel implements ActionListener{

	private Label etiqueta,
				  cantidad; 
	private JTextField gasto; 
	
	private JButton aceptar; 

	public panelGEfectivo(){
		this.setPreferredSize(new Dimension(300,300));

		this.etiqueta= new Label("Indique la cantidad que gastó"); 
		this.add(this.etiqueta);

		this.cantidad= new Label ("Cantidad"); 
		this.add(this.cantidad);

		this.gasto= new JTextField(15); 
		this.add(this.gasto);
		
		this.aceptar= new JButton("Aceptar");
		this.aceptar.addActionListener(this);

		
		this.add(this.aceptar);
	}
	

	public double getGasto(){
		return Double.parseDouble(this.gasto.getText());
		}


	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()== this.aceptar){
			this.getGasto();
		}
		
	}
	
	
	
	}
