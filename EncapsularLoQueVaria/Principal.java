package EncapsularLoQueVaria;

public class Principal {
	public static void main(String[] args) {
		
		volar("Iberia");
		System.out.println("");
		volar("Emirates");
		System.out.println("");
		volar("Vueling");
	}

	public static void volar(String compa�ia) {
		
		System.out.println("Embarcando al vuelo de la compa�ia " +compa�ia);
		
		System.out.println("Despegando...");
		
		servirComida(compa�ia);
		
		System.out.println("Aterrizando...");
	}

	private static void servirComida(String compa�ia) {
		
		if(compa�ia.equals("Iberia")) {
			
			System.out.println("Servido pollo al lim�n");
		}else
			if(compa�ia.equals("Emirates")) {
				
				System.out.println("Servido pescado al horno");
			}else
				System.out.println("Lo sentimos. Su vuelo no sirve comida");
		
	}
}
