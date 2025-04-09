package parte3.ejercicio4;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// Da pereza hacer un crud
		Set<Object> contactos = new HashSet<Object>();
		
		String nombre;
		int numero;
		String paginaWeb;
		String cumpleaños;
		
		int opcion = 0;
		
		do {
			
			System.out.println("Introduzca una opción: ");
			System.out.println("1. Añadir una persona como contacto.");
			System.out.println("2. Añadir una empresa como contacto.");
			System.out.println("3. Mostrar lista.");
			System.out.println("0. Salir del programa");
			opcion = sc.nextInt();
			sc.nextLine();
			System.out.println();
			
			switch(opcion) {
			
			case 1 -> {
				
				System.out.println("Introduzca el nombre, numero, y cumpleaños");
				nombre = sc.nextLine();
				numero = sc.nextInt();
				sc.nextLine();
				cumpleaños = sc.nextLine();
				contactos.add(new Persona(nombre, numero, cumpleaños));
				
			}
			
			case 2 -> {
				
				System.out.println("Introduzca el nombre, numero, y página web");
				nombre = sc.nextLine();
				numero = sc.nextInt();
				sc.nextLine();
				paginaWeb = sc.nextLine();
				contactos.add(new Empresa(nombre, numero, paginaWeb));
				
			}
			
			case 3 -> {
				
				for (Object contacto : contactos) {
					
					System.out.println(contacto);
					
				}
				
			}
			
			}
			
			System.out.println();
			
		} while (opcion != 0);
		
		System.out.println("Saliendo del programa.");
		
		sc.close();

	}

}
