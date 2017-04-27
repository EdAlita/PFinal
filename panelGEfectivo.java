package PFinal;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class panelGEfectivo extends JPanel implements ActionListener{

	private Label etiqueta,
				  cantidad; 
	private JTextField gasto; 
	
	private JButton aceptar; 
	private panelDatos pd;
	private tarjetas tarjetas;
	private Label[] Tarjeta,
					Gasto,
					FCorte,
					FPago;
	private int n;
	private JFrame frame;

	public panelGEfectivo(panelDatos pd, JFrame frame){
		this.tarjetas=pd.getTarjetas();
		this.pd=pd;
		this.Tarjeta=pd.getTarjeta();
		this.Gasto=pd.getGasto();
		this.FCorte=pd.getFCorte();
		this.FPago=pd.getFPago();
		this.frame=frame;
		
		this.setPreferredSize(new Dimension(425,200));
		this.setBackground( Color.LIGHT_GRAY);
		this.setFont(new Font("Default",Font.BOLD,18));

		this.etiqueta= new Label("Indique la cantidad que gastó");
		this.etiqueta.setPreferredSize(new Dimension(400,25));
		this.add(this.etiqueta);

		this.cantidad= new Label ("Cantidad"); 
		this.cantidad.setPreferredSize(new Dimension(200,25));
		this.add(this.cantidad);

		this.gasto= new JTextField(15); 
		this.gasto.setPreferredSize(new Dimension(200,25));
		this.add(this.gasto);
		
		this.aceptar= new JButton("Aceptar");
		this.aceptar.setPreferredSize(new Dimension(200,25));
		this.aceptar.addActionListener(this);
		this.add(this.aceptar);
	}
	

	public double getGasto(){
		return Double.parseDouble(this.gasto.getText());
		}


	@Override
	public void actionPerformed(ActionEvent e) {
		
		
		if(pd.isPresiono()){
			for(int i=0;i<tarjetas.obtenerLength();i++){ 
			tarjetas.hacerCargo(i, getGasto());
			Gasto[i].setText("$"+tarjetas.obtenerTotal(i));
			pd.updateUI();
			this.frame.dispose();
			System.out.println("entro al if");
			break;
			}
		}else{
		
		tarjeta tmp = new tarjeta("Efectivo",0,0,0);
		tarjetas.agregarTarjeta(tmp);
		n=tarjeta.getN();
		Tarjeta[n-1] = new Label(tarjetas.obtenerNombre(n-1));
		Tarjeta[n-1].setPreferredSize(new Dimension(150,25));
		pd.add(Tarjeta[n-1]);
		
		tarjetas.hacerCargo(n-1, getGasto());
		
		Gasto[n-1]= new Label("$"+tarjetas.obtenerTotal(n-1));
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
		pd.setPresiono(true);
		this.frame.dispose();
		}
	}
		}
