package PFinal;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class panelGastos extends JPanel{

	private Label mensaje; 
	
	private JButton tarjeta,
					efectivo, 
					altaCategoria,
					regresar; 
	private JFrame win;
	
	public panelGastos(panelDatos pd, JFrame win){
		super();
		this.setPreferredSize(new Dimension(425,200));
		this.setBackground(new Color(182,161,158));
		this.setFont(new Font("Default",Font.BOLD,18));
		this.win=win;
		
		this.mensaje = new Label("Seleccione el tipo de gasto que realizó"); 
		this.mensaje.setPreferredSize(new Dimension(400,50));
		this.add(this.mensaje);
		
		this.tarjeta= new JButton ("Gasto con Tarjeta");
		this.tarjeta.setBackground(new Color(218,210,206));
		this.tarjeta.setPreferredSize(new Dimension(200,50));
		this.tarjeta.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				ventanaGTarjeta win = new ventanaGTarjeta(pd);
			}
		});
		this.add(this.tarjeta);
		
		this.efectivo= new JButton("Gasto en efectivo");
		this.efectivo.setBackground(new Color(218,210,206));
		this.efectivo.setPreferredSize(new Dimension(200,50));
		this.efectivo.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				ventanaGEfectivo win = new ventanaGEfectivo(pd);
			}
		});	
		this.add(this.efectivo);
		
		this.altaCategoria= new JButton("Dar de alta una categoría"); 
		this.altaCategoria.setBackground(new Color(218,210,206));
		this.altaCategoria.setPreferredSize(new Dimension(200,50));
		this.altaCategoria.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				ventanaGAltaCategoria win = new ventanaGAltaCategoria(pd);
			}
		});;
		this.add(this.altaCategoria);
		
		this.regresar= new JButton("Regresar");
		this.regresar.setBackground(new Color(218,210,206));
		this.regresar.setPreferredSize(new Dimension(200,50));
		this.regresar.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				win.dispose();
			}
		});
		this.add(this.regresar); 
	}
			
}
