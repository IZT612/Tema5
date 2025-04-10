package parte5.ejercicio2;

/**
 * Clase que se encarga de guardar los atributos de una cuenta y sus operaciones
 * comunes
 */
public class CuentaCorriente {

	// Creamos los atributos que guardamos en cada cuenta como DNI, nombre y saldo 
	private String DNI = "DNI inválido";
	private String nombre = "Nombre inválido";
	private double saldo = 0;

	// Nacionalidad será un enumerador que solo podrá tener como valores "ESPAÑOLA"
	// o "EXTRANJERA"
	enum Nacionalidad {
		ESPAÑOLA, EXTRANJERA
	};

	// Creamos la variable nacion que tendrá uno de los valores de Nacionalidad, por
	// predeterminado será "Española"
	private Nacionalidad nacion = Nacionalidad.ESPAÑOLA;

	/**
	 * Constructor dado solo el DNI y el saldo
	 * 
	 * @param DNI   = DNI de la persona dueña de la cuenta
	 * @param saldo = saldo de la persona dueña de la cuenta
	 */
	public CuentaCorriente(String DNI, double saldo, String nombre) throws BlankDniException, NegativeBalanceException, BlankNameException {

		// Verificamos que no esté vacío el valor introducido
		if (!DNI.isBlank()) {

			// Si no está vacío, lo guardamos
			this.DNI = DNI;

		} else {
			
			throw new BlankDniException();
			
		}

		// Guardamos el saldo introducido
		if (saldo >= 0) {
			
			this.saldo = saldo;
			
		} else {
			
			throw new NegativeBalanceException();
			
		}
		
		if (!nombre.isBlank()) {
			
			this.nombre = nombre;
			
		} else {
			
			throw new BlankNameException();
			
		}

	}

	/**
	 * Constructor de cuenta dado el DNI, nombre y saldo
	 * 
	 * @param DNI    = DNI de la persona dueña de la cuenta
	 * @param nombre = nombre de la persona dueña de la cuenta
	 * @param saldo  = saldo de la persona dueña de la cuenta
	 */
	public CuentaCorriente(String DNI, String nombre, double saldo) {

		if (!DNI.isBlank()) {

			this.DNI = DNI;

		}

		if (!nombre.isBlank()) {

			this.nombre = nombre;

		}

		if (saldo > 0) {
			
			this.saldo = saldo;
			
		}

	}

	/**
	 * Constructor dado el DNI, nombre, saldo y nacionalidad
	 * 
	 * @param DNI          = DNI de la persona dueña de la cuenta
	 * @param nombre       = nombre de la persona dueña de la cuenta
	 * @param saldo        = saldo de la persona dueña de la cuenta
	 * @param nacionalidad = nacionalidad de la persona dueña de la cuenta
	 */
	public CuentaCorriente(String DNI, String nombre, double saldo, String nacionalidad) {

		if (!DNI.isBlank()) {

			this.DNI = DNI;

		}

		if (!nombre.isBlank()) {

			this.nombre = nombre;

		}
		
		if (saldo > 0) {
			
			this.saldo = saldo;
			
		}

		switch (nacionalidad) {

		case "EXTRANJERA" -> {

			this.nacion = Nacionalidad.EXTRANJERA;

		}

		}

	}

	/**
	 * Método que sirve para cambiar el DNI
	 * 
	 * @param DNI = nuevo DNI de la persona dueña de la cuenta
	 */
	public void setDNI(String DNI) {

		if (!DNI.isBlank()) {
			
			this.DNI = DNI;
			
		}

	}
	
	/**
	 * Método para cambiar el nombre 
	 * 
	 * @param nombre = Nuevo nombre de la persona dueña de la cuenta
	 */
	public void setNombre(String nombre) {
		
		if (!nombre.isBlank()) {
			
			this.nombre = nombre;
			
		}
		
	}
	
