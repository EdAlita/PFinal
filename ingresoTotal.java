package PFinal;

public class ingresoTotal {

	private Double ingreso,
				   ingresoExtra,
				   Total; 

	public ingresoTotal(Double ingreso){
		this.ingreso=ingreso;
		this.ingresoExtra= 0.0; 
		this.getTotal();
	}
	
	public void agregarIngreso(Double ingresoE){
		this.ingresoExtra= ingresoE;
		this.Total= this.ingreso + ingresoExtra; 
	}
	
	
	public Double getIngreso() {
		return ingreso;
	}

	public Double getIngresoExtra() {
		return ingresoExtra;
	}

	
	public Double getTotal() {
		return Total;
	}

	public void setIngreso(Double ingreso) {
		this.ingreso = ingreso;
	}

	public void setIngresoExtra(Double ingresoExtra) {
		this.ingresoExtra = ingresoExtra;
	}


	
}

