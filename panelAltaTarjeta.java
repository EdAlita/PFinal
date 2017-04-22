package PFinal;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Label;
import java.awt.TextField;

import javax.swing.JButton;
import javax.swing.JPanel;

public class panelAltaTarjeta extends JPanel {
	
	private Label lnombre,
				  ldcorte,
				  ldpago,
				  llcredito;
	private TextField tfNombre,
	                  tfdcorte,
	                  tfdpago,
	                  tflcredito;
	private JButton btaceptar;
	
	public panelAltaTarjeta(){
		super();
		this.setPreferredSize(new Dimension(450,200));
		this.setBackground( Color.LIGHT_GRAY);
		setFont(new Font("Default",Font.BOLD,18));
		
		this.lnombre = new Label("Nombre: ");
		this.lnombre.setPreferredSize(new Dimension(200,25));
		this.add(lnombre);
		
		this.tfNombre = new TextField();
		this.tfNombre.setPreferredSize(new Dimension(200,25));
		this.add(tfNombre);
		
		this.ldcorte = new Label("Dia de corte: ");
		this.ldcorte.setPreferredSize(new Dimension(200,25));
		this.add(ldcorte);
		
		this.tfdcorte = new TextField();
		this.tfdcorte.setPreferredSize(new Dimension(200,25));
		this.add(tfdcorte);
		
		this.ldpago = new Label("Dia de pago: ");
		this.ldpago.setPreferredSize(new Dimension(200,25));
		this.add(ldpago);
		
		this.tfdpago = new TextField();
		this.tfdpago.setPreferredSize(new Dimension(200,25));
		this.add(tfdpago);
		
		this.llcredito = new Label("Limite de Credito: ");
		this.llcredito.setPreferredSize(new Dimension(200,25));
		this.add(llcredito);
		
		this.tflcredito = new TextField();
		this.tflcredito.setPreferredSize(new Dimension(200,25));
		this.add(tflcredito);
		
		this.llcredito = new Label("");
		this.llcredito.setPreferredSize(new Dimension(200,25));
		this.add(llcredito);
		
		this.btaceptar = new JButton("Aceptar");
		this.btaceptar.setPreferredSize(new Dimension(200,25));
		this.add(btaceptar);
	}

}
