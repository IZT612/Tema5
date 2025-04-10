package parte5.ejercicio2;

public class NegativeBalanceException extends Exception{
	
	public String toString() {
		
		return "Se ha introducido un saldo negativo. Vuelva a intentarlo.";
		
	}

}
