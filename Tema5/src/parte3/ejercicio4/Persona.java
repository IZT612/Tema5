package parte3.ejercicio4;

public class Persona extends Contacto {
	
	private String cumpleaños;
	
	public Persona(String nombre, int numero, String cumpleaños) {
		
		super(nombre, numero);
		
		if(!cumpleaños.isBlank()) {
			
			this.cumpleaños = cumpleaños;
			
		}
		
	}
	
	public String getCumpleaños() {
		
		return this.cumpleaños;
		
	}
	
	public String toString() {
		
		String info = super.toString();
		
		info += " | Cumpleaños: " + this.cumpleaños;
		
		return info;
		
	}

}
