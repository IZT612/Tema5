package parte4_1.ejercicio5;

import java.util.Comparator;

public class OrdenarCuentaNumAscendente implements Comparator<CuentaBancaria>{
	
	public int compare(CuentaBancaria cb1, CuentaBancaria cb2) {
		
		return cb1.getNum() - cb2.getNum();
		
	}

}
