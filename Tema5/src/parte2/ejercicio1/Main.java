package parte2.ejercicio1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Socio> socios = new ArrayList<Socio>();
		
		int id;
		String nombre;
		int edad;
		int opcion;
		
		do {
			
			System.out.println("Introduzca una opción:");
			System.out.println("1. Añadir un socio.");
			System.out.println("2. Ordenar a los socios.");
			System.out.println("3. Mostrar los socios.");
			opcion = sc.nextInt();
			sc.nextLine();
			System.out.println();
			
			switch(opcion) {
			
			case 1 -> {
				
				System.out.println("Introduzca la ID.");
				id = sc.nextInt();
				sc.nextLine();
				System.out.println("Introduzca el nombre.");
				nombre = sc.nextLine();
				System.out.println("Introduzca la edad.");
				edad = sc.nextInt();
				sc.nextLine();
				socios.add(new Socio(id, nombre, edad));
				
			}
			
			case 2 -> {
				
				boolean modificado = true;
				
				for(int i = 0; i < socios.size() && modificado; i++) {
					
					modificado = false;
					
					if ((i < socios.size() - 1) && (socios.get(i).compareTo(socios.get(i + 1))) > 0) {
						
						modificado = true;
						
						Socio socioAux = socios.get(i + 1);
						socios.set(i + 1, socios.get(i));
						socios.set(i, socioAux);
						
					}
					
				}
				
			}
			
			case 3 -> {
				
				for(Socio socio : socios) {
					
					System.out.println(socio);
					
				}
				
			}
			
			
			}
			
			System.out.println();
			
		} while(opcion != 4);
		
		sc.close();
		
	}

}
