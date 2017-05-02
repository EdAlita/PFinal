package PFinal;

import java.awt.BorderLayout;
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
	private Label[] Tarjeta,
    				Gasto,
    				FCorte,
                    FPago;
	private TextField tfNombre,
	                  tfdcorte,
	                  tfdpago,
	                  tflcredito;
	private JButton btaceptar,
					btCancelar;
	private JFrame win;
	private int dcorte,
	            dpago;
	private String Nombre;
	private double lcredito;
	protected tarjetas tarjetas;
	private int n;
	private double pago;
	
	
	public panelAltaTarjeta(JFrame frame, panelDatos pd){
		super();
		this.setPreferredSize(new Dimension(450,200));
		this.setBackground(new Color(182,161,158));
		setFont(new Font("Default",Font.BOLD,18));
		tarjetas=pd.getTarjetas();
		
		this.Tarjeta=pd.getTarjeta();
		this.Gasto=pd.getGasto();
		this.FCorte=pd.getFCorte();
		this.FPago=pd.getFPago();
		
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
		this.btaceptar.setBackground(new Color(218,210,206));
		this.btaceptar.setPreferredSize(new Dimension(150,30));
		this.btaceptar.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0) {
<<<<<<< HEAD
								
		try{

			
			if(Integer.parseInt(tfdcorte.getText())> 0  && 
			   Integer.parseInt(tfdcorte.getText())< 32 && 
			   Integer.parseInt(tfdpago.getText()) > 0   && 
			   Integer.parseInt(tfdpago.getText())< 32 ){
						
			
			frame.dispose();
			try{
			Nombre=tfNombre.getText();
			dcorte=Integer.parseInt(tfdcorte.getText());
			dpago=Integer.parseInt(tfdpago.getText());
			lcredito=Double.parseDouble(tflcredito.getText());
			tarjeta tmp = new tarjeta(Nombre,dpago,dcorte,lcredito);
			tarjetas.agregarTarjeta(tmp);
			n=tarjeta.getN();
			
				Tarjeta[n-1] = new Label(tarjetas.obtenerNombre(n-1));
				Tarjeta[n-1].setPreferredSize(new Dimension(150,25));
				pd.add(Tarjeta[n-1]);
				
				pago=tarjetas.obtenerTotal(n-1);
				Gasto[n-1]= new Label("$"+pago);
				Gasto[n-1].setPreferredSize(new Dimension(150,25));
				pd.add(Gasto[n-1]);
				
				FCorte[n-1] = new Label(" "+tarjetas.obtenerDCorte(n-1));
				FCorte[n-1].setPreferredSize(new Dimension(150,25));
				pd.add(FCorte[n-1]);
				
				FPago[n-1] = new Label(" "+tarjetas.obtenerDPago(n-1));
				FPago[n-1].setPreferredSize(new Dimension(150,25));
				pd.add(FPago[n-1]);

				pd.setN(n);
				
				pd.updateUI();
			}catch(NumberFormatException ex){
				JOptionPane.showMessageDialog(null,"Verifique que sus datos tengan el formato correcto");
			}catch(ArrayIndexOutOfBoundsException ex){
				JOptionPane.showMessageDialog(null,"Has excedido el limite de trajetas");
			}
			
			}
			else{
				JOptionPane.showMessageDialog(null,"Escriba una fecha valida");
				tfdcorte.setText(null);
				tfdpago.setText(null);
			}

		}
		catch(Exception ex){
			JOptionPane.showMessageDialog(null,"Verifique haber llenado los campos");
		}
				
=======
				frame.dispose();
				try{
				Nombre=tfNombre.getText();
				dcorte=Integer.parseInt(tfdcorte.getText());
				dpago=Integer.parseInt(tfdpago.getText());
				lcredito=Double.parseDouble(tflcredito.getText());
				tarjeta tmp = new tarjeta(Nombre,dpago,dcorte,lcredito);
				tarjetas.agregarTarjeta(tmp);
				n=pd.getN();
				
					Tarjeta[n-1] = new Label(tarjetas.obtenerNombre(n-1));
					Tarjeta[n-1].setPreferredSize(new Dimension(150,25));
					pd.add(Tarjeta[n-1]);
					
					pago=tarjetas.obtenerTotal(n-1);
					Gasto[n-1]= new Label("$"+pago);
					Gasto[n-1].setPreferredSize(new Dimension(150,25));
					pd.add(Gasto[n-1]);
					
					FCorte[n-1] = new Label(" "+tarjetas.obtenerDCorte(n-1));
					FCorte[n-1].setPreferredSize(new Dimension(150,25));
					pd.add(FCorte[n-1]);
					
					FPago[n-1] = new Label(" "+tarjetas.obtenerDPago(n-1));
					FPago[n-1].setPreferredSize(new Dimension(150,25));
					pd.add(FPago[n-1]);
					
					pd.setN(n+1);
					pd.updateUI();
				}catch(NumberFormatException ex){
					JOptionPane.showMessageDialog(null,"Verifique que sus datos tengan el formato correcto");
				}catch(ArrayIndexOutOfBoundsException ex){
					JOptionPane.showMessageDialog(null,"Has excedido el limite de trajetas");
				}
>>>>>>> origin/master
		}});
		this.add(btaceptar);
	}
	
	public int getN() {
		return n;
	}

	public tarjetas getTarjetas() {
		return tarjetas;
	}
	

}
