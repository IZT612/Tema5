package parte3.ejercicio2;

public class DVD extends Ficha{

	private String director;
	private int año;
	enum Tipo {
		"PELICULA", "DOCUMENTAL", "SERIE"
	}
	
	private Tipo tipo;
	
	public DVD(int id, String titulo, String director, int año, String tipo) {
		
		super(id, titulo);
		
		if (!director.isBlank()) {
			
			this.director = director;
			
		}
		
		this.año = año;
		
	}
	
	private boolean verificarTipo(String tipo) {
		
		switch(tipo) {
		
		case "PELICULA", "DOCUMENTAL", "SERIE" -> {
			
			
			
		}
		
		
		}
		
	}
	
}
