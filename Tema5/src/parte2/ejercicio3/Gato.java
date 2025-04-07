package parte2.ejercicio3;

import java.util.Random;

public class Gato extends AnimalDomestico{
	
	public Gato(String nombre, String raza, double peso, String color) {
		
		super(nombre, raza, peso, color);
		
	}
	
	Random rand = new Random();
	
	public String hacerRuido() {
		
		String ruido = super.hacerRuido();
		
		ruido += "¡Miau!";
		
		return ruido;
		
	}
	
	public boolean hacerCaso() {
		
		boolean caso = super.hacerCaso();
		
		if (rand.nextInt(1, 101) <= 5) {
			
			caso = true;
			
		}
		
		return caso;
	}
	
	public void toserBolaPelo() {
		
	}

}


