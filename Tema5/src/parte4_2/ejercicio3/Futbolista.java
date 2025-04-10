package parte4_2.ejercicio3;

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
	
	public int getEdad() {
		
		return this.edad;
		
	}
	
	public int getNumeroGoles() {
		
		return this.numeroGoles;
		
	}
	
	public int getNumeroCami() {
		
		return this.numeroCami;
		
	}
	
	public String getNombre() {
		
		return this.nombre;
		
	}
	
	public String toString() {
		
		return "Número de camiseta: " + this.numeroCami + " | Nombre : " + this.nombre + " | Edad: " + this.edad + " | Número de goles: " + this.numeroGoles;
		
	}
	
	public boolean equals(Futbolista futbolista) {
		
		return (futbolista.nombre.equals(this.nombre) && futbolista.numeroCami == this.numeroCami);
		
	}

	public int compareTo(Futbolista futbolista) {
		
		int iguales = 0;
		
		if (Integer.compare(this.numeroCami, futbolista.numeroCami) == 0) {
			
			if (this.nombre.compareTo(futbolista.nombre) == 0) {
				
				iguales = 1;
				
			}
			
		} else {
			
			iguales = -1;
			
		}
		
		return iguales;
	}
	
	
	
	
}
