package parte1.ejercicio3;

public class Main {

	public static void main(String[] args) {
		
		Producto PR1 = new Producto("ejemplo producto", 2);
		Perecedero PE1 = new Perecedero("ejemplo perecedero", 2, 1);
		No_Perecedero NPE1 = new No_Perecedero("ejemplo no perecedero", 2, "algo");
		
		System.out.println(PR1);
		System.out.println(PE1);
		System.out.println(NPE1);
		
		System.out.println("Precio a pagar de PR1 comprando 2: " + PR1.calcular(2));
		System.out.println("Precio a pagar de PE1 comprando 2: " + PE1.calcular(2));
		System.out.println("Precio a pagar de NPE1 comprando 2: " + NPE1.calcular(2));
	}

}
