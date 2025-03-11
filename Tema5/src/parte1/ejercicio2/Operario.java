package parte1.ejercicio2;

public class Operario extends Empleado{
	
	public Operario(String nombre) {
		
		super(nombre);
		
	}
	
	public String toString() {
		
		String informacion = super.toString();
		
		informacion += "-> Operario ";
		
		return informacion;
		
	}

}
