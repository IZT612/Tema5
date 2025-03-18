package parte1.ejercicio4;

import java.util.HashSet;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		
		Set<Electrodomestico> lista = new HashSet<Electrodomestico>();
		
		double precioElectrodomesticos = 0;
		double precioLavadoras = 0;
		double precioTelevisiones = 0;
		
		Electrodomestico electrodomestico1 = new Electrodomestico(50, 10);
		lista.add(electrodomestico1);
		
		Electrodomestico electrodomestico2= new Electrodomestico(100, 'F', "NEGRO", 10);
		lista.add(electrodomestico2);
		
		Lavadora lavadora1 = new Lavadora(30, 60);
		lista.add(lavadora1);
		
		Lavadora lavadora2 = new Lavadora(90, 'C', "ROJO", 70, 50);
		lista.add(lavadora2);
		
		Television television1 = new Television(100, 30);
		lista.add(television1);
		
		Television television2 = new Television(300, 'A', "GRIS", 40, 40, true);
		lista.add(television2);
		
		for (Electrodomestico objeto: lista) {
			
			System.out.println(objeto);
			objeto.precioFinal();
			System.out.println("Precio final: " + objeto.getPrecioBase());
			System.out.println();
			
		}
		
		for (Electrodomestico objeto: lista) {
			
			if (objeto instanceof Lavadora) {
				
				objeto = (Lavadora) objeto;
				
				precioLavadoras += objeto.getPrecioBase();		
				
			} else if (objeto instanceof Television) {
				
				objeto = (Television) objeto;
				
				precioTelevisiones += objeto.getPrecioBase();				
				
			} else {
				
				precioElectrodomesticos += objeto.getPrecioBase();
				
			}
			
		}
		
		System.out.println("Precio de los electrodomésticos: " + precioElectrodomesticos + "\nPrecio de las lavadoras: " + precioLavadoras + "\nPrecio de las televisiones: " + precioTelevisiones + "\nPrecio total: " + (precioElectrodomesticos + precioLavadoras + precioTelevisiones));
		

	}

}
