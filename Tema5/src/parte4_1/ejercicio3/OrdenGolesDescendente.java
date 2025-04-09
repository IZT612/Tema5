package parte4_1.ejercicio3;

import java.util.Comparator;

public class OrdenGolesDescendente implements Comparator<Futbolista>{
	
	public int compare(Futbolista f1, Futbolista f2) {
		
		return f2.getNumeroGoles() - f1.getNumeroGoles();
		
	}

}
