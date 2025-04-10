package parte5.ejercicio1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Hora reloj = new Hora(0, 0, 0);
		
		int hora;
		int minuto;
		int segundo;
		
		int opcion = 0;
		
		do {
			
			System.out.println("Introduzca una opción.");
			System.out.println("1. Mirar el reloj.");
			System.out.println("2. Cambiar la hora.");
			System.out.println("3. Cambiar el minuto.");
			System.out.println("4. Cambiar el segundo.");
			System.out.println("0. Salir del programa.");
			opcion = sc.nextInt();
			sc.nextLine();
			System.out.println();
			
			switch (opcion) {
			
			case 1 -> {
				
				System.out.println(reloj);
				
			}
			
			case 2 -> {
				
				System.out.println("Introduzca la nueva hora.");
				hora = sc.nextInt();
				sc.nextLine();
				
				try {
					
					reloj.setHora(hora);
					
				} catch (NegativeHourException e) {
					
					System.out.println(e);
			
				}
				
			}
			
			case 3 -> {
				
				System.out.println("Introduzca el nuevo minuto.");
				minuto = sc.nextInt();
				sc.nextLine();
				
				try {
					
					reloj.setMinuto(minuto);
					
				} catch (NegativeMinuteException e) {
					
					System.out.println(e);
					
				}
				
			}
			
			case 4 -> {
				
				System.out.println("Introduzca el nuevo segundo.");
				segundo = sc.nextInt();
				sc.nextLine();
				
				try {
					
					reloj.setSegundo(segundo);
					
				} catch (NegativeSecondException e) {
					
					System.out.println(e);
					
				}
				
			}
			
			}
			
			System.out.println();
			
		} while (opcion != 0);
		
		System.out.println("Saliendo del programa.");
		
		sc.close();
		
	}

}
