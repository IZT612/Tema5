package parte4_1.ejercicio2;

import java.util.Comparator;

public class OrdenAlfabetico implements Comparator<Socio> {
	
	public int compare(Socio socio1, Socio socio2) {
		
		return socio1.getNombre().compareTo(socio2.getNombre());
		
	}

}
