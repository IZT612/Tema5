package parte1.ejercicio4;

public class Television extends Electrodomestico{
	
	private double resolucion = 20;
	private boolean sintonizadorTDT = false;
	
	public Television(double precio, double peso) {
		
		super(precio, peso);
		
	}
	
	public Television(double precio, char consumoEnergetico, String color, double peso, double resolucion, boolean sintonizadorTDT) {
		
		super(precio, consumoEnergetico, color, peso);
		
		if (resolucion > 0) {
			
			this.resolucion = resolucion;
			
		}
		
		this.sintonizadorTDT = sintonizadorTDT;
		
	}
	
	public String toString() {
		
	String informacion = super.toString();
	informacion += "\nResolución en pulgadas: " + this.resolucion + "\nSintonizador TDT: " + this.sintonizadorTDT;
			
	return informacion;
	
	}
	
	public void precioFinal() {
		
		if (this.resolucion > 40) {
			
			this.setPrecioBase(this.getPrecioBase() + ((this.getPrecioBase() * 30) / 100));
			
		}
		
		if (this.sintonizadorTDT) {
			
			this.setPrecioBase(this.getPrecioBase() + 50);
			
		}

	}

}
