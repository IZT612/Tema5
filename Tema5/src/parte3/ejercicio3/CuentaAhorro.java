package parte3.ejercicio3;

public class CuentaAhorro extends CuentaBancaria {

	private double interes;
	private double mantenimiento;

	public CuentaAhorro(int num, double saldo, Titular titular, double interes, double mantenimiento) {

		super(num, saldo, titular);

		if (interes >= 0) {
			this.interes = interes;
		}

		if (mantenimiento >= 0) {
			this.mantenimiento = mantenimiento;
		}
	}

	public void aplicarInteres() {

		this.setSaldo(this.getSaldo() + (this.getSaldo() * (interes / 100)));

	}

	public void aplicarMantenimiento() {

		this.setSaldo(this.getSaldo() - mantenimiento);

	}

	public String toString() {
			
		String info = super.toString();
		
		info += " | Interés: " + this.interes + " | Mantenimiento: " + this.mantenimiento;
		
		return info;
		
	}

}
