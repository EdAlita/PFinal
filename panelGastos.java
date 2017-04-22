package PFinal;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class panelGastos extends JPanel implements ActionListener{

	private Label mensaje; 
	
	private JButton tarjeta,
					efectivo, 
					altaCategoria,
					regresar; 
	
	public panelGastos(){
		this.setPreferredSize(new Dimension(400,400));
	//	this.setLayout(new GridLayout(5,1));

		
		this.mensaje = new Label("Seleccione el tipo de gasto que realizó"); 
		this.add(this.mensaje);
		
		this.tarjeta= new JButton ("Gasto con Tarjeta");
		this.tarjeta.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				ventanaGTarjeta win = new ventanaGTarjeta();
			}
		});
		this.add(this.tarjeta);

		
		
		this.efectivo= new JButton("Gasto en efectivo");
		this.efectivo.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				ventanaGEfectivo win = new ventanaGEfectivo();
			}
		});	
		this.add(this.efectivo);
		
		this.altaCategoria= new JButton("Dar de alta una categoría"); 
		this.altaCategoria.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				ventanaGAltaCategoria win = new ventanaGAltaCategoria();
			}
		});;
		this.add(this.altaCategoria);
		
		this.regresar= new JButton("Regresar");
		this.regresar.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				
			}
		});
		this.add(this.regresar); 
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}	
			
}
