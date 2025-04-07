package parte3.ejercicio2;

public abstract class Ficha {

	private int id;
	private String titulo;
	
	public Ficha(int id, String titulo) {
		
		this.id = id;
		
		if (!titulo.isBlank()) {
			
			this.titulo = titulo;
			
		}
		
	}

	public abstract int prestar();
	
	public int getId() {
		
		return this.id;
		
	}
	
	public String getTitulo() {
		
		return this.titulo;
		
	}
	
}
