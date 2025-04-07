package parte3.ejercicio2;

public class Revista extends Ficha{
	
	private int num;
	private int año;
	
	public Revista(int id, String titulo, int num, int año) {
		
		super(id, titulo);
		
		this.num = num;
		this.año = año;
		
	}
	
	public int getNum() {
		
		return this.num;
		
	} 
	
	public int getAño() {
		
		return this.año;
		
	}
	
	public int prestar() {
		
		return 10;
		
	}

}
