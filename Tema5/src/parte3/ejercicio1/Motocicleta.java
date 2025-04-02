package parte3.ejercicio1;

public class Motocicleta extends Vehiculo{
	
	private int cilindrada;
	
	public Motocicleta(String marca, String modelo, String color, String matricula, int cilindrada) {
		
		super(marca, modelo, color, matricula);
		
		if (cilindrada > 0) {
			
			this.cilindrada = cilindrada;
			
		}
		
	}
	
	public int getCilindrada() {
		
		return this.cilindrada;
		
	}
	
	public boolean requiereCarnet() {
		
		boolean carnet = false;
		
		if(this.cilindrada >= 125) {
			
			carnet = true;
			
		}
		
		return carnet;
		
	}

}
