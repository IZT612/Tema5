package parte4_1.ejercicio3;

import java.util.Comparator;

public class OrdenEdadAscendente implements Comparator<Futbolista>{
	
	public int compare(Futbolista f1, Futbolista f2) {
		
		return f1.getEdad() - f2.getEdad();
		
	}

}