	/**
	 * Método que cambia el saldo de la persona dueña de la cuenta
	 * 
	 * @param saldo = Nuevo saldo de la persona
	 */
	public void setSaldo(double saldo) {
		
		if (saldo > 0) {
			
			this.saldo = saldo;
			
		}
		
	}
	
	/**
	 * Método para obtener la nacionalidad de la persona dueña de la cuenta
	 * 
	 * @param nacionalidad = Nueva nacionalidad de la persona dueña de la cuenta
	 */
	public void setNacionalidad(String nacionalidad) {
		
		switch (nacionalidad) {
		
			case "EXTRANJERA" -> {
				
				this.nacion = Nacionalidad.EXTRANJERA;
				
			}
			
			case "ESPAÑOLA" -> {
				
				this.nacion = Nacionalidad.ESPAÑOLA;
				
			}
		
		}
		
	}
	
	/**
	 * Método para obtener el DNI del objeto
	 * 
	 * @return El DNI de la persona dueña de la cuenta
	 */
	public String getDNI() {
		
		String DNI;
		
		DNI = this.DNI;
		
		return DNI;
		
	}
	
	/**
	 * Método para obtener el atributo nombre del objeto
	 * 
	 * @return El nombre de la persona dueña de la cuenta
	 */
	public String getNombre() {
		
		String nombre;
		
		nombre = this.nombre;
		
		return nombre;
		
	}
	
	/**
	 * Método para obtener el atributo saldo del objeto
	 * 
	 * @return El saldo de la persona dueña de la cuenta
	 */
	public double getSaldo() {
		
		double saldo;
		
		saldo = this.saldo;
		
		return saldo;
		
	}
	
	/**
	 * Método para obtener el atributo nacion del objeto
	 * 
	 * @return La nacionaldiad de la persona dueña de la cuenta
	 */
	public String getnacionalidad() {
		
		String nacionalidad;
		
		if (this.nacion == Nacionalidad.EXTRANJERA) {
			
			nacionalidad = "EXTRANJERA";
			
		} else {
			
			nacionalidad = "ESPAÑOLA";
			
		}
		
		return nacionalidad;
		
	}
	
	/**
	 * Método que sirve para sacar dinero de una cuenta (verificando primero si es posible)
	 * 
	 * @param cantidad = cantidad de dinero a sacar
	 * @return Un booleano "posible" indicando si es posible o no
	 */
	public boolean sacarDinero(double cantidad) {
		
		boolean posible = false;
		
		if (cantidad <= this.saldo) {
			
			posible = true;
			saldo -= cantidad;
			
		}
		
		return posible;
	}
	
	/**
	 * Método que sirve para ingresar dinero a una cuenta, verificando primero si es posible
	 * 
	 * @param cantidad
	 * @return Un booleano "posible" que indica si es posible o no
	 */
	public boolean ingresarDinero(double cantidad) {
		
		boolean posible = false;
		
		if (cantidad > 0) {
			
			this.saldo += cantidad; 
			posible = true;
			
		}

		return posible;
	}
	
	/**
	 * Método que vuelve la información de la cuenta un String
	 * 
	 * @return Un string con toda la informacion de la cuenta
	 */
	public String toString() {
		
		String informacion;
		
		informacion = ("DNI: " + this.DNI + "\nNombre: " + this.nombre + "\nSaldo: " + this.saldo + "€\nNacionalidad: " + this.nacion);
		
		return informacion;
		
	}
	
	/**
	 * Método que verifica si dos cuentas son iguales mediante su nombre y dni
	 * 
	 * @param cuenta = objeto con el que vamos a comparar el objeto que ha llamado la función
	 * @return Un booleano indicando si son iguales o no
	 */
	public boolean equals(CuentaCorriente cuenta) {
		
		boolean iguales = false;
		
		if (this.nombre.equals(cuenta.nombre) && this.DNI.equals(cuenta.DNI)) {
			
			iguales = true;
			
		}
		
		return iguales;
	}

}
