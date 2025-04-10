package parte4_1.ejercicio5;

public class Transaccion {
	
	private int dia;
	private int mes;
	private int año;
	private String concepto;
	private double importe;
	
	public Transaccion(int dia, int mes, int año, String concepto, double importe) {
		
		if(dia >= 1 && dia <= 31) {
			
			this.dia = dia;
			
		}
		
		if(mes >= 1 && mes <= 12) {
			
			this.mes = mes;
			
		}
		
		this.año = año;
		
		if(!concepto.isBlank()) {
			
			this.concepto = concepto;
			
		}
		
		if(importe > 0) {
			
			this.importe = importe;
			
		}
		
	}
	
	public int getDia() {
		
		return this.dia;
		
	}
	
	public int getMes() {
		
		return this.mes;
		
	}
	
	public int getAño() {
		
		return this.año;
		
	}
	
	public String getConcepto() {
		
		return this.concepto;
		
	}
	
	public double getImporte() {
		
		return this.importe;
		
	}
	
	public void setImporte(double dinero) {
		
		this.importe = dinero;
		
	}

}
