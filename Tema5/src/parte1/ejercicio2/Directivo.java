package parte1.ejercicio2;

public class Directivo extends Empleado{
	
	public Directivo(String nombre) {
		
		super(nombre);
		
	}
	
	public String toString() {
		
		String informacion = super.toString();
		
		informacion += "-> Directivo ";
		
		return informacion;
		
	}

}
