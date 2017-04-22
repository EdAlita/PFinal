package PFinal;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class panelAltaTarjeta extends JPanel {
	
	private Label lnombre,
				  ldcorte,
				  ldpago,
				  llcredito,
				  ltotal;
	private TextField tfNombre,
	                  tfdcorte,
	                  tfdpago,
	                  tflcredito;
	private JButton btaceptar;
	private JFrame win;
	private int dcorte,
	            dpago;
	private String Nombre;
	private double lcredito;
	protected tarjetas tarjetas;
	private boolean presiono;
	
	public panelAltaTarjeta(JFrame frame, panelDatos pd){
		super();
		this.setPreferredSize(new Dimension(450,200));
		this.setBackground( Color.LIGHT_GRAY);
		setFont(new Font("Default",Font.BOLD,18));
		tarjetas= new tarjetas();
		presiono=false;
		
		win=frame;
		
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
		this.btaceptar.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0) {
				frame.dispose();
				try{
				presiono=true;
				Nombre=tfNombre.getText();
				dcorte=Integer.parseInt(tfdcorte.getText());
				dpago=Integer.parseInt(tfdpago.getText());
				lcredito=Double.parseDouble(tflcredito.getText());
				tarjeta tmp = new tarjeta(Nombre,dpago,dcorte,lcredito);
				tarjetas.agregarTarjeta(tmp);
				
				System.out.println();
				
				for(int i=0; i<10;i++){
					//lnombre = new Label(tarjetas.obtenerNombre(i));
					//lnombre.setPreferredSize(new Dimension(150,25));
					//pd.add(lnombre);
					
					ltotal = new Label("$"+tarjetas.obtenerTotal(i));
					ltotal.setPreferredSize(new Dimension(150,25));
					pd.add(ltotal);
					
					ldcorte = new Label(" "+tarjetas.obtenerDCorte(i));
					ldcorte.setPreferredSize(new Dimension(150,25));
					pd.add(ldcorte);
					
					ldpago = new Label(" "+tarjetas.obtenerDPago(i));
					ldpago.setPreferredSize(new Dimension(150,25));
					pd.add(ldpago);}
				}catch(NumberFormatException ex){
					JOptionPane.showMessageDialog(null,"Cheque sus datos");
				}
			}
		});
		this.add(btaceptar);
	}
	
	public tarjetas getTarjetas() {
		return tarjetas;
	}
	
	public boolean getPresiono(){
		return presiono;
	}

}
