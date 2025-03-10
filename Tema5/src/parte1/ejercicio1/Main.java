package parte1.ejercicio1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int opcion = 2;
		int hora;
		int minuto;
		int segundo;
		
		System.out.println("Introduzca la hora.");
		hora = sc.nextInt();
		sc.nextLine();
	
		System.out.println("Introduzca el minuto.");
		minuto = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Introduzca el segundo.");
		segundo = sc.nextInt();
		sc.nextLine();
		
		HoraExacta horita = new HoraExacta(hora, minuto, segundo);
		
		do {
			
			System.out.println("Introduzca su opción:");
			System.out.println("1. Ver la hora.");
			System.out.println("2. Poner la hora.");
			System.out.println("3. Poner el minuto.");
			System.out.println("4. Poner el segundo.");
			System.out.println("5. Incrementar un minuto.");
			System.out.println("6. Incrementar un segundo.");
			
			switch (opcion) {
			
				case 1 -> {
					
					System.out.println(horita.toString());
					
				}
				
				case 2 -> {
					
					System.out.println("Introduzca la hora.");
					hora = sc.nextInt();
					sc.nextLine();
					
					if (horita.setHora(hora)) {
						
						System.out.println("Hora cambiada con éxito.");
						
					} else {
						
						System.out.println("Ha ocurrido algún error.");
						
					}
					
				}
			
			}
			
		} while (opcion != 0);
		
	}

}
