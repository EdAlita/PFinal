package PFinal;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class panelGEfectivo extends JPanel implements ActionListener{

	private Label etiqueta,
				  cantidad,
				  total,
				  queda,
				  lEspacio,
				  lEspcacio2;
	
	private JTextField gasto; 
	
	private JButton btAceptar,
					btCancelar; 
	private panelDatos pd;
	private tarjetas tarjetas;
	private Label[] Tarjeta,
					Gasto,
					FCorte,
					FPago;
	private int n;
	private JFrame frame;
	private panelresultados pr;
	private double num;

	public panelGEfectivo(panelDatos pd, JFrame frame){
		this.tarjetas=pd.getTarjetas();
		this.pd=pd;
		this.Tarjeta=pd.getTarjeta();
		this.Gasto=pd.getGasto();
		this.FCorte=pd.getFCorte();
		this.FPago=pd.getFPago();
		this.frame=frame;
		this.pr=pd.getPr();
		this.total=pr.getLresultado();
		this.queda=pr.getLqueda();
		
		this.setPreferredSize(new Dimension(425,200));
		this.setBackground(new Color(239,217,193));
		this.setFont(new Font("Default",Font.BOLD,18));

		this.etiqueta= new Label("Indique la cantidad que gastó");
		this.etiqueta.setPreferredSize(new Dimension(375,25));
		this.add(this.etiqueta);

		this.lEspacio= new Label("");
		this.lEspacio.setPreferredSize(new Dimension(400,10));
		this.add(this.lEspacio);
		
		this.cantidad= new Label ("Cantidad"); 
		this.cantidad.setPreferredSize(new Dimension(200,25));
		this.add(this.cantidad);

		this.gasto= new JTextField(15); 
		this.gasto.setPreferredSize(new Dimension(200,25));
		this.add(this.gasto);
		
		this.lEspcacio2= new Label("");
		this.lEspcacio2.setPreferredSize(new Dimension(400,10));
		this.add(this.lEspcacio2);

		this.btCancelar= new JButton("Regresar");
		this.btCancelar.setBackground(Color.WHITE);
		this.btCancelar.setPreferredSize(new Dimension(175,35));
		this.btCancelar.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				int tmp=JOptionPane.showConfirmDialog(null, "Tus datos se perderan");
				if(tmp==JOptionPane.YES_OPTION){
					frame.dispose();
				}
			}
		});
		
		this.add(this.btCancelar);

		
		this.btAceptar= new JButton("Aceptar");
		this.btAceptar.setBackground(Color.white);
		this.btAceptar.setPreferredSize(new Dimension(175,35));
		this.btAceptar.addActionListener(this);
		this.add(this.btAceptar);
		
	}
	

	public double getGasto(){
		return Double.parseDouble(this.gasto.getText());
		}


	@Override
	public void actionPerformed(ActionEvent e) {
		
		try{
		if(pd.isPresiono()){
			for(int i=0;i<tarjetas.obtenerLength();i++){ 
			if(tarjetas.obtenerNombre(i)=="Efectivo"){
			tarjetas.hacerCargo(i, getGasto());
			Gasto[i].setText("$"+tarjetas.obtenerTotal(i));
			for(int j =0; j<pd.getN();j++){
				num=+tarjetas.obtenerTotal(j);
			}
			total.setText("Total $ "+num);
			queda.setText("Resta de ingreso Mensual $ "+(pd.getIngresoM()-num));
			pd.updateUI();
			this.frame.dispose();
			break;}
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
		
		num=+tarjetas.obtenerTotal(n-1);
		
		total.setText("Total $ "+num);
		queda.setText("Resta de ingreso Mensual $ "+(pd.getIngresoM()-num));
		
		pd.setN(n);
		pd.updateUI();
		pd.setPresiono(true);
		
		this.frame.dispose();
		}
		} catch (NumberFormatException ex){
			JOptionPane.showMessageDialog(null,"Verifique que sus datos sean númericos");
			this.gasto.setText(null);
		}
		 catch (Exception d){
			 JOptionPane.showMessageDialog(null,"Verifique haber llenado los campos");
		 }

	}
		}
