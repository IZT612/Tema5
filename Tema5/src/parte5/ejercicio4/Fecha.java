package parte5.ejercicio4;

/**
 * Clase que representa una fecha con día, mes y año.
 * Permite comprobar si el año es bisiesto, verificar si la fecha es correcta
 * y avanzar al día siguiente.
 * 
 * @author Iván
 */
public class Fecha {

    private int dia;
    private int mes;
    private int año;

    /**
     * Constructor de la clase Fecha.
     * Inicializa la fecha con los valores proporcionados, siempre que sean válidos.
     * 
     * @param dia El día de la fecha (debe estar entre 1 y 31).
     * @param mes El mes de la fecha (debe estar entre 1 y 12).
     * @param año El año de la fecha.
     */
    public Fecha(int dia, int mes, int año) throws DiaErroneo, MesErroneo{
        if (dia > 0 && dia <= 31) {
            this.dia = dia;
        } else {
        	
        	throw new DiaErroneo();
        	
        }

        if (mes > 0 && mes <= 12) {
            this.mes = mes;
        } else {
        	
        	throw new MesErroneo();
        	
        }

        this.año = año;
    }

    /**
     * Comprueba si el año de la fecha es bisiesto.
     * Un año es bisiesto si es divisible por 4, pero no por 100, a menos que
     * también sea divisible por 400.
     * 
     * @return true si el año es bisiesto, false en caso contrario.
     */
    public boolean esBisiesto() {
        boolean bisiesto = false;

        if (this.año % 4 == 0 && (this.año % 100 != 0 || this.año % 400 == 0)) {
            bisiesto = true;
        }

        return bisiesto;
    }

    /**
     * Comprueba si la fecha es correcta.
     * 
     * @return true si la fecha es correcta, false en caso contrario.
     */
    public boolean fechaCorrecta() {
        boolean correcta = true;

        if (
            (this.esBisiesto() && this.mes == 2 && this.dia > 29) || 
            (this.mes == 2 && this.dia > 28) || 
            (this.mes % 2 == 0 && this.dia > 30 && this.mes <= 7) ||
            (this.mes % 2 == 1 && this.dia > 31 && this.mes <= 7) ||
            (this.mes % 2 == 0 && this.dia > 31 && this.mes > 7) ||
            (this.mes % 2 == 1 && this.dia > 30 && this.mes > 7)
        ) {
            correcta = false;
        }

        return correcta;
    }

    /**
     * Avanza la fecha al día siguiente.
     * Si el día siguiente es el primero del mes siguiente, se incrementa el mes.
     * Si el mes siguiente es enero, se incrementa el año.
     */
    public void diaSiguiente() {
        this.dia++;

        if (!this.fechaCorrecta() && this.mes == 12) {
            this.dia = 1;
            this.mes = 1;
            this.año++;
        } else if (!this.fechaCorrecta()) {
            this.dia = 1;
            this.mes++;
        }
    }

    /**
     * Devuelve la fecha en formato de cadena (dd - mm - aaaa).
     * 
     * @return La fecha en formato de cadena.
     */
    @Override
    public String toString() {
        return this.dia + " - " + this.mes + " - " + this.año;
    }
}