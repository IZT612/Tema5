package parte4_1.ejercicio5;

import java.util.Comparator;

public class OrdenarTitularDniAsc implements Comparator<Titular>{
	
	public int compare(Titular t1, Titular t2) {
		
		return t1.getDni().compareTo(t2.getDni());
		
	}

}
