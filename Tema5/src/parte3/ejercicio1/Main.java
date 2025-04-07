package parte3.ejercicio1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Vehiculo vehiculo = new Vehiculo("Alguna", "Cualquiera", "Negro", "Skibidi");
		
		int opcion;
		int velocidad;
		
		do {
		
		System.out.println("Introduzca una opción:");
		System.out.println("1. Arrancar vehículo.");
		System.out.println("2. Parar vehículo.");
		System.out.println("3. Acelerar.");
		System.out.println("4. Frenar.");
		System.out.println("5. Ver los datos del vehículo.");
		System.out.println("0. Salir del programa.");
		opcion = sc.nextInt();
		sc.nextLine();
		System.out.println();
		
		switch(opcion) {
		
		case 1 -> {
			
			vehiculo.arrancar();
			
		}
		
		case 2 -> {
			
			vehiculo.parar();
			
		}
		
		case 3 -> {	
			
			System.out.println("Introduzca la velocidad a la que quiere acelerar.");
			velocidad = sc.nextInt();
			sc.nextLine();
			vehiculo.acelerar(velocidad);
			
		}
		
		case 4 -> {
			
			System.out.println("Introduzca la velocidad a la que quiere frenar.");
			velocidad = sc.nextInt();
			sc.nextLine();
			vehiculo.frenar(velocidad);
			
		}
		
		case 5 -> {
			
			System.out.println(vehiculo);
			
		}
		
		}
		
		System.out.println();

		} while (opcion != 0);
		
		System.out.println("Saliendo del programa.");
		
		sc.close();
		
	}

}
