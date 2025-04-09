package parte4_1.ejercicio2;

import java.util.Comparator;

public class OrdenEdadInverso implements Comparator<Socio>{
	
	public int compare(Socio socio1, Socio socio2) {
		
		return socio2.getEdad() - socio1.getEdad();
		
	}

}
