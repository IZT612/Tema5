package parte3.ejercicio3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		// Solo tendremos una cuenta de cada tipo en este ejemplo, ya que es solo para comprobar que funciona
		CuentaAhorro cuentaDeAhorro;
		CuentaCorriente cuentaCorriente;
		Titular titular = null;

		String dni;
		String nombre;
		String apellidos;
		int telefono;
		int num;
		double saldo;
		int dia;
		int mes;
		int año;
		String concepto;
		double importe;
		double interes;
		double mantenimiento;
		int numTransacciones;
		double porcentajeCobrado;
		int opcion;
		
		do {
			System.out.println("Introduzca una opción.");
			System.out.println("1. Crear un titular.");
			System.out.println("2. Crear una cuenta de ahorro.");
			System.out.println("3. Crear una cuenta corriente.");
			System.out.println("4. Acciones de cuenta de ahorro.");
			System.out.println("5. Acciones de cuenta corriente.");
			opcion = sc.nextInt();
			sc.nextLine();
			
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
					
					
					
				}
				
			}
			
			}
			
		} while (opcion != 0);

		sc.close();

	}

}
