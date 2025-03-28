package parte1.ejercicio5;

public class Rectangulo extends Poligono{
	
	private double lado1 = 1;
	private double lado2 = 1;
	
	public Rectangulo() {
		
		super(4);
	}
	
	public Rectangulo(double lado1, double lado2) {
		
		super(4);
		
		if (lado1 > 0) {
			
			this.lado1 = lado1;
			
		}
		
		if (lado2 > 0) {
			
			this.lado2 = lado2;
			
		}
		
	}
	
	public String toString() {
		
		String informacion = super.toString();
		
		informacion += "| Tamaño del lado 1: " + this.lado1 + " | Tamaño del lado 2: " + this.lado2 + " | Área: " + this.area();
		
		return informacion;
		
	}
	
	public double area() {
		
		return this.lado1 * this.lado2;
		
	}

}
