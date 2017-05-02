package PFinal;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Label;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class panelGenerarResumen extends JPanel {
	
	private String tarjeta;
	private gasto gastos;
	private Label lnombre,
				  lgasto,
				  lcategoria,
				  lNo;
	private int num;
	private ArrayList<String> nombre,
	 					categorias;
	private ArrayList<Double> gasto;
	

	public panelGenerarResumen(panelDatos pd, JFrame win) {
		super();
		this.setPreferredSize(new Dimension(625,400));
		this.setBackground(new Color(169,183,192));
		this.setFont(new Font("Default",Font.BOLD,18));
		this.gastos=pd.getGastos();
		this.nombre=gastos.getNombre();
		this.categorias=gastos.getCategorias();
		this.gasto=gastos.getGasto();
		
		tarjeta = JOptionPane.showInputDialog("Cual es el Nombre de la Tarjeta que quiere Generar el Reporte");
		
		
		for(int i=0;i<nombre.size();i++){
			if(nombre.get(i).equals(tarjeta)){

				
				lnombre = new Label();
				lnombre.setText(nombre.get(i));
				lnombre.setPreferredSize(new Dimension(200,25));
				this.add(lnombre);
				
				lcategoria = new Label(categorias.get(i));
				lcategoria.setPreferredSize(new Dimension(200,25));
				this.add(lcategoria);
				
				lgasto = new Label("$"+gasto.get(i));
				lgasto.setPreferredSize(new Dimension(200,25));
				this.add(lgasto);
				num++;
				this.updateUI();
			}

		//this.setPreferredSize(new Dimension(625,num*25+100));
	
		
			}  
   		}

	}
