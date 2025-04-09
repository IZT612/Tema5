package parte4_1.ejercicio3;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		ArrayList<Futbolista> futbolistas = new ArrayList<Futbolista>();

		int numeroCami;
		String nombre;
		int edad;
		int numeroGoles;

		int opcion = 0;

		do {

			System.out.println("Introduzca una opcion:");
			System.out.println("1. Crear futbolista.");
			System.out.println("2. Mostrar futbolistas.");
			System.out.println("3. Ordenar por edad de forma ascendente.");
			System.out.println("4. Ordenar por número de goles de forma descendente.");
			System.out.println("0. Salir del programa.");
			opcion = sc.nextInt();
			sc.nextLine();
			System.out.println();

			switch (opcion) {

			case 1 -> {

				System.out
						.println("Introduzca los siguientes datos: Número de camiseta, Nombre, Edad, Número de goles.");
				numeroCami = sc.nextInt();
				sc.nextLine();
				nombre = sc.nextLine();
				edad = sc.nextInt();
				sc.nextLine();
				numeroGoles = sc.nextInt();
				sc.nextLine();

				futbolistas.add(new Futbolista(numeroCami, nombre, edad, numeroGoles));

			}

			case 2 -> {

				for (Futbolista futbolista : futbolistas) {

					System.out.println("Número de camiseta: " + futbolista.getNumeroCami() + " | Nombre: "
							+ futbolista.getNombre() + " | Edad: " + futbolista.getEdad() + " | Número de goles: "
							+ futbolista.getNumeroGoles());

				}

			}
			
			case 3 -> {
				
				futbolistas.sort(new OrdenEdadAscendente());
				
			}
			
			case 4 -> {
				
				futbolistas.sort(new OrdenGolesDescendente());
				
			}

			}
			
			System.out.println();

		} while (opcion != 0);
		
		System.out.println("Saliendo del programa.");
		
		sc.close();

	}

}
