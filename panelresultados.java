package PFinal;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class panelresultados extends JPanel {
	private double resultado;
	private Label lresultado,
				  ldia,
				  lqueda;
	private panelDatos pd;
	private tarjetas tarjetas;
	private JButton btSalir;
	private JFrame win;
	private gasto gastos;
	private String[] categoria;
	private ArrayList<String> nombre,
							categorias;
	private ArrayList<Double> gasto;

	public panelresultados(panelDatos pd, JFrame win) {
		super();
<<<<<<< HEAD
		this.setPreferredSize(new Dimension(600,70));
		this.setBackground(new Color(205,163,79));
=======
		this.setPreferredSize(new Dimension(720,150));
		this.setBackground(new Color(205,225,254));
		
>>>>>>> origin/master
		this.pd=pd;
		this.win=win;
		this.tarjetas=pd.getTarjetas();
		this.gastos=pd.getGastos();
		this.nombre=gastos.getNombre();
		this.categorias=gastos.getCategorias();
		this.gasto=gastos.getGasto();
		this.categoria=pd.getCategorias();
		
		setFont(new Font("Default",Font.BOLD,18));
	
		this.lresultado = new Label("Total: $"+pd.getResultado());
		this.lresultado.setPreferredSize(new Dimension(300,25));
		this.add(lresultado);
		
		this.lqueda = new Label("Resta de Ingreso Mensual $"+(this.pd.getIngresoM()-pd.getResultado()));
		this.lqueda.setPreferredSize(new Dimension(400,25));
		this.add(lqueda);
		
		this.btSalir =new JButton("Salir");
		this.btSalir.setPreferredSize(new Dimension(300,50));
		this.btSalir.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0) {
				win.dispose();
				try {
					PrintWriter pw = new PrintWriter(new FileWriter("tarjetas"));
					PrintWriter pw2 = new PrintWriter(new FileWriter("pagos"));
					PrintWriter pw3 = new PrintWriter(new FileWriter("ingresoM"));
					PrintWriter pw4 = new PrintWriter(new FileWriter("categorias"));
					PrintWriter pw5 = new PrintWriter(new FileWriter("n"));
					pw5.println(pd.getN());
					for(int i=0;i<pd.getN()-1;i++){
						pw.println(tarjetas.obtenerNombre(i)+","+tarjetas.obtenerTotal(i)+","+tarjetas.obtenerLCredito(i)+","+tarjetas.obtenerDCorte(i)+","+tarjetas.obtenerDPago(i));
					}
					for(int j=0;j<nombre.size();j++){
						pw2.println(nombre.get(j)+","+categorias.get(j)+","+gasto.get(j));
						pw4.println(categoria[j]);
					}
					for(int k=0;k<categoria.length;k++){
						pw4.println(categoria[k]);
					}
					pw3.println(pd.getIngresoM());
					pw5.close();
					pw4.close();
					pw3.close();
					pw.close();
					pw2.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		this.add(btSalir);
		
		
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
