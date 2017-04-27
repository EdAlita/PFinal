package PFinal;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Label;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
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
	private tarjetas tarjetas;
	private gasto gasto;
	private String[] categorias;
	private int n;
	private boolean presiono,
	                presiono2;
	public boolean isPresiono2() {
		return presiono2;
	}


	public void setPresiono2(boolean presiono2) {
		this.presiono2 = presiono2;
	}


	private double ingresoM;
	private panelresultados pr;

	
	public panelresultados getPr() {
		return pr;
	}


	public void setPr(panelresultados pr) {
		this.pr = pr;
	}


	public double getIngresoM() {
		return ingresoM;
	}


	public void setIngresoM(double ingresoM) {
		this.ingresoM = ingresoM;
	}


	public boolean isPresiono() {
		return presiono;
	}


	public void setPresiono(boolean presiono) {
		this.presiono = presiono;
	}


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
		presiono = false;
		presiono2 = false;
		categorias = new String[10];
		
		categorias[0]="Personal";
		categorias[1]="Trabajo";
		categorias[2]="Escuela";
		
		this.ingresoM=Double.parseDouble(JOptionPane.showInputDialog("Ingresa Saldo Mensual"));
		
		this.gasto=new gasto();
		
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


	public void setGasto(gasto gasto) {
		this.gasto = gasto;
	}
	
	public gasto getGastos(){
		return gasto;
	}


	public String[] getCategorias() {
		return categorias;
	}


	public void setCategorias(String[] categorias) {
		this.categorias = categorias;
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

