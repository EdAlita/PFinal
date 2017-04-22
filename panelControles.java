package PFinal;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class panelControles extends JPanel implements ActionListener{
	
	private JButton btATarjeta,
	                btACategoria,
	                btGasto,
	                btEfectivo,
	                btIngresoExtra,
	                btconfiguracion;

	public panelControles(){
		super();
		this.setPreferredSize(new Dimension(600,125));
		this.setBackground( Color.blue);
		
		this.btATarjeta = new JButton("Alta Tarjeta");
		this.btATarjeta.setPreferredSize(new Dimension(150,50));
		this.btATarjeta.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				ventanaAltaTarjeta win = new ventanaAltaTarjeta();
			}
		});
		this.add(this.btATarjeta);
		
		
		this.btACategoria = new JButton("ALta Categoria");
		this.btACategoria.setPreferredSize(new Dimension(150,50));
		this.add(this.btACategoria);
		
		this.btGasto = new JButton("Gasto");
		this.btGasto.setPreferredSize(new Dimension(150,50));
		this.add(this.btGasto);
		
		this.btEfectivo = new JButton("Efectivo");
		this.btEfectivo.setPreferredSize(new Dimension(150,50));
		this.add(this.btEfectivo);
		
		this.btIngresoExtra = new JButton("Ingreso Extra");
		this.btIngresoExtra.setPreferredSize(new Dimension(150,50));
		this.add(this.btIngresoExtra);
		
		this.btconfiguracion = new JButton("Boton Configuracion");
		this.btconfiguracion.setPreferredSize(new Dimension(150,50));
		this.add(this.btconfiguracion);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
