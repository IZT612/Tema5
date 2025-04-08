package parte3.ejercicio2;

public class DVD extends Ficha{

	private String director;
	private int año;
	enum Tipo {
		PELICULA, DOCUMENTAL, SERIE
	}
	
	private Tipo tipo;
	
	public DVD(int id, String titulo, String director, int año, String tipo) {
		
		super(id, titulo);
		
		if (!director.isBlank()) {
			
			this.director = director;
			
		}
		
		this.año = año;
		
		this.tipo = verificarTipo(tipo);
	}
	
	public String toString() {
		
		String info;
		
		info = "ID: " + this.getId() +  " | Director: " + this.director + " | Año: " + this.año + " | Tipo: " + this.tipo;		
		return info;
		
	}
	
	private Tipo verificarTipo(String tipoSt) {
		
		Tipo tipo = null;
		
		switch(tipoSt.toUpperCase()) {
		
		case "PELICULA", "DOCUMENTAL", "SERIE" -> {
			
			tipo = Tipo.valueOf(tipoSt.toUpperCase());
			
		}
		
		}
		
		return tipo;
		
	}
	
	public int prestar() {
		
		return 5;
		
	}
	
	public boolean setDirector(String director) {
		
		boolean conseguido = false;
		
		if (!director.isBlank()) {
			
			this.director = director;
			conseguido = true;
			
		}
		
		return conseguido;
		
	}
	
	public void setAño(int año) {
		
		this.año = año;
		
	}
	
	public void setTipo(String tipo) {
		
		this.tipo = verificarTipo(tipo);
	}
	
}
