package parte2.ejercicio3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Gato gato = new Gato("Dani", "Común europeo", 10, "Gris");

		Perro perro = new Perro("Sofi", "Mastín", 80, "Amarillo");
		
		int opcion;
		
		do {
			
			System.out.println("Escoge una opción:");
			System.out.println("1. El perro hace ruido.");
			System.out.println("2. Hacer que el perro haga caso.");
			System.out.println("3. El gato hace ruido.");
			System.out.println("4. Hacer que el gato haga caso.");
			opcion = sc.nextInt();
			sc.nextLine();
			System.out.println();
			
			switch(opcion) {
			
			case 1 -> {
				
				System.out.println(perro.hacerRuido());
				
			}
			
			case 2 -> {
				
				System.out.println(perro.hacerCaso());
		
			}
			
			case 3 -> {
				
				System.out.println(gato.hacerRuido());
				
			}
			
			case 4 -> {
				
				System.out.println(gato.hacerCaso());
				
			}
			
			}
			
			System.out.println();
			
		} while (opcion != 0);
		
		System.out.println("Saliendo del programa.");
	
		sc.close();
		
	}

}
