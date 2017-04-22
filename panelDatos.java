package PFinal;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Label;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class panelDatos extends JPanel {
	
	private Label lTarjeta,
	               lGasto,
	               lFCorte,
	               lFPago;
	private panelAltaTarjeta tmp;

	
	public panelDatos(){
		super();
		this.setPreferredSize(new Dimension(700,400));
		this.setBackground(Color.gray);
		setFont(new Font("Default",Font.BOLD,18));
		
		this.lTarjeta = new Label("Tarjeta");
		this.lTarjeta.setPreferredSize(new Dimension(150,25));
		this.add(lTarjeta);
		
		this.lGasto = new Label("Gastos");
		this.lGasto.setPreferredSize(new Dimension(150,25));
		this.add(lGasto);
		
		this.lFCorte = new Label("Fecha Corte");
		this.lFCorte.setPreferredSize(new Dimension(150,25));
		this.add(lFCorte);
		
		this.lFPago = new Label("Fecha Pago");
		this.lFPago.setPreferredSize(new Dimension(150,25));
		this.add(lFPago);
		}
		
	}

