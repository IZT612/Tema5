package parte3.ejercicio3;

import java.util.HashSet;
import java.util.Set;

public class CuentaBancaria {

	private Set<Titular> titulares = new HashSet<Titular>();

	private int num;
	private double saldo = 0;

	public CuentaBancaria(int num, double saldo, Titular titular) {

		this.num = num;
		this.saldo = saldo;
		titulares.add(titular);

	}
	
	public int getNum() {
		
		return num;
		
	}
	
	public double getSaldo() {
		
		return saldo;
		
	}
	
	public void setSaldo(double saldo) {
		
		this.saldo = saldo;
		
	}
	
	public String getTitulares() {
		
		String info = "";
		
		for (Titular titular : titulares) {
			
			info += titular.toString() + "\n";
			
		}
		
		return info;
		
	}
	
	public String toString() {
		
		String info;
		
		info = "Número de cuenta: " + this.num + " | Saldo: " + this.saldo + " | Cantidad de titulares: " + this.titulares.size();
		
		return info;
		
	}

	public void ingresar(int cant) {

		this.saldo = cant;

	}

	public boolean retirar(int cant) {

		boolean conseguido = false;

		if (saldo - cant >= 0) {

			this.saldo -= cant;
			conseguido = true;

		}

		return conseguido;

	}

	public boolean añadirTitular(Titular titular) {

		boolean conseguido = false;

		if (titulares.size() < 3) {

			titulares.add(titular);
			conseguido = true;

		}

		return conseguido;

	}

	public boolean eliminarTitular(String dni) {

		boolean conseguido = false;

		if (titulares.size() != 1) {

			for (Titular titular : titulares) {

				if (titular.getDni().equals(dni)) {

					titulares.remove(titular);
					conseguido = true;

				}

			}

		}

		return conseguido;

	}
}
