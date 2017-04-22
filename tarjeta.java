package PFinal;

public class tarjeta {
	
	private String Nombre;
	private int fpago,
				fcorte;
	private double lcargo,
				   total;
				
	
	public tarjeta(String Nombre, int fpago,int fcorte, double lcargo ){
		this.Nombre= Nombre; 
		this.fpago= fpago;
		this.fcorte=fcorte; 
		this.lcargo=lcargo; 
		this.total=0;
	}

	public void realizarCargo(cargo cargo){
		this.total += cargo.getGasto();
	}

	public String getNombre() {
		return Nombre;
	}

	public int getFpago() {
		return fpago;
	}

	public int getFcorte() {
		return fcorte;
	}

	public double getLcargo() {
		return lcargo;
	}

	public double getTotal() {
		return total;
	}
	
}
