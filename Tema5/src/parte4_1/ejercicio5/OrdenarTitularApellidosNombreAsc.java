package parte4_1.ejercicio5;

import java.util.Comparator;

public class OrdenarTitularApellidosNombreAsc implements Comparator<Titular>{
	
	public int compare(Titular t1, Titular t2) {
		
		int valorADevolver;
		
		if(t1.getApellidos().equals(t2.getApellidos())) {
			
			valorADevolver = t1.getNombre().compareTo(t2.getNombre());
			
		} else {
			
			valorADevolver = t1.getApellidos().compareTo(t2.getApellidos());
			
		}
		
		return valorADevolver;
		
	}

}
