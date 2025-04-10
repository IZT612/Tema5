package parte4_1.ejercicio5;

public class Titular {

	private String dni;
	private String nombre;
	private String apellidos;
	private int telefono;
	
	public Titular(String dni, String nombre, String apellidos, int telefono) {
		
		if(!dni.isBlank()) {
			
			this.dni = dni;
			
		}
		
		if(!nombre.isBlank()) {
			
			this.nombre = nombre;
			
		}
		
		if(!apellidos.isBlank()) {
			
			this.apellidos = apellidos;
			
		}
		
		this.telefono = telefono;
		
	}
	
	public String getDni() {
		
		return this.dni;
		
	}
	
	public String getNombre() {
		
		return this.nombre;
		
	}
	
	public String getApellidos() {
		
		return this.apellidos;
		
	}
	
	public int geTelefono() {
		
		return this.telefono;
		
	}
	
}
