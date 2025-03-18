package parte1.ejercicio4;

public class Electrodomestico {

	enum Color {
		BLANCO, NEGRO, ROJO, AZUL, GRIS
	}

	private double precioBase = 100;
	private char consumoEnergetico = 'F';
	private Color color = Color.valueOf("BLANCO");
	private double peso = 5;

	public Electrodomestico(double precio, double peso) {

		if (precio > 0) {

			this.precioBase = precio;

		}

		if (peso > 0) {

			this.peso = peso;

		}
	}

	public Electrodomestico(double precio, char consumoEnergetico, String color, double peso) {

		if (precio > 0) {

			this.precioBase = precio;

		}

		if (peso > 0) {

			this.peso = peso;

		}

		comprobarConsumoEnergetico(consumoEnergetico);

		comprobarColor(color);

	}
	
	public double getPrecioBase() {
		
		return this.precioBase;
		
	}
	
	public boolean setPrecioBase(double precioBase) {
		
		boolean conseguido = false;
		
		if (precioBase > 0) {
			
			this.precioBase = precioBase;
			
		}
		
		return conseguido;
		
	}
	
	public String toString() {
		
		String informacion = "";
		
		/* String tipo = this.getClass().getName(); 
		 * tipo.split("parte1.ejercicio4.")
		 * */
		
		informacion +=  "Precio base: " + this.precioBase + "\nConsumo energético: " + this.consumoEnergetico + "\nColor: " + this.color + "\nPeso: " + this.peso;
		
		return informacion;
		
	}

	void comprobarConsumoEnergetico(char consumoEnergetico) {

		if (consumoEnergetico >= 'A' && consumoEnergetico <= 'F') {

			this.consumoEnergetico = consumoEnergetico;

		} else {

			this.consumoEnergetico = 'F';

		}

	}
	
	void comprobarColor(String color) {
		
		if (color.equals("NEGRO") || color.equals("ROJO") || color.equals("AZUL") || color.equals("GRIS")) {
			
			this.color = Color.valueOf(color);
			
		} else {
			
			this.color = Color.valueOf("BLANCO");
			
		}
		
	}
	
	void precioFinal() {
		
		switch (this.consumoEnergetico) {
		
		case 'A' -> {
			
			this.precioBase += 100;
			
		}
		
		case 'B' -> {
			
			this.precioBase += 80;
			
		}
		
		case 'C' -> {
			
			this.precioBase += 60;
			
		}
		
		case 'D' -> {
			
			this.precioBase += 50;
			
		}
		
		case 'E' -> {
			
			this.precioBase += 30;
			
		}
		
		case 'F' -> {
			
			this.precioBase += 10;
			
		}
		
		}
		
		if (this.peso > 0 && this.peso <= 19) {
			
			this.precioBase += 10;
			
		} else if (this.peso >= 20 && this.peso <= 49) {
			
			this.precioBase += 50;
			
		} else if (this.peso >= 50 && this.peso <= 79) {
			
			this.precioBase += 80;
			
		} else {
			
			this.precioBase += 100;
			
		}
		
	}
	
	

}
