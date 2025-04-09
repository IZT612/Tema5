package parte4_1.ejercicio4;

public class Ficha {

	private int id;
	private String titulo;
	
	public Ficha(int id, String titulo) {
		
		this.id = id;
		
		if (!titulo.isBlank()) {
			
			this.titulo = titulo;
			
		}
		
	}
	
	public int getId() {
		
		return this.id;
		
	}
	
	public String getTitulo() {
		
		return this.titulo;
		
	}
	
}
