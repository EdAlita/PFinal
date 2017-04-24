package PFinal;

public class tarjeta {
	
	private String Nombre;
	private int fpago,
				fcorte;
	private static int n;
	private double lcargo,
				   total;
				
	
	public tarjeta(String Nombre, int fpago,int fcorte, double lcargo ){
		this.Nombre= Nombre; 
		this.fpago= fpago;
		this.fcorte=fcorte; 
		this.lcargo=lcargo; 
		this.total=0;
		this.n+=1;
	}

	public static int getN() {
		return n;
	}

	public void realizarCargo(double cargo){
		this.total += cargo;
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
