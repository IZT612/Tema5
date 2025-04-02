package parte3.ejercicio1;

public class Vehiculo {

	private String marca;
	private String modelo;
	private String color;
	private String matricula;
	private boolean encendido = false;
	private int marcha = 1;
	private int velocidad = 0;

	public Vehiculo(String marca, String modelo, String color, String matricula) {

		if (!marca.isBlank()) {

			this.marca = marca;

		}

		if (!modelo.isBlank()) {

			this.modelo = modelo;

		}

		if (!color.isBlank()) {

			this.color = color;

		}

		if (!matricula.isBlank()) {

			this.matricula = matricula;

		}

	}

	public String getMarca() {

		return this.marca;

	}

	public String getModelo() {

		return this.modelo;

	}

	public String getColor() {

		return this.color;

	}

	public String getMatricula() {

		return this.matricula;

	}

	public boolean getEncendido() {

		return this.encendido;

	}

	public int getMarcha() {

		return this.marcha;

	}

	public int getVelocidad() {

		return this.velocidad;

	}

	public boolean setColor(String color) {

		boolean conseguido = false;

		if (!color.isBlank()) {

			this.color = color;
			conseguido = true;

		}

		return conseguido;

	}
	
	public String toString() {
		
		String informacion;
		
		informacion = "Encendido: " + this.encendido + "\nMarcha: " + this.marcha + "\nVelocidad: " + this.velocidad;
		
		return informacion;
		
	}

	public void parar() {

		if (this.encendido) {
			this.velocidad = 0;
			this.encendido = false;
			this.marcha = 1;
		}

	}

	public void arrancar() {

		this.encendido = true;

	}

	public void subirMarcha() {

		if (this.encendido) {

			switch (this.velocidad) {
			
			case 30 -> {
				
				this.marcha = 2;
				
			}
			
			case 50 -> {
				
				this.marcha = 3;
				
			}
			
			case 70 -> {
				
				this.marcha = 4;
				
			}
			
			case 100 -> {
				
				this.marcha = 5;
				
			}
			
			}

		}

	}

	public void bajarMarcha() {
		
		if (this.encendido) {
			
			switch (this.velocidad) {
			
			case 30 -> {
				
				this.marcha = 1;

			}
			
			case 50 -> {
				
				this.marcha = 2;
				
			}
			
			case 70 -> {
				
				this.marcha = 3;
				
			}
			
			case 100 -> {
				
				this.marcha = 4;
				
			}
			
			
			}
		
		}

	}

	public boolean acelerar(int velocidad) {

		boolean conseguido = false;

		if (this.encendido && velocidad > this.velocidad) {

			for(int i = this.velocidad; i <= velocidad; i++) {
				
				this.velocidad = i;
				
				subirMarcha();
				
			}
			
		}
		
		if (this.velocidad == velocidad) {
			
			conseguido = true;
			
		}

		return conseguido;

	}

	public boolean frenar(int velocidad) {

		boolean conseguido = false;

		if (this.encendido && velocidad > 0 && velocidad < this.velocidad) {

			for (int i = this.velocidad; i >= velocidad; i--) {
				
				this.velocidad = i;
				
				bajarMarcha();
				
			}

		}

		return conseguido;

	}
}
