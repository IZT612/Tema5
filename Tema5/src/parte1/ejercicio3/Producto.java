package parte1.ejercicio3;

public class Producto {

	private String nombre;
	private double precio;
	
	public Producto(String nombre, double precio) {
		
		if (!nombre.isBlank()) {
			
			this.nombre = nombre;
			
		}
		
		if (precio > 0) {
			
			this.precio = precio;
			
		}
		
	}
	
	public String getNombre() {
		
		return this.nombre;
		
	}
	
	public double getPrecio() {
		
		return this.precio;
		
	}
	
	public void setNombre(String nombre) {
		
		if (!nombre.isBlank()) {
			
			this.nombre = nombre;
			
		}
		
	}
	
	public void setPrecio(double precio) {
		
		if (precio > 0) {
			
			this.precio = precio;
			
		}
		
	}
	
	public String toString() {
		
		return "Nombre: " + this.nombre + ". Precio: " + this.precio + "€. ";
		
	}
	
	public double calcular(int cantidad) {
		
		return this.precio * cantidad;
		
	}
	
}
