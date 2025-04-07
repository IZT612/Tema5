package parte2.ejercicio3;

public class AnimalDomestico implements Animal{
	
	private String nombre;
	private String raza;
	private double peso;
	private String color;
	
	public AnimalDomestico(String nombre, String raza, double peso, String color) {
		
		this.nombre = nombre;
		this.raza = raza;
		this.peso = peso;
		this.color = color;
		
	}
	
	public void comer() {
		
	}

	public void dormir() {
		
	}
	
	public String hacerRuido() {
		
		String ruido = "";
		
		return ruido;
		
	}
	
	public void vacunar() {
		
	}
	
	public boolean hacerCaso() {
		
		boolean caso = false;
		
		return caso;
		
	}

}
