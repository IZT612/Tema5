package parte4_1.ejercicio4;

import java.util.Comparator;

public class OrdenIdentificadorAscendente implements Comparator<Ficha>{
	
	public int compare(Ficha f1, Ficha f2) {
		
		return f1.getId() - f2.getId();
		
	}

}
