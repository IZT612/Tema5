package parte3.ejercicio3;

import java.util.HashSet;
import java.util.Set;

public class CuentaCorriente extends CuentaBancaria {

	private int numTransacciones = 0;
	private double porcentajeCobrado;

	private Set<Transaccion> transacciones = new HashSet<Transaccion>();

	public CuentaCorriente(int num, double saldo, Titular titular, int numTransacciones, double porcentajeCobrado) {

		super(num, saldo, titular);

		this.numTransacciones = numTransacciones;

		if (porcentajeCobrado >= 0) {
			this.porcentajeCobrado = porcentajeCobrado;
		}
	}

	public String toString() {

		String info = super.toString();

		info += " | Número de transacciones: " + this.numTransacciones + " | Porcentaje que se cobra: "
				+ this.porcentajeCobrado;

		return info;

	}

	public boolean hacerTransaccion(Transaccion transaccion, CuentaBancaria cuentaBancaria) {

		boolean conseguido = false;
		
		double dineroTransferido = transaccion.getImporte() - (transaccion.getImporte() * (this.porcentajeCobrado / 100));

		if (this.getSaldo() - transaccion.getImporte() >= 0) {
			this.setSaldo(this.getSaldo() - transaccion.getImporte() - dineroTransferido);
			transacciones.add(transaccion);
			cuentaBancaria.setSaldo(cuentaBancaria.getSaldo() + dineroTransferido);
			conseguido = true;
		}

		return conseguido;

	}

}
