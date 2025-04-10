package parte5.ejercicio1;

/**
 * Clase que representa una hora con horas, minutos y segundos.
 * Permite incrementar la hora en segundos y mostrar la hora en formato HH:MM:SS.
 * 
 * @author Iván
 */
public class Hora {
    
    private int hora;
    private int minuto;
    private int segundo;
    
    /**
     * Constructor de la clase Hora.
     * Inicializa la hora con los valores proporcionados, siempre que sean válidos.
     * 
     * @param hora El valor de la hora (debe estar entre 0 y 23).
     * @param minuto El valor de los minutos (debe estar entre 0 y 59).
     * @param segundo El valor de los segundos (debe estar entre 0 y 59).
     */
    public Hora(int hora, int minuto, int segundo) {
        if (hora < 24 && hora >= 0) {
            this.hora = hora;
        }
        
        if (minuto < 60 && minuto >= 0) {
            this.minuto = minuto;
        }
        
        if (segundo < 60 && segundo >= 0) {
            this.segundo = segundo;
        }
    }
    
    public void setHora(int hora) throws NegativeHourException{
    	
    	if (hora < 0) {
    		
    		throw new NegativeHourException();
    		
    	} else {
    		
    		this.hora = hora;
    		
    	}
    	
    }
    
    public void setMinuto(int minuto) throws NegativeMinuteException{
    	
    	if (minuto < 0) {
    		
    		throw new NegativeMinuteException();
    		
    	} else {
    		
    		this.minuto = minuto;
    		
    	}
    	
    }
    
    public void setSegundo(int segundo) throws NegativeSecondException{
    	
    	if (segundo < 0) {
    		
    		throw new NegativeSecondException();
    		
    	} else {
    		
    		this.segundo = segundo;
    		
    	}
    	
    }
    
    /**
     * Incrementa la hora en un segundo.
     * Si los segundos llegan a 60, se reinician a 0 y se incrementan los minutos.
     * Si los minutos llegan a 60, se reinician a 0 y se incrementan las horas.
     * Si las horas llegan a 24, se reinician a 0.
     */
    public void incrementarSegundo() {
        if (this.segundo < 59) {
            this.segundo++;
        } else {
            this.segundo = 0;
            
            if (this.minuto < 59) {
                this.minuto++;
            } else {
                this.minuto = 0;
                
                if (this.hora < 23) {
                    this.hora++;
                } else {
                    this.hora = 0;
                }
            }
        }
    }
    
    /**
     * Devuelve la hora en formato de cadena (HH:MM:SS).
     * 
     * @return La hora en formato de cadena.
     */
    @Override
    public String toString() {
        String informacion = "";
        
        if (this.hora < 10) {
            informacion += 0;
        }
        
        informacion += this.hora + ":";
        
        if (this.minuto < 10) {
            informacion += 0;
        }
        
        informacion += this.minuto + ":";
        
        if (this.segundo < 10) {
            informacion += 0;
        }
        
        informacion += this.segundo;
        
        return informacion;
    }
}
