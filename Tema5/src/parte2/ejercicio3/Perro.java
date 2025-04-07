package parte2.ejercicio3;

import java.util.Random;

public class Perro extends AnimalDomestico{
	
	public Perro(String nombre, String raza, double peso, String color) {
		
		super(nombre, raza, peso, color);
		
	}
	
	Random rand = new Random();
	
	public String hacerRuido() {
		
		String ruido = super.hacerRuido();
		
		ruido += "¡Guau!";
		
		return ruido;
		
	}
	
	public boolean hacerCaso() {
		
		boolean caso = super.hacerCaso();
		
		if (rand.nextInt(1, 101) <= 90) {
			
			caso = true;
			
		}
		
		return caso;
	}
	
	public void sacarPaseo() {
		
	}

}
