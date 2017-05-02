package PFinal;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class panelConfiguracion extends JPanel{

	
	private JFrame win;
	
	private JLabel instruccion,
				 	lTarjeta; 
	private Label lTarjetan,
    			  lGasto,
    			  lFCorte,
    			  lFPago,
    			  total,
    			  queda;
	
	private JButton btAceptar,
					btRegresar; 
	
	private panelDatos pd; 
	private panelresultados pr;

	private tarjetas tarjetas;
	private String[] nombres,
    				categorias;
	private Label[] Tarjeta,
    				Gasto,
    				FCorte,
    				FPago;
	private gasto gastos;
	private String opcion;
	private int n;
	private double num;

	private JComboBox cbTarjetas; 
	
	public panelConfiguracion(panelDatos pd,JFrame frame){
		this.setPreferredSize(new Dimension(400,400));
	
		this.pd= pd; 
		this.pr=pd.getPr();
		this.queda=pr.getLqueda();
		this.total=pr.getLresultado();
		this.win=frame;
		this.n=pd.getN();
		this.Tarjeta=pd.getTarjeta();
		this.Gasto=pd.getGasto();
		this.FCorte=pd.getFCorte();
		this.FPago=pd.getFPago();
		this.categorias=pd.getCategorias();
		this.gastos=pd.getGastos();
		this.tarjetas=pd.getTarjetas();
		this.nombres= new String[pd.getN()];

		this.setBackground(new Color(182,161,158));
		setFont(new Font("Default",Font.BOLD,25));

		this.win = frame; 
		for(int i=0;i<pd.getN();i++){
			this.nombres[i]=this.tarjetas.obtenerNombre(i);
		}
		

		this.instruccion = new JLabel("Que modificacion quiere hacer"); 
		this.instruccion.setPreferredSize(new Dimension(375,50));
		this.add(instruccion); 
		

		this.lTarjeta= new JLabel("Eliminar una Tarjeta"); 
		this.lTarjeta.setPreferredSize(new Dimension(375,25));
		this.add(this.lTarjeta);
		
		
		this.cbTarjetas= new JComboBox(this.nombres);
		this.cbTarjetas.setPreferredSize(new Dimension(400,25));
		this.add(cbTarjetas);
		
		
		this.btRegresar= new JButton("Regresar"); 
		this.btRegresar.setPreferredSize(new Dimension(150,30));
		this.btRegresar.setBackground(new Color(218,210,206));
		this.add(this.btRegresar);
		this.btRegresar.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				int tmp=JOptionPane.showConfirmDialog(null, "Tus datos se perderan");
				if(tmp==JOptionPane.YES_OPTION){
					win.dispose();
				}
			}
		});
		
		this.btAceptar= new JButton("Aceptar"); 
		this.btAceptar.setBackground(new Color(218,210,206));
		this.btAceptar.setPreferredSize(new Dimension(150,30));
		this.btAceptar.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
	
				try{
					opcion=cbTarjetas.getSelectedItem().toString();
					for(int j = 0;j<pd.getN();j++){
						if(opcion==tarjetas.obtenerNombre(j)){
							pd.setN(n-1);
							tarjetas.eliminar(j);
							Tarjeta[j].setText(null);
							Gasto[j].setText(null);
							FPago[j].setText(null);
							FCorte[j].setText(null);
							pd.removeAll();
							lTarjetan = new Label("Tarjeta");
							lTarjetan.setPreferredSize(new Dimension(150,25));
							pd.add(lTarjetan);
							
							lGasto = new Label("Gastos");
							lGasto.setPreferredSize(new Dimension(150,25));
							pd.add(lGasto);
							
							lFCorte = new Label("Fecha Corte");
							lFCorte.setPreferredSize(new Dimension(150,25));
							pd.add(lFCorte);
							
							lFPago = new Label("Fecha Pago");
							lFPago.setPreferredSize(new Dimension(150,25));
							pd.add(lFPago);
							
							for(int k=0;k<pd.getN();k++){
								Tarjeta[k].setText(tarjetas.obtenerNombre(k));
								Tarjeta[k].setPreferredSize(new Dimension(150,25));
								pd.add(Tarjeta[k]);
								
								Gasto[k].setText("$"+tarjetas.obtenerTotal(k));
								Gasto[k].setPreferredSize(new Dimension(150,25));
								pd.add(Gasto[k]);
								
								FCorte[k].setText(""+tarjetas.obtenerDCorte(k));
								FCorte[k].setPreferredSize(new Dimension(150,25));
								pd.add(FCorte[k]);
								
								FPago[k].setText(""+tarjetas.obtenerDPago(k));
								FPago[k].setPreferredSize(new Dimension(150,25));
								pd.add(FPago[k]);
								
								num+=tarjetas.obtenerTotal(k);
							}
							
							queda.setText("Resta de ingreso Mensual $ "+(pd.getIngresoM()-num));
							total.setText("Total $ "+num);
							
							pr.updateUI();
							pd.revalidate();
						}
					}
					win.dispose();

					
				} catch (Exception ex){
					JOptionPane.showMessageDialog(null, "No se ha seleccionado ninguna tarjeta");
				}
				
			}
		});
		this.add(this.btAceptar);
		
		
	}
	
}
