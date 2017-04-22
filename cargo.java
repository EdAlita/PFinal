package PFinal;

public class cargo {
	
	private double gasto;
	private String categoria,
	       nombre;
	private double[] cargos;
	
	public cargo(double gasto, String categoria, String nombre) {
		this.gasto= gasto; 
		this.categoria= categoria; 
		this.nombre= nombre; 
	}

	public double getGasto() {
		return gasto;
	}

	public void setGasto(double gasto) {
		this.gasto = gasto;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double[] getCargos() {
		return cargos;
	}

	public void setCargos(double[] cargos) {
		this.cargos = cargos;
	}

	
	
	
}
