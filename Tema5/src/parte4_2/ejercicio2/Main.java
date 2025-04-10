package parte4_2.ejercicio2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		ArrayList<Socio> socios = new ArrayList<Socio>();

		int id;
		String nombre;
		int edad;

		int opcion = 0;
		
		do {
			
			System.out.println("Introduzca una opción.");
			System.out.println("1. Crear un socio.");
			System.out.println("2. Mostrar socios.");
			System.out.println("3. Ordenar por los nombres alfabéticamente.");
			System.out.println("4. Ordenar por la edad de forma descendiente.");
			System.out.println("0. Salir del programa.");
			opcion = sc.nextInt();
			sc.nextLine();
			System.out.println();
			
			switch(opcion) {
			
			case 1 -> {
				
				System.out.println("Introduzca una id, nombre y edad.");
				id = sc.nextInt();
				sc.nextLine();
				nombre = sc.nextLine();
				edad = sc.nextInt();
				sc.nextLine();
				socios.add(new Socio(id, nombre, edad));
				
			}
			
			case 2 -> {
				
				for (Socio socio : socios) {
					
					System.out.println("ID: " + socio.getId() + " | Nombre: " + socio.getNombre() + " | Edad: " + socio.getEdad());
					
				}
				
			}
			
			case 3 -> {
				
				socios.sort((socio1, socio2) -> {
					
					return socio1.getNombre().compareTo(socio2.getNombre());
					
				});
				
			}
			
			case 4 -> {
				
				socios.sort((socio1, socio2) -> {
					
					return socio2.getEdad() - socio1.getEdad();
					
				});
				
			}
			
			}
			
			System.out.println();
			
		} while (opcion != 0);
		
		System.out.println("Saliendo del programa.");

		sc.close();

	}

}
