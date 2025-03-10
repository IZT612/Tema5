package parte1.ejercicio1;

public class Hora {
	
	private int hora;
	private int minuto;
	
	public Hora(int hora, int minuto) {
		
		if(hora >= 0 && hora <= 23) {
			
			this.hora = hora;
			
		}
		
		if(minuto >= 0 && minuto <= 59) {
			
			this.minuto = minuto;
			
		}
		
	}
	
	public void inc() {
		
		if (this.minuto < 59) {
			
			this.minuto++;
			
		} else {
			
			if (this.hora < 23) {
				
				this.hora++;
				
			} else {
				
				this.hora = 0;
				
			}
			
			this.minuto = 0;
			
		}
		
	}
	
	public boolean setMinutos(int valor) {
		
		boolean conseguido = false;
		
		if(valor >= 0 && valor <= 59) {
			
			this.minuto = valor;
			conseguido = true;
			
		}
		
		return conseguido;
		
	}
	
	public boolean setHora(int valor) {
		
		boolean conseguido = false;
		
		if(valor >= 0 && valor <= 23) {
			
			this.hora = valor;
			conseguido = true;
			
		}
		
		return conseguido;
		
	}
	
	public String toString() {
		
		String informacion = "";
		
		if (this.hora < 10) {
			
			informacion += 0;
			
		}
		
		informacion += this.hora + ":";
		
		if (this.minuto < 10) {
			
			informacion += 0;
			
		}
		
		informacion += this.minuto;
				
		return informacion;
		
	}

}
