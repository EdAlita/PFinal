package PFinal;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class panelConfiguracion extends JPanel implements ActionListener{

	
	private JFrame win;
	
	private JLabel instruccion,
				 	lTarjeta; 
	
	
	private JButton btAceptar,
					btRegresar; 
	
	private panelDatos pd; 

	private tarjetas tarjetas;
	private String[] nombres,
    				categorias;
	private gasto gastos;

	private JComboBox cbTarjetas; 
	
	public panelConfiguracion(panelDatos pd,JFrame frame){
		this.setPreferredSize(new Dimension(400,400));
	
		this.pd= pd; 
		this.win=frame;
		
	/*	this.categorias=pd.getCategorias();
		this.gastos=pd.getGastos();
		this.tarjetas=pd.getTarjetas();
		
		this.setBackground( Color.LIGHT_GRAY);
		setFont(new Font("Default",Font.BOLD,18));

		this.win = frame; 
		
		this.instruccion = new JLabel("Que modificacion quiere hacer"); 
		this.instruccion.setPreferredSize(new Dimension(375,25));
		this.add(instruccion); 
		

		this.lTarjeta= new JLabel("Eliminar una Tarjeta"); 
		this.lTarjeta.setPreferredSize(new Dimension(375,25));
		this.add(this.lTarjeta);
		
		this.cbTarjetas= new JComboBox(this.nombres);
		this.cbTarjetas.setPreferredSize(new Dimension(200,25));
		this.add(cbTarjetas);
		
		
		*/
		this.btRegresar= new JButton("Regresar"); 
		this.btRegresar.setPreferredSize(new Dimension(150,30));
		
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
		this.btAceptar.setPreferredSize(new Dimension(150,30));
		this.btAceptar.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				win.dispose();
			}
		});
		this.add(this.btAceptar);
		
		
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
}
