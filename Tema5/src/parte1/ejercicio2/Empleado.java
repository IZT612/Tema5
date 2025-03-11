package parte1.ejercicio2;

public class Empleado {
	
	private String nombre;
	
	public Empleado(String nombre) {
		
		if (!nombre.isBlank()) {
			
			this.nombre = nombre;
			
		}
		
	}
	
	public void setNombre(String nombre) {
		
		if (!nombre.isBlank()) {
			
			this.nombre = nombre;
			
		}
		
	}
	
	public String getNombre() {
		
		return this.nombre;
		
	}
	
	public String toString() {
		
		String informacion = "Empleado " + this.nombre + " ";
		
		return informacion;
		
	}

}
