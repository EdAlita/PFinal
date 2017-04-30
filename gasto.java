package PFinal;

import java.util.ArrayList;

public class gasto {
	private ArrayList<String> nombre,
					 		 categorias;
	private ArrayList<Double> gasto;
	

	public gasto() {
		this.nombre=new ArrayList<String>();
		this.categorias=new ArrayList<String>();
		this.gasto=new ArrayList<Double>();
	}
	
	public void setNombre(String nombre){
		this.nombre.add(nombre);
	}
	
	public void setCategorias(String categorias){
		this.categorias.add(categorias);
	}
	
	public void setGasto(Double gasto){
		this.gasto.add(gasto);
	}

	public ArrayList<String> getNombre() {
		return nombre;
	}

	public ArrayList<String> getCategorias() {
		return categorias;
	}

	public ArrayList<Double> getGasto() {
		return gasto;
	}

	
	

}
