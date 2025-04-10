package parte5.ejercicio4;

import java.util.Scanner;

/**
 * Clase principal que contiene el método main para ejecutar el programa. Este
 * programa permite al usuario interactuar con una fecha, pudiendo ver la fecha,
 * comprobar si el año es bisiesto, verificar si la fecha es correcta y avanzar
 * al día siguiente.
 * 
 * @author Iván
 */
public class Main {

	/**
	 * Método principal que inicia la ejecución del programa. Solicita al usuario
	 * que introduzca una fecha y permite realizar operaciones como ver la fecha,
	 * comprobar si el año es bisiesto, verificar si la fecha es correcta y avanzar
	 * al día siguiente.
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Fecha fecha = null;

		int dia;
		int mes;
		int año;
		int opcion;

		boolean error;

		do {

			error = false;

			try {
				// Solicita al usuario que introduzca el día, mes y año
				System.out.println("Introduzca el día.");
				dia = sc.nextInt();
				sc.nextLine();
				System.out.println("Introduzca el mes.");
				mes = sc.nextInt();
				sc.nextLine();
				System.out.println("Introduzca el año.");
				año = sc.nextInt();
				sc.nextLine();

				fecha = new Fecha(dia, mes, año);
			} catch (DiaErroneo e) {

				System.out.println(e.getMessage());
				error = true;

			} catch (MesErroneo e) {

				System.out.println(e.getMessage());
				error = true;

			}

		} while (error);

		// Menú de opciones para el usuario
		do {
			System.out.println("Introduzca una opción.");
			System.out.println("1. Ver fecha.");
			System.out.println("2. Ver si el año es bisiesto.");
			System.out.println("3. Comprobar fecha.");
			System.out.println("4. Próximo día.");
			System.out.println("5. Salir del programa.");
			opcion = sc.nextInt();
			sc.nextLine();
			System.out.println();

			switch (opcion) {
			case 1 -> {
				// Muestra la fecha actual
				System.out.println(fecha);
			}

			case 2 -> {
				// Comprueba si el año es bisiesto
				if (fecha.esBisiesto()) {
					System.out.println("El año es bisiesto.");
				} else {
					System.out.println("El año no es bisiesto.");
				}
			}

			case 3 -> {
				// Comprueba si la fecha es correcta
				if (fecha.fechaCorrecta()) {
					System.out.println("La fecha es correcta.");
				} else {
					System.out.println("La fecha es incorrecta.");
				}
			}

			case 4 -> {
				// Avanza al día siguiente
				fecha.diaSiguiente();
			}
			}

			System.out.println();

			// Sale del programa si el usuario elige la opción 5
		} while (opcion != 5);

		sc.close();
	}
}