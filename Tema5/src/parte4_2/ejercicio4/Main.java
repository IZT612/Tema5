package parte4_2.ejercicio4;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Ficha> fichas = new ArrayList<Ficha>();
		
		int id;
		String titulo;
		
		int opcion = 0;

		do {
			
			System.out.println("Introduzca una opción.");
			System.out.println("1. Añadir ficha.");
			System.out.println("2. Mostrar fichas.");
			System.out.println("3. Ordenar por identificador de forma ascendente.");
			System.out.println("4. Ordenar por título alfabéticamente.");
			System.out.println("0. Salir del programa.");
			opcion = sc.nextInt();
			sc.nextLine();
			
			switch (opcion) {
			
			case 1 -> {
				
				System.out.println("Introduzca los siguientes datos: ID, Título.");
				id = sc.nextInt();
				sc.nextLine();
				titulo = sc.nextLine();
				
				fichas.add(new Ficha(id, titulo));
				
			}
			
			case 2 -> {
				
				for(Ficha ficha : fichas) {
					
					System.out.println("ID: " + ficha.getId() + " | Título: " + ficha.getTitulo()); 
					
				}
				
			}
			
			case 3 -> {
				
				fichas.sort((f1, f2) -> {
					
					return f1.getId() - f2.getId();
					
				});
				
			}
			
			case 4 -> {
				
				fichas.sort((f1, f2) -> {
					
					return f1.getTitulo().compareTo(f2.getTitulo());
					
				});
				
			}
			
			
			}
			
			System.out.println();
			
			
		} while (opcion != 0);
		
		System.out.println("Saliendo del programa.");
		
		
		sc.close();
	}

}
