package parte2.ejercicio2;

public class Futbolista {

	private int numeroCami;
	private String nombre;
	private int edad;
	private int numeroGoles;
	
	public Futbolista(int numeroCami, String nombre, int edad, int numeroGoles) {
		
		if(numeroCami > 0) {
			
			this.numeroCami = numeroCami;
			
		}
		
		if(!nombre.isBlank()) {
			
			this.nombre = nombre;
			
		}
		
		if(edad >= 18 && edad < 130) {
			
			this.edad = edad;
			
		}
		
		if (numeroGoles >= 0) {
			
			this.numeroGoles = numeroGoles;
			
		}
		
		
		
	}

}