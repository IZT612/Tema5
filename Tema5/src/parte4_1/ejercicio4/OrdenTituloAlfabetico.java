package parte4_1.ejercicio4;

import java.util.Comparator;

public class OrdenTituloAlfabetico implements Comparator<Ficha>{
	
	public int compare(Ficha f1, Ficha f2) {
		
		return f1.getTitulo().compareTo(f2.getTitulo());
		
	}

}
