package parte2.ejercicio2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Futbolista> futbolistas = new ArrayList<Futbolista>();
		
		
		int orden1;
		int orden2;
		int opcion;
		
		futbolistas.add(new Futbolista(13, "Daniel", 23, 92));
		futbolistas.add(new Futbolista(7, "Juan", 19, 31));
		futbolistas.add(new Futbolista(8, "Carlos", 25, 143));
		futbolistas.add(new Futbolista(13, "Daniel", 23, 92));
		futbolistas.add(new Futbolista(5, "Raúl", 22, 178));
		
		do {
			
			System.out.println("Introduzca una opción.");
			System.out.println("1. Mostrar futbolistas.");
			System.out.println("2. Comprarar 2 futbolistas con equals.");
			System.out.println("3. Comparar 2 futbolistas con CompareTo");
			System.out.println("0. Salir del programa.");
			opcion = sc.nextInt();
			sc.nextLine();
			System.out.println();
			
			switch (opcion) {
			
			case 1 -> {
					
				for(int i = 0; i < futbolistas.size(); i++) {
					
					System.out.print(i + 1 + ". ");
					System.out.println(futbolistas.get(i));
					
				}
				
			}
			
			case 2 -> {
				
				System.out.println("Introduzca el orden del primer futbolista a comparar.");
				orden1 = sc.nextInt();
				sc.nextLine();
				
				System.out.println("Introduzca el orden del segundo futbolista a comparar.");
				orden2 = sc.nextInt();
				sc.nextLine();
				
				System.out.println(futbolistas.get(orden1 - 1).equals(futbolistas.get(orden2 - 1)));
				
			}
			
			case 3 -> {
				
				System.out.println("Introduzca el orden del primer futbolista a comparar.");
				orden1 = sc.nextInt();
				sc.nextLine();
				
				System.out.println("Introduzca el orden del segundo futbolista a comparar.");
				orden2 = sc.nextInt();
				sc.nextLine();
				
				if (futbolistas.get(orden1 - 1).compareTo(futbolistas.get(orden2 - 1)) == 1) {
					
					System.out.println("true");
					
				} else {
					
					System.out.println("false");
					
				}
				
			}
			
			}
			
			System.out.println();
			
		} while (opcion != 0);
		
		System.out.println("Saliendo del programa.");

	}

}
