package parte5.ejercicio3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Articulo articulo = null;
		
		// Creamos el scanner
		Scanner sc = new Scanner(System.in);
		
		// Variables donde guardaremos el nombre y precio del articulo
		String nombre;
		double precio;	
		int descuento;
		int cantidad;
		
		boolean error;
		
		do {
			
			error = false;
		
		try {
		
		// Pedimos los datos y los guardamos
		System.out.println("Introduzca un nombre para el artículo");
		nombre = sc.nextLine();
		
		System.out.println("Introduzca un precio para el artículo");
		precio = sc.nextDouble();
		sc.nextLine();
		
		// Creamos el objeto articulo dado el nombre y precio introducidos
		articulo = new Articulo(nombre, precio);
		
		} catch(NombreBlankException e) {
			
			System.out.println(e.getMessage());
			error = true;
			
		} catch (PrecioNegativo e) {
			
			System.out.println(e.getMessage());
			error = true;
			
		}
		
		} while (error);
		
		// Mostramos todos sus atributos
		System.out.println(articulo.toString());
		// El PVP lo obtenemos llamando a la función "precioPublico" de la clase "Articulo" dando nuestro articulo
		System.out.println("PVP: " + articulo.getPVP());
		System.out.println();
		
		System.out.println("Probemos ahora a cambiar el nombre del artículo:");
		nombre = sc.nextLine();
		
		articulo.setNombre(nombre);
		System.out.println("Nombre del artículo: " + articulo.getNombre());
		System.out.println();
		System.out.println("Introduzca el porcentaje de un descuento para obtener el nuevo precio del articulo");
		descuento = sc.nextInt();
		sc.nextLine();
		System.out.println(articulo.getPVPDescuento(descuento));
		
		System.out.println("¿Cuánta cantidad del artículo intenta vender?");
		cantidad =  sc.nextInt();
		sc.nextLine();
		System.out.println(articulo.vender(cantidad));
		System.out.println();
		System.out.println("¿Y cuánto intenta almacenar?");
		cantidad =  sc.nextInt();
		sc.nextLine();
		articulo.almacenar(cantidad);
		System.out.println();
		
		
		sc.close();
	}

}
