package parte1.ejercicio3;

public class Perecedero extends Producto{
	
	private int diasParaCaducar;
	
	public Perecedero(String nombre, double precio, int diasACaducar) {
		
		super(nombre, precio);
		
		if (diasACaducar > 0) {
			
			this.diasParaCaducar = diasACaducar;
			
		}
		
	}
	
	public double getDiasACaducar() {
		
		return this.diasParaCaducar;
		
	}
	
	public void setDiasACaducar(int diasACaducar) {
		
		if (diasACaducar > 0) {
			
			this.diasParaCaducar = diasACaducar;
			
		}
		
	}
	
	public String toString() {
		
		String informacion = super.toString();
		
		informacion += "Días para caducar: " + this.diasParaCaducar + ". ";
		
		return informacion;
	}
	
	public double calcular(int cantidad) {
		
		double precioFinal = super.calcular(cantidad);
		
		switch (this.diasParaCaducar) {
		
			case 1 -> {
				
				precioFinal /= 4;
				
			}
			
			case 2 -> {
				
				precioFinal /= 3;
				
			}
			
			case 3 -> {
				
				precioFinal /= 2;
				
			}
		
		}
		
		return precioFinal;
		
	}

}
