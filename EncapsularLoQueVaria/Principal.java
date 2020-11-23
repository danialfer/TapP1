package EncapsularLoQueVaria;

public class Principal {
	public static void main(String[] args) {
		
		volar("Iberia");
		System.out.println("");
		volar("Emirates");
		System.out.println("");
		volar("Vueling");
	}

	public static void volar(String compañia) {
		
		System.out.println("Embarcando al vuelo de la compañia " +compañia);
		
		System.out.println("Despegando...");
		
		servirComida(compañia);
		
		System.out.println("Aterrizando...");
	}

	private static void servirComida(String compañia) {
		
		if(compañia.equals("Iberia")) {
			
			System.out.println("Servido pollo al limón");
		}else
			if(compañia.equals("Emirates")) {
				
				System.out.println("Servido pescado al horno");
			}else
				System.out.println("Lo sentimos. Su vuelo no sirve comida");
		
	}
}
