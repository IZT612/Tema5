package parte5.ejercicio2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		CuentaCorriente cuenta1 = null;

		// Creamos el scanner
		Scanner sc = new Scanner(System.in);

		// Variable String para guardar el dni de la persona
		String DNI;

		// Variable String para guardar el nombre de la persona
		String nombre;

		// Variable double para guardar el saldo de la persona
		double saldo;

		// Variable String para guardar la nacionalidad de la persona
		String nacionalidad;

		// Variable double para guardar el dinero a ingresar o sacar
		double cantidad;

		boolean error;
		

		do {
			
			error = false;
			
			System.out.println("Introduzca el DNI de la persona dueña de la cuenta.");
			DNI = sc.nextLine();
			System.out.println("Introduzca el nombre de la persona dueña de la cuenta.");
			nombre = sc.nextLine();
			System.out.println("Introduzca el saldo de la persona dueña de la cuenta.");
			saldo = sc.nextDouble();
			sc.nextLine();
			System.out.println("Introduzca la nacionalidad de la persona dueña de la cuenta.");
			nacionalidad = sc.nextLine().toUpperCase();

			try {

				cuenta1 = new CuentaCorriente(DNI, saldo, nombre);

			} catch (BlankDniException e) {

				System.out.println(e);
				error = true;

			} catch (BlankNameException e) {

				System.out.println(e);
				error = true;

			} catch (NegativeBalanceException e) {

				System.out.println(e);
				error = true;
			}
		} while (error);

		// Mostramos todos los datos llamando al metodo "toString" del objeto
		System.out.println("\nVeamos los datos:\n");
		System.out.println(cuenta1.toString() + "\n");

		// Pedimos un nuevo saldo y lo guardamos en "saldo"
		System.out.println("Probemos a cambiar el saldo por ejemplo.");
		saldo = sc.nextDouble();
		sc.nextLine();

		// Cambiamos el saldo de la cuenta mediante el metodo "setSaldo"
		cuenta1.setSaldo(saldo);

		// Mostramos el nuevo saldo mediante el metodo "getSaldo"
		System.out.println("\nVeamos el nuevo saldo:\n");
		System.out.println(cuenta1.getSaldo() + "€\n");

		// Pedimos datos para una nueva cuenta, repetimos lo anterior
		System.out.println("Probemos a compararla otra cuenta, pero para eso necesitamos crear otra: \n");
		System.out.println("Introduzca el DNI de la persona dueña de la cuenta.");
		DNI = sc.nextLine();
		System.out.println("Introduzca el nombre de la persona dueña de la cuenta.");
		nombre = sc.nextLine();
		System.out.println("Introduzca el saldo de la persona dueña de la cuenta.");
		saldo = sc.nextDouble();
		sc.nextLine();
		System.out.println("Introduzca la nacionalidad de la persona dueña de la cuenta.");
		nacionalidad = sc.nextLine().toUpperCase();

		// Creamos el nuevo objeto con los datos recibidos
		CuentaCorriente cuenta2 = new CuentaCorriente(DNI, nombre, saldo, nacionalidad);
		System.out.println();

		// Comprobamos si las cuentas son iguales con el metodo del objeto "equals" e
		// informamos al usuario segun el caso
		if (cuenta1.equals(cuenta2)) {

			// Si es true, son iguales
			System.out.println("¡Las cuentas tienen el mismo nombre y DNI!");

		} else {

			// Si no, son diferentes
			System.out.println("Las cuentas son diferentes");

		}

		// Pedimos una cantidad a ingresar en la cuenta, guardandola en "cantidad"
		System.out.println("Probemos a ingresar dinero a la primera cuenta. Introduzca cuanto quiere ingresar:");
		cantidad = sc.nextDouble();
		sc.nextLine();

		// Según lo que obtengamos con la funcion "ingresarDinero" mostramos un mensaje
		// u otro
		if (cuenta1.ingresarDinero(cantidad)) {

			// Mostramos que se ha ingresado el dinero
			System.out.println("\nSe han ingresado " + cantidad + "€ a la cuenta.");

		} else {

			// Mostramos que algo ha ido mal
			System.out.println(
					"\nAlgo ha ido mal, es posible que haya introducido una cantidad negativa de dinero. No se han hecho cambios en el saldo.");

		}

		// Mostramos el nuevo saldo mediante el metodo "getSaldo"
		System.out.println("\nSaldo actual:\n");
		System.out.println(cuenta1.getSaldo() + "€\n");

		// Pedimos una cantidad de dinero a sacar guardandola en "cantidad"
		System.out.println("Ahora probemos a sacar. Introduzca cuanto quiere sacar:");
		cantidad = sc.nextDouble();
		sc.nextLine();

		// Según lo obtenido llamando al metodo del objeto "sacarDinero" mostramos un
		// mensaje u otro
		if (cuenta1.sacarDinero(cantidad)) {

			System.out.println("\nSe han sacado " + cantidad + "€ de la cuenta.");

		} else {

			System.out.println(
					"\nAlgo ha ido mal, es posible que haya introducido una cantidad mayor a la que se encuentra en la cuenta. No se han hecho cambios en el saldo.");

		}

		// Mostramos el saldo restante
		System.out.println("\nSaldo restante: " + cuenta1.getSaldo() + "€");

		// Cerramos el scanner
		sc.close();
	}

}
