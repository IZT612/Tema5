package parte3.ejercicio2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// PRUEBAS SOLO CON DVD
		Scanner sc = new Scanner(System.in);

		String director;
		int año;
		String tipo;

		DVD dvd = new DVD(1, "Predeterminado", "Predeterminado", 0, "pelicula");
		
		int opcion;

		do {

			System.out.println("Introduzca una opción: ");
			System.out.println("1. Obtener datos del DVD.");
			System.out.println("2. Cambiar director del DVD.");
			System.out.println("3. Cambiar tipo del DVD.");
			System.out.println("4. Cambiar año del DVD.");
			System.out.println("5. Obtener cuantos días a devolver.");
			System.out.println("0. Salir.");
			opcion = sc.nextInt();
			sc.nextLine();
			System.out.println();
			
			switch (opcion) {
			
			case 1 -> {
				
				System.out.println(dvd);
				
			}
			
			case 2 -> {
				
				System.out.println("Introduzca el nuevo director.");
				director = sc.nextLine();
				dvd.setDirector(director);
				
			}
			
			case 3 -> {
				
				System.out.println("Introduzca el nuevo tipo.");
				tipo = sc.nextLine();
				dvd.setTipo(tipo);
				
			}
			
			case 4 -> {
				
				System.out.println("Introduzca el nuevo año.");
				año = sc.nextInt();
				sc.nextLine();
				dvd.setAño(año);
				
			}
			
			case 5 -> {
				
				System.out.println(dvd.prestar());
				
			}
			
			
			}
			
			System.out.println();

		} while (opcion != 0);
		
		System.out.println("Saliendo del programa.");
		
		sc.close();

	}

}
