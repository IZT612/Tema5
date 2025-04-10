package parte5.ejercicio2;

public class BlankDniException extends Exception{
	
	public String toString() {
		
		return "Se ha introducido un dni vacío. Vuelva a intentarlo.";
		
	}

}
