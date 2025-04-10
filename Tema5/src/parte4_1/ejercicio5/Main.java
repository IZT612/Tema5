package parte4_1.ejercicio5;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		// Solo tendremos una cuenta de cada tipo en este ejemplo, ya que es solo para comprobar que funciona
		CuentaAhorro cuentaDeAhorro = null;
		CuentaCorriente cuentaCorriente = null;
		CuentaCorriente cuentaCorriente2 = new CuentaCorriente(2, 0, null, 0, 0);
		Transaccion transaccion = new Transaccion(0, 0, 0, "", 1);
		Titular titular = null;

		String dni;
		String nombre;
		String apellidos;
		int telefono;
		int num;
		double saldo;
		double importe;
		double interes;
		double mantenimiento;
		int numTransacciones;
		double porcentajeCobrado;
		
		int opcion;
		int opcion2;
		
		do {
			System.out.println("Introduzca una opción.");
			System.out.println("1. Crear un titular.");
			System.out.println("2. Crear una cuenta de ahorro.");
			System.out.println("3. Crear una cuenta corriente.");
			System.out.println("4. Acciones de cuenta de ahorro.");
			System.out.println("5. Acciones de cuenta corriente.");
			opcion = sc.nextInt();
			sc.nextLine();
			System.out.println();
			
			switch (opcion) {
			
			case 1 -> {
				
				System.out.println("Introduzca los siguientes datos: Dni, Nombre, Apellidos, y Teléfono");
				dni = sc.nextLine();
				nombre = sc.nextLine();
				apellidos = sc.nextLine();
				telefono = sc.nextInt();
				sc.nextLine();
				
				titular = new Titular(dni, nombre, apellidos, telefono);
				
			}
			
			case 2 -> {
				
				if(titular != null) {
					
					System.out.println("Introduzca los siguientes datos: Número de cuenta, saldo, interés y mantenimiento");
					num = sc.nextInt();
					sc.nextLine();
					saldo = sc.nextDouble();
					sc.nextLine();
					interes = sc.nextDouble();
					sc.nextLine();
					mantenimiento = sc.nextDouble();
					sc.nextLine();
					cuentaDeAhorro = new CuentaAhorro(num, saldo, titular, interes, mantenimiento);
					
				}
				
			}
			
			case 3 -> {
				
				if(titular != null) {
					
					System.out.println("Introduzca los siguientes datos: Número de cuenta, saldo, número de transacciones y porcentaje de cobro al transferir");
					num = sc.nextInt();
					sc.nextLine();
					saldo = sc.nextDouble();
					sc.nextLine();
					numTransacciones = sc.nextInt();
					sc.nextLine();
					porcentajeCobrado = sc.nextDouble();
					sc.nextLine();
					cuentaCorriente = new CuentaCorriente(num, saldo, titular, numTransacciones, porcentajeCobrado);
					
				}
				
			}
			
			case 4 -> {
				
				System.out.println("Introduzca una de las siguientes opciones: ");
				System.out.println("1. Aplicar interés.");
				System.out.println("2. Aplicar mantenimiento.");
				System.out.println("3. Mostrar datos.");
				opcion2 = sc.nextInt();
				sc.nextLine();
				
				switch (opcion2) {
				
				case 1 -> {
					
					cuentaDeAhorro.aplicarInteres();
					
				}
				
				case 2 -> {
					
					cuentaDeAhorro.aplicarMantenimiento();
					
				}
				
				case 3 -> {
					
					System.out.println(cuentaDeAhorro);
					
				}
				
				
				}
				
			}
			
			case 5 -> {
				
				System.out.println("Introduzca la opción: ");
				System.out.println("1. Transacción.");
				System.out.println("2. Mostrar datos.");
				System.out.println("3. Mostrar los datos de la cuenta de ejemplo a la que se dirigen las transacciones.");
				opcion2 = sc.nextInt();
				sc.nextLine();
				
				switch (opcion2) {
				
				case 1 -> {
					
					System.out.println("Introduzca de cuanto dinero quiere hacer la transacción.");
					importe = sc.nextDouble();
					sc.nextLine();
					transaccion.setImporte(importe);
					
					cuentaCorriente.hacerTransaccion(transaccion, cuentaCorriente2);
					
				}
				
				case 2-> {
					
					System.out.println(cuentaCorriente);
					
				}
				
				case 3 -> {
					
					System.out.println(cuentaCorriente2);
					
				}
				
				
				}
				
			}
			
			}
			
			System.out.println();
			
		} while (opcion != 0);
		
		System.out.println("Saliendo del programa.");

		sc.close();

	}

}
