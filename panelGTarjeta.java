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
import javax.swing.JPanel;
import javax.swing.JTextField;

public class panelGTarjeta extends JPanel implements ActionListener{
	
	
	private Label etiqueta, 
				  tarjeta,
				  pago; 
	private Label[] Pago;
	private JTextField gasto; 
	private JComboBox cb;
	private tarjetas tarjetas;
	private JButton aceptar; 
	private String[] nombres;
	private int n;
	private double cargo;
	private panelDatos pd;
	private String hola;
	private JFrame win;
	
	public panelGTarjeta(panelDatos pd,JFrame win){
		super();
		this.setPreferredSize(new Dimension(425,200));
		this.setBackground( Color.LIGHT_GRAY);
		this.setFont(new Font("Default",Font.BOLD,18));
		this.tarjetas=pd.getTarjetas();
		this.pd=pd;
		this.win=win;
		this.Pago=pd.getGasto();
		tarjetas = pd.getTarjetas();
		n = pd.getN();
		nombres = new String[n];
		for(int i=0;i<n;i++){
			nombres[i]=tarjetas.obtenerNombre(i);
		}
		
		this.etiqueta= new Label("Seleccione la tarjeta y el monto que gasto"); 
		this.etiqueta.setPreferredSize(new Dimension(400,25));
		this.add(this.etiqueta);
		
		this.tarjeta= new Label("Nombre de la Tarjeta");
		this.tarjeta.setPreferredSize(new Dimension(200,25));
		this.add(tarjeta);
		
		this.cb= new JComboBox(nombres);
		this.cb.setPreferredSize(new Dimension(200,25));
		this.add(cb);
		
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
					tarjetas.hacerCargo(i, cargo);
					Pago[i].setText("$"+tarjetas.obtenerTotal(i));
				    this.win.dispose();
				    break;
				}
			}
		}
		
	}

}
