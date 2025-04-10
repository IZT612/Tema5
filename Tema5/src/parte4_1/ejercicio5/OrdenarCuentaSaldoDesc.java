package parte4_1.ejercicio5;

import java.util.Comparator;

public class OrdenarCuentaSaldoDesc implements Comparator<CuentaBancaria>{
	
	public int compare(CuentaBancaria cb1, CuentaBancaria cb2) {
		
		return (int) (cb2.getSaldo() - cb1.getSaldo());
		
	}

}
