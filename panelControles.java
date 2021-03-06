package PFinal;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class panelControles extends JPanel{
	
	private JButton btATarjeta,
	                btGasto,
	                btGenerarResumen,
	                btIngresoExtra,
	                btconfiguracion;

	public panelControles(panelDatos pd){
		super();
		this.setPreferredSize(new Dimension(600,125));
		this.setBackground(new Color(6,47,79));
		
		this.btATarjeta = new JButton("Alta Tarjeta");
		this.btATarjeta.setPreferredSize(new Dimension(150,50));
		this.btATarjeta.setBackground(new Color(181,206,223));
		this.btATarjeta.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				ventanaAltaTarjeta win = new ventanaAltaTarjeta(pd);
				
			}
		});
		this.add(this.btATarjeta);
		
		this.btGasto = new JButton("Gasto");
		this.btGasto.setPreferredSize(new Dimension(150,50));
		this.btGasto.setBackground(new Color(181,206,223));
		this.btGasto.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0) {
				ventanaGasto vg = new ventanaGasto(pd);
			}
			
		});
		this.add(this.btGasto);
		
		this.btIngresoExtra = new JButton("Ingreso Extra");
		this.btIngresoExtra.setPreferredSize(new Dimension(150,50));
		this.btIngresoExtra.setBackground(new Color(181,206,223));
		this.btIngresoExtra.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				ventanaIngresoExtra win= new ventanaIngresoExtra(pd);
			}
		});
		
		this.add(this.btIngresoExtra);
		
		this.btconfiguracion = new JButton("Boton Configuracion");
		this.btconfiguracion.setPreferredSize(new Dimension(150,50));
		this.btconfiguracion.setBackground(new Color(181,206,223));
		this.btconfiguracion.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				ventanaConfiguracion win= new ventanaConfiguracion(pd); 
			}
		});
		
		this.add(this.btconfiguracion);
		
		this.btGenerarResumen = new JButton("Reporte de tarjeta");
		this.btGenerarResumen.setPreferredSize(new Dimension(150,50));
		this.btGenerarResumen.setBackground(new Color(181,206,223));
		this.btGenerarResumen.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				ventanaGenerarResumen win= new ventanaGenerarResumen(pd); 
			}
		});
		
		this.add(this.btGenerarResumen);
	}
}
