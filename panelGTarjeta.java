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
	private JButton aceptar,
					btCancelar; 
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
		this.setBackground(new Color(239,217,193));
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
		for(int i=0;i<n-1;i++){
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
		
		this.btCancelar= new JButton("Regresar");
		this.btCancelar.setBackground(Color.WHITE);
		this.btCancelar.setPreferredSize(new Dimension(170,30));
		this.btCancelar.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				int tmp=JOptionPane.showConfirmDialog(null, "Tus datos se perderan");
				if(tmp==JOptionPane.YES_OPTION){
					win.dispose();
				}
			}
		});
		this.add(btCancelar);
		
		
		this.aceptar= new JButton("Aceptar");
		this.aceptar.setBackground(Color.WHITE);
		this.aceptar.setPreferredSize(new Dimension(170,30));
		this.aceptar.addActionListener(this);
		this.add(this.aceptar);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==this.aceptar){
			try{
			for(int i=0;i<this.tarjetas.obtenerLength();i++){
				this.hola=this.cb.getSelectedItem().toString();
				if(hola==tarjetas.obtenerNombre(i)){
					cargo=Double.parseDouble(this.gasto.getText());
					if((cargo+tarjetas.obtenerTotal(i))<tarjetas.obtenerLCredito(i)){
					tarjetas.hacerCargo(i, cargo);
					this.gastos.setCategorias(this.cb2.getSelectedItem().toString());
					this.gastos.setNombre(this.cb.getSelectedItem().toString());
					this.gastos.setGasto(cargo);
					Pago[i].setText("$"+tarjetas.obtenerTotal(i));
					pd.setPresiono2(true);
					System.out.println(pd.getN());
					for(int j =0; j<pd.getN()-1;j++){
						System.out.println(num+"antes");
						num+=tarjetas.obtenerTotal(j);
						System.out.println(num);
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
		catch(NumberFormatException ev){
			JOptionPane.showMessageDialog(null,"Verifica que los datos sean númericos");
			gasto.setText(null);
			}
			catch(Exception ex){
				JOptionPane.showMessageDialog(null,"Verifique haber llenado los campos");
			}	
		}
	}

}
