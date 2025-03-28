package parte1.ejercicio5;

public abstract class Poligono {
	
	private int numeroLados;
	
	public Poligono() {
		
		
	}
	
	public Poligono(int lados) {
		
		if (lados == 3 || lados == 4) {
			
			this.numeroLados = lados;
			
		}
		
	}
	
	public int getNumeroLados() {
		
		return this.numeroLados;
		
	}
	
	abstract public double area();
		
	public String toString() {
		
		String informacion = "";
		
		informacion += "Lados: " + this.numeroLados + " ";
		
		return informacion;
		
		
	}
}
