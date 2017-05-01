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
import javax.swing.JPanel;

public class panelGAltaCategoria extends JPanel implements ActionListener {
	
	private Label lintruccion,
                  lcategoria;
	private TextField tfcategoria;
	private JButton btAceptar;
	private JFrame win;
	private panelDatos pd;
	private String[] categorias;
	private String categoria;
	public panelGAltaCategoria(panelDatos pd,JFrame win){
		this.win = win;
		this.pd = pd;
		this.categorias=pd.getCategorias();
		
		this.setPreferredSize(new Dimension(425,200));
		this.setBackground( Color.LIGHT_GRAY);
		this.setFont(new Font("Default",Font.BOLD,18));
		
		this.lintruccion = new Label("Pon la categoria que quieres agregar");
		this.lintruccion.setPreferredSize(new Dimension(400,25));
		this.add(lintruccion);
		
		this.lcategoria = new Label("Categoria: ");
		this.lcategoria.setPreferredSize(new Dimension(200,25));
		this.add(lcategoria);
		
		this.tfcategoria = new TextField();
		this.tfcategoria.setPreferredSize(new Dimension(200,25));
		this.add(tfcategoria);
		
		this.btAceptar = new JButton("Aceptar");
		this.btAceptar.setPreferredSize(new Dimension(200,25));
		this.btAceptar.addActionListener(this);
		this.add(btAceptar);
		
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		categoria=this.tfcategoria.getText();
		for(int i = 0; i<categorias.length;i++){
			if(categorias[i]==null){
				categorias[i]=categoria;
				pd.setCategorias(categorias);
				win.dispose();
				break;
			}
		}
	}
}
