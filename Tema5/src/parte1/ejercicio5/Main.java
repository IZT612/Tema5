package parte1.ejercicio5;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Set<Poligono> poligonos = new HashSet<Poligono>();
	
		int opcion;
		double lado1;
		double lado2;
		double lado3;
		
		do {
			
			System.out.println("Introduzca una opción:");
			System.out.println("1. Introducir un triángulo.");
			System.out.println("2. Introducir un rectángulo.");
			System.out.println("3. Mostrar polígonos.");
			opcion = sc.nextInt();
			sc.nextLine();
			System.out.println();
			
			switch (opcion) {
			
			case 1 -> {
				
				System.out.println("Introduzca el tamaño del lado 1.");
				lado1 = sc.nextInt();
				sc.nextLine();
				System.out.println("Introduzca el tamaño del lado 2.");
				lado2 = sc.nextInt();
				sc.nextLine();
				System.out.println("Introduzca el tamaño del lado 3.");
				lado3 = sc.nextInt();
				sc.nextLine();
				poligonos.add(new Triangulo(lado1, lado2, lado3));
				
			}
			
			case 2 -> {
				
				System.out.println("Introduzca el tamaño del lado 1.");
				lado1 = sc.nextInt();
				sc.nextLine();
				System.out.println("Introduzca el tamaño del lado 2.");
				lado2 = sc.nextInt();
				sc.nextLine();
				poligonos.add(new Rectangulo(lado1, lado2));
				
				
			}
			
			case 3 -> {
				
				for (Poligono poligono : poligonos) {
					
					System.out.println(poligono);
					
				}
				
			}
			
			}
			
			System.out.println();
			
		} while(opcion != 4);

		sc.close();
		
	}

}
