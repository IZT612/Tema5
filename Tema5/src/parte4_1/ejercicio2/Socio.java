package parte4_1.ejercicio2;

public class Socio {
	
	private int id;
	private String nombre;
	private int edad;
	
	public Socio(int id, String nombre, int edad) {
		
		if(id > 0) {
			
			this.id = id;
			
		}
		
		if(!nombre.isBlank()) {
			
			this.nombre = nombre;
			
		}
		
		if(edad >= 18 && edad < 125) {
			
			this.edad = edad;
			
		}
		
	}
	
	public int getId() {
		
		return this.id;
		
	}
	
	public String getNombre() {
		
		return this.nombre;
		
	}
	
	public int getEdad() {
		
		return this.edad;
		
	}
	
	public String toString() {
		
		return "ID: " + this.id + " | Nombre: " + this.nombre + " | Edad: " + this.edad;
		
	}


}
