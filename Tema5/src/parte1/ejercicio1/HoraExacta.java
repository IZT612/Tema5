package parte1.ejercicio1;

public class HoraExacta extends Hora{
	
	private int segundo;
	
	public HoraExacta(int hora, int minuto, int segundo) {
		
		super(hora, minuto);
		
		if (segundo >= 0 && segundo <= 59) {
			
			this.segundo = segundo;
			
		}
		
	}
	
	boolean setSegundo(int valor) {
		
		boolean conseguido = false;
		
		if (valor >= 0 && valor <= 59) {
			
			this.segundo = valor;
			conseguido = true;
			
		}
		
		return conseguido;
		
	}
	
	public void inc() {
		
		if(this.segundo < 59) {
			
			this.segundo++;
			
		} else {
			
			super.inc();
			this.segundo = 0;
			
		}
		
	}
	
	public String toString() {
		
		String informacion = super.toString() + ":";
		
		if (this.segundo < 10) {
			
			informacion += 0;
			
		}
		
		informacion += this.segundo;
		
		return informacion;
		
	}

}
