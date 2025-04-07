package parte3.ejercicio2;

public class Libro extends Ficha{
	
	private String autor;
	private String editorial;
	
	public Libro(int id, String titulo, String autor, String editorial) {
		
		super(id, titulo);
		
		if (!autor.isBlank()) {
			
			this.autor = autor;
			
		}
			
		if (!editorial.isBlank()) {
			
			this.editorial = editorial;
			
		}
		
	}
	
	public String getAutor() {
		
		return this.autor;
		
	}
	
	public String getEditorial() {
		
		return this.editorial;
		
	}
	
	@Override
	public int prestar() {

		return 15;
		
	}

}
