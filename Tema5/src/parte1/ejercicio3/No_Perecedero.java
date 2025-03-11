package parte1.ejercicio3;

public class No_Perecedero extends Producto {

	private String tipo;

	public No_Perecedero(String nombre, double precio, String tipo) {

		super(nombre, precio);

		if (!tipo.isBlank()) {

			this.tipo = tipo;

		}

	}
	
	public String getTipo() {
		
		return this.tipo;
		
	}
	
	public void setTipo(String tipo) {
		
		if (!tipo.isBlank()) {

			this.tipo = tipo;

		}
		
	}
	
	public String toString() {
		
		String informacion = super.toString();
		
		informacion += "Tipo: " + this.tipo + ". ";
		
		return informacion;
	}
	
	

}