package PFinal;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Label;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class panelDatos extends JPanel {
	
	private Label lTarjeta,
	               lGasto,
	               lFCorte,
	               lFPago;
	private Label[] Tarjeta,
    			    Gasto,
                    FCorte,
                    FPago;
	private panelAltaTarjeta tmp;
	private tarjetas tarjetas;
	private int n;

	
	public int getN() {
		return n;
	}


	public void setN(int n) {
		this.n = n;
	}


	public tarjetas getTarjetas() {
		return tarjetas;
	}


	public void setTarjetas(tarjetas tarjetas) {
		this.tarjetas = tarjetas;
	}
	
	public panelDatos(){
		super();
		
		Tarjeta = new Label[10];
		Gasto = new Label[10];
		FPago = new Label[10];
		FCorte = new Label[10];
		
		tarjetas = new tarjetas();
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


	public Label[] getTarjeta() {
		return Tarjeta;
	}


	public void setTarjeta(Label[] tarjeta) {
		Tarjeta = tarjeta;
	}


	public Label[] getGasto() {
		return Gasto;
	}


	public void setGasto(Label[] gasto) {
		Gasto = gasto;
	}


	public Label[] getFCorte() {
		return FCorte;
	}


	public void setFCorte(Label[] fCorte) {
		FCorte = fCorte;
	}


	public Label[] getFPago() {
		return FPago;
	}


	public void setFPago(Label[] fPago) {
		FPago = fPago;
	}
		
	}

