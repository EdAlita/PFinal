package PFinal;

public class tarjetas {
	
	private tarjeta[] tarjetas;

	public tarjetas() {
		tarjetas = new tarjeta[10];
	}
	
	public void agregarTarjeta(tarjeta tarjeta){
		for(int i=0;i<this.tarjetas.length;i++){
			if(tarjetas[i]==null){
				tarjetas[i]=tarjeta;
				break;
			}
		}
	}
	
	public String obtenerNombre(int num){
		return tarjetas[num].getNombre();
	}

	public int obtenerDPago(int num){
		return tarjetas[num].getFpago();
	}
	
	public int obtenerDCorte(int num){
		return tarjetas[num].getFcorte();
	}
	
	public double obtenerLCredito(int num){
		return tarjetas[num].getLcargo();
	}
	
	public double obtenerTotal(int num){
		return tarjetas[num].getTotal();
	}
	
	public int obtenerLength(){
		return tarjetas.length;
	}
	
	public void hacerCargo(int num, double cargo){
		tarjetas[num].realizarCargo(cargo);
	}
	
	public void eliminar(int i){
		int num=0;
		tarjetas[i]=null;
		for(int j=0;j<tarjetas.length;j++){
		if(tarjetas[j]!=null){
			tarjetas[num]=tarjetas[j];
			num++;
		}}
		
	}
}
