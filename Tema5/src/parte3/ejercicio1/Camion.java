	package parte3.ejercicio1;

public class Camion extends Vehiculo{

	private double pesoMaximo;
	private boolean mercanciaPeligrosa;
	
	public Camion(String marca, String modelo, String color, String matricula, double pesoMaximo, boolean mercanciaPeligrosa) {
		
		super(marca, modelo, color, matricula);
		if (pesoMaximo > 0) {
			
			this.pesoMaximo = pesoMaximo;
			
		}
		
		this.mercanciaPeligrosa = mercanciaPeligrosa;
		
	}
	
	public double getPesoMaximo() {
		
		return this.pesoMaximo;
		
	}
	
	public boolean getMercanciaPeligrosa() {
		
		return this.mercanciaPeligrosa;
		
	}
	
	public void setMercanciaPeligrosa(boolean mercanciaPeligrosa) {
		
		this.mercanciaPeligrosa = mercanciaPeligrosa;
		
	}
	
	
	
	
}
