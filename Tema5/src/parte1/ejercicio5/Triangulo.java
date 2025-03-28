package parte1.ejercicio5;

public class Triangulo extends Poligono{
	
	private double lado1 = 1;
	private double lado2 = 1;
	private double lado3 = 1;
	
	public Triangulo() {
		
		super(3);
	}
	
	public Triangulo(double lado1, double lado2, double lado3) {
		
		super(3);
		
		if (lado1 > 0) {
			
			this.lado1 = lado1;
			
		}
		
		if (lado2 > 0) {
			
			this.lado2 = lado2;
			
		}
		
		if (lado3 > 0) {
			
			this.lado3 = lado3;
			
		}
		
	}
	
	public String toString() {
		
		String informacion = super.toString();
		
		informacion += "| Tamaño del lado 1: " + this.lado1 + " | Tamaño del lado 2: " + this.lado2 + " | Tamaño del lado 3: " + this.lado3 + " | Área: " + this.area();
		
		return informacion;
		
	}
	
	public double area() {
		
		double semiperimetro = (this.lado1 + this.lado2 + this.lado3) / 2;
		double area = Math.sqrt(semiperimetro * (semiperimetro - lado1) * (semiperimetro - lado2) * (semiperimetro - lado3));
		if (Double.isNaN(area)) {
			
			area = 0;
			
		}
		
		return area;
		
	}

}