package parte3.ejercicio1;

public class Turismo extends Vehiculo{
	
	private enum TipoUso {
		
		PROFESIONAL, PARTICULAR
		
	}
	
	private int numPlazas;
	
	private TipoUso uso;
	
	public int getNumPlazas() {
		
		return this.numPlazas;
		
	}
	
	public String getUso() {
		
		String uso;
		
		switch (this.uso) {
		
		case PROFESIONAL -> {
			
			uso = "Profesional";
			
		}
		
		case PARTICULAR -> {
			
			uso = "Particular";
			
		}
		
		default -> {
			
			uso = "NULL";
			
		}
		
		}
		
		return uso;
		
	}
	
	public void setUso(String uso) {
		
		comprobarUso(uso);
		
	}
	
	public Turismo(String marca, String modelo, String color, String matricula, int numPlazas, String uso) {
		
		super(marca, modelo, color, matricula);
		
		if (numPlazas > 0) {
			
			this.numPlazas = numPlazas;
			
		}
		
		comprobarUso(uso);
		
	}
	
	public void comprobarUso(String uso) {
	
		if (uso.equals("PROFESIONAL") || uso.equals("PARTICULAR")) {
			
			this.uso = TipoUso.valueOf(uso.toUpperCase());
			
		}
		
	}
	
	
	
	

}
