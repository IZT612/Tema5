package parte3.ejercicio4;

public class Empresa extends Contacto{
	
	private String paginaWeb;

	public Empresa(String nombre, int numero, String paginaWeb) {
		
		super(nombre, numero);
		
		if(!paginaWeb.isBlank()) {
			
			this.paginaWeb = paginaWeb;
			
		}
		
	}
	
	public String getPaginaWEb() {
		
		return this.paginaWeb;
		
	}
	
	public String toString() {
		
		String info = super.toString();
		
		info += " | Página web: " + this.paginaWeb;
		
		return info;
	}
	
}
