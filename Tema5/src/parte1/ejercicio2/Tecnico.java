package parte1.ejercicio2;

public class Tecnico extends Operario{

	public Tecnico(String nombre) {
		
		super(nombre);
		
	}
	
	public String toString() {
		
		String informacion = super.toString();
		
		informacion += "-> Tecnico ";
		
		return informacion;
		
	}
	
}
