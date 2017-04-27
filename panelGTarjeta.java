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
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class panelGTarjeta extends JPanel implements ActionListener{
	
	private Label etiqueta, 
				  tarjeta,
				  pago,
				  categoria,
				  total,
				  queda; 
	private Label[] Pago;
	private JTextField gasto; 
	private JComboBox cb,
					  cb2;
	private tarjetas tarjetas;
	private JButton aceptar; 
	private String[] nombres,
	                 categorias;
	private gasto gastos;
	private int n;
	private double cargo;
	private panelDatos pd;
	private String hola;
	private JFrame win;
	private panelresultados pr;
	private double num;
	public panelGTarjeta(panelDatos pd,JFrame win){
		super();
		this.setPreferredSize(new Dimension(425,200));
		this.setBackground( Color.LIGHT_GRAY);
		this.setFont(new Font("Default",Font.BOLD,18));
		this.categorias=pd.getCategorias();
		this.gastos=pd.getGastos();
		this.tarjetas=pd.getTarjetas();
		this.pd=pd;
		this.pr=pd.getPr();
		this.total=pr.getLresultado();
		this.queda=pr.getLqueda();
		this.win=win;
		this.Pago=pd.getGasto();
		tarjetas = pd.getTarjetas();
		n = pd.getN();
		nombres = new String[n];
		for(int i=0;i<n;i++){
			if(tarjetas.obtenerNombre(i)!="Efectivo"){
			nombres[i]=tarjetas.obtenerNombre(i);
			}
		}
		
		this.etiqueta= new Label("Seleccione la tarjeta y el monto que gasto"); 
		this.etiqueta.setPreferredSize(new Dimension(400,25));
		this.add(this.etiqueta);
		
		this.tarjeta= new Label("Nombre de la Tarjeta");
		this.tarjeta.setPreferredSize(new Dimension(200,25));
		this.add(tarjeta);
		
		this.cb= new JComboBox(this.nombres);
		this.cb.setPreferredSize(new Dimension(200,25));
		this.add(cb);
		
		this.tarjeta= new Label("Categoria ");
		this.tarjeta.setPreferredSize(new Dimension(200,25));
		this.add(tarjeta);
		
		this.cb2= new JComboBox(this.categorias);
		this.cb2.setPreferredSize(new Dimension(200,25));
		this.add(cb2);
		
		this.pago= new Label("Monto: ");
		this.pago.setPreferredSize(new  Dimension(200,25));
		this.add(pago);
		
		this.gasto= new JTextField(15); 
		this.gasto.setPreferredSize(new Dimension(200,25));
		this.add(gasto);
		
		this.aceptar= new JButton("Aceptar");
		this.aceptar.addActionListener(this);
		this.add(this.aceptar);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==this.aceptar){
			for(int i=0;i<this.tarjetas.obtenerLength();i++){
				this.hola=this.cb.getSelectedItem().toString();
				if(hola==tarjetas.obtenerNombre(i)){
					cargo=Double.parseDouble(this.gasto.getText());
					if((cargo+tarjetas.obtenerTotal(i))<tarjetas.obtenerLCredito(i)){
					tarjetas.hacerCargo(i, cargo);
					this.gastos.setCategorias(this.cb2.getSelectedItem().toString());
					this.gastos.setNombre(hola);
					this.gastos.setGasto(cargo);
					Pago[i].setText("$"+tarjetas.obtenerTotal(i));
					pd.setPresiono2(true);
					for(int j =0; j<pd.getN();j++){
						num=+tarjetas.obtenerTotal(j);
					}
					total.setText("Total $ "+num);
					queda.setText("Resta de ingreso Mensual $ "+(pd.getIngresoM()-num));
					pr.updateUI();
				    this.win.dispose();
				    break;
				    }
					else{
					JOptionPane.showMessageDialog(null, "El limite de credito ya se excedio");
					break;
					}
				}
			}
		}
		
	}

}
