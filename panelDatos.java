package PFinal;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Label;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class panelDatos extends JPanel {
	
	private Label lTarjeta,
	               lGasto,
	               lFCorte,
	               lFPago,
	               ntotal,
	               queda;
	private Label[] Tarjeta,
    			    Gasto,
                    FCorte,
                    FPago;
	private tarjetas tarjetas;
	private gasto gasto;
	private String[] categorias;
	private int n,
	            tmp,
	            i,
	            tmp2;
	private double resultados,tmptotal;
	private JFrame win;
	private boolean presiono,
	                presiono2;
	private StringTokenizer st,
							st2;
	private String Nombre;
	private int fpago,
				fcorte;
	private double lcargo,
				   total;
	private double ingresoM;
	private panelresultados pr;
	
	
	public panelDatos(JFrame win){
		super();
		this.gasto=new gasto();
		tarjetas = new tarjetas();
		this.setPreferredSize(new Dimension(700,400));
		this.setBackground(Color.gray);
		setFont(new Font("Default",Font.BOLD,18));
		
		this.win=win;
		//ntotal = pr.getLresultado();
		//queda = pr.getLqueda();
		
		Tarjeta = new Label[10];
		Gasto = new Label[10];
		FPago = new Label[10];
		FCorte = new Label[10];
		presiono = false;
		presiono2 = false;
		n=1;
		categorias = new String[10];
		i=0;
		
		categorias[0]="Personal";
		categorias[1]="Trabajo";
		categorias[2]="Escuela";
		
<<<<<<< HEAD
		try{
		this.ingresoM=Double.parseDouble(JOptionPane.showInputDialog("Ingresa Saldo Mensual"));
		}catch (NumberFormatException ex){
			JOptionPane.showMessageDialog(null,"Verifique que sus datos sean númericos");
			this.ingresoM=Double.parseDouble(JOptionPane.showInputDialog("Ingresa Saldo Mensual"));
		} //if (this.ingresoM== JOptionPane.CANCEL_OPTION){
			//System.exit(1);
		//}
		
		/* if()
		
			int res=JOptionPane.showConfirmDialog(null, "Tus datos se perderan ¿Seguro que quieres continuar?");
		if(res == JOptionPane.YES_OPTION){
			interfac.setVisible(false);
			
			}
		*/
		
=======
		int tmp=JOptionPane.showConfirmDialog(null, "Iniciar Sesion anterior");
>>>>>>> origin/master
		
		if(tmp==JOptionPane.YES_OPTION){
		 try {
			BufferedReader bf = new BufferedReader(new FileReader("tarjetas"));
			BufferedReader bf2 = new BufferedReader(new FileReader("pagos"));
			BufferedReader bf3 = new BufferedReader(new FileReader("ingresoM"));
			BufferedReader bf4 = new BufferedReader(new FileReader("categorias"));
			BufferedReader bf5 = new BufferedReader(new FileReader("n"));
			
			String linea;
			while((linea=bf.readLine()) != null){
				st = new StringTokenizer(linea);
				this.Nombre=st.nextToken(",");
				this.total=Double.parseDouble(st.nextToken());
				this.lcargo=Double.parseDouble(st.nextToken());
				this.fcorte=Integer.parseInt(st.nextToken());
				this.fpago=Integer.parseInt(st.nextToken());
				++tmp;
				
				
				tarjeta tmp2 = new tarjeta(Nombre, fpago, fcorte, lcargo); 
				tmp2.realizarCargo(total);
				tmptotal+=tmp2.getTotal();
				tarjetas.agregarTarjeta(tmp2);
				
				Tarjeta[i] = new Label(Nombre);
				Tarjeta[i].setPreferredSize(new Dimension(150,25));
				this.add(Tarjeta[i]);
				
				Gasto[i] = new Label("$"+total);
				Gasto[i].setPreferredSize(new Dimension(150,25));
				this.add(Gasto[i]);
				
				FCorte[i] = new Label(""+fcorte);
				FCorte[i].setPreferredSize(new Dimension(150,25));
				this.add(FCorte[i]);
				
				FPago[i] = new Label(""+fpago);
				FPago[i].setPreferredSize(new Dimension(150,25));
				this.add(FPago[i]);	
				this.updateUI();
				this.n=tmp;
			}
			String linea2;
			while((linea2=bf2.readLine()) != null){
				st2 = new StringTokenizer(linea2);
				gasto.setNombre(st2.nextToken(","));
				gasto.setCategorias(st2.nextToken());
				gasto.setGasto(Double.parseDouble(st2.nextToken()));
			}
			
			this.ingresoM=Double.parseDouble(bf3.readLine());
		
<<<<<<< HEAD
		this.setPreferredSize(new Dimension(700,400));
		this.setBackground(new Color(169,169,169));
		setFont(new Font("Default",Font.BOLD,18));
=======
			String linea3;
			tmp2=0;
			while((linea3=bf4.readLine()) != null){
				this.categorias[tmp2]=linea3;
				System.out.println(categorias[tmp2]);
				++tmp2;
			}
			
			this.setN(Integer.parseInt(bf5.readLine()));
			
			this.resultados=tmptotal;
>>>>>>> origin/master
		
			bf5.close();
			bf4.close();
			bf3.close();
			bf2.close();
			bf.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}else{
			try{
				this.ingresoM=Double.parseDouble(JOptionPane.showInputDialog("Ingresa Saldo Mensual"));
				}catch(NumberFormatException nex){
					JOptionPane.showMessageDialog(null, "No ha ingresado nada");
				}
		
			this.lTarjeta = new Label("Tarjeta");
			this.lTarjeta.setPreferredSize(new Dimension(150,25));
			this.add(lTarjeta);
			
			this.lGasto = new Label("Gastos");
			this.lGasto.setPreferredSize(new Dimension(150,25));
			this.add(lGasto);
			
			this.lFCorte = new Label("Fecha Corte");
			this.lFCorte.setPreferredSize(new Dimension(150,25));
			this.add(lFCorte);
			
			this.lFPago = new Label("Fecha Pago");
			this.lFPago.setPreferredSize(new Dimension(150,25));
			this.add(lFPago);
		}

		
		}


	public double getResultado() {
		return resultados;
	}


	public void setResultado(double resultado) {
		this.resultados = resultado;
	}


	public void setGasto(gasto gasto) {
		this.gasto = gasto;
	}
	
	public gasto getGastos(){
		return gasto;
	}


	public String[] getCategorias() {
		return categorias;
	}


	public void setCategorias(String[] categorias) {
		this.categorias = categorias;
	}


	public Label[] getTarjeta() {
		return Tarjeta;
	}


	public void setTarjeta(Label[] tarjeta) {
		Tarjeta = tarjeta;
	}


	public Label[] getGasto() {
		return Gasto;
	}


	public void setGasto(Label[] gasto) {
		Gasto = gasto;
	}


	public Label[] getFCorte() {
		return FCorte;
	}


	public void setFCorte(Label[] fCorte) {
		FCorte = fCorte;
	}


	public Label[] getFPago() {
		return FPago;
	}


	public void setFPago(Label[] fPago) {
		FPago = fPago;
	}
	

	public boolean isPresiono2() {
		return presiono2;
	}


	public void setPresiono2(boolean presiono2) {
		this.presiono2 = presiono2;
	}

	public panelresultados getPr() {
		return pr;
	}


	public void setPr(panelresultados pr) {
		this.pr = pr;
	}


	public double getIngresoM() {
		return ingresoM;
	}


	public void setIngresoM(double ingresoM) {
		this.ingresoM = ingresoM;
	}


	public boolean isPresiono() {
		return presiono;
	}


	public void setPresiono(boolean presiono) {
		this.presiono = presiono;
	}


	public int getN() {
		return n;
	}


	public void setN(int n) {
		this.n = n;
	}


	public tarjetas getTarjetas() {
		return tarjetas;
	}


	public void setTarjetas(tarjetas tarjetas) {
		this.tarjetas = tarjetas;
	}
		
	}

