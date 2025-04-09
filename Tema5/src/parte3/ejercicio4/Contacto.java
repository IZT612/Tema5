package parte3.ejercicio4;

public class Contacto {

	private String nombre;
	private int numero;
	
	public Contacto(String nombre, int numero) {
		
		if(!nombre.isBlank()) {
			
			this.nombre = nombre;
			
		}
		
		this.numero = numero;
		
	}
	
	public String getNombre() {
		
		return this.nombre;
		
	}
	
	public int getNumero() {
		
		return this.numero;
		
	}
	
	public boolean equals(Contacto contacto) {
		
		boolean iguales = false;
		
		if(this.nombre.equals(contacto.getNombre())) {
			
			iguales = true;
			
		}
		
		return iguales;
		
	}
	
	public String toString() {
		
		String info;
		
		info = "Nombre: " + this.nombre + " | Número: " + this.numero;
		
		return info;
		
	}
	
}
