package parte4_2.ejercicio1;

import java.util.Arrays;
import java.util.Random;

public class Main{

	public static void main(String[] args) {
		
		Random rand = new Random();
		
		Integer [] numeros = new Integer[20];
		
		for(int i = 0; i < numeros.length; i++) {
			
			numeros[i] = rand.nextInt(1, 101);
			
		}
		
		System.out.println("Lista de números sin ordenar:");
		System.out.println(Arrays.toString(numeros));
		
		System.out.println("\nLista de números ordenados:");
		Arrays.sort(numeros);
		System.out.println(Arrays.toString(numeros));
		
		System.out.println("\nLista de números ordenados de forma inversa.");
		Arrays.sort(numeros, (n1, n2) -> {
			
			return n2 - n1;
			
		});
		System.out.println(Arrays.toString(numeros));
		
	}

}


