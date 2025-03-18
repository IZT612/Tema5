package parte1.ejercicio4;

public class Lavadora extends Electrodomestico {

	private double carga = 5;

	public Lavadora(double precio, double peso) {

		super(precio, peso);

	}

	public Lavadora(double precio, char consumoEnergetico, String color, double peso, double carga) {

		super(precio, consumoEnergetico, color, peso);

		if (carga > 0) {

			this.carga = carga;

		}

	}
	
	public String toString() {
		
	String informacion = super.toString();
	informacion += "\nCarga: " + this.carga;
			
	return informacion;
	
	}

	public void precioFinal() {

		super.precioFinal();

		if (this.carga > 30) {

			this.setPrecioBase(this.getPrecioBase() + 50);

		}

	}



}
