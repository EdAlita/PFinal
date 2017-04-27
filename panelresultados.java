package PFinal;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Label;

import javax.swing.JPanel;

public class panelresultados extends JPanel {
	private double resultado;
	private Label lresultado,
				  ldia,
				  lqueda;
	private panelDatos pd;
	private tarjetas tarjetas;

	public panelresultados(panelDatos pd) {
		super();
		this.setPreferredSize(new Dimension(600,125));
		this.setBackground( Color.blue);
		this.pd=pd;
		this.tarjetas=pd.getTarjetas();
		
		setFont(new Font("Default",Font.BOLD,18));
	
		this.lresultado = new Label("Total: $"+this.resultado);
		this.lresultado.setPreferredSize(new Dimension(300,25));
		this.add(lresultado);
		
		this.lqueda = new Label("Resta de Ingreso Mensual $"+(this.pd.getIngresoM()-resultado));
		this.lqueda.setPreferredSize(new Dimension(300,25));
		this.add(lqueda);
		
	}

	public Label getLresultado() {
		return lresultado;
	}

	public void setLresultado(Label lresultado) {
		this.lresultado = lresultado;
	}

	public Label getLqueda() {
		return lqueda;
	}

	public void setLqueda(Label lqueda) {
		this.lqueda = lqueda;
	}

	public void setResultado(double resultado) {
		this.resultado = resultado;
	}

}
