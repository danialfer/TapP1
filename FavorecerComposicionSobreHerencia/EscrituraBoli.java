package FavorecerComposicionSobreHerencia;

public class EscrituraBoli extends ModoEscritura{
	
	public EscrituraBoli(String color) {
		super(color);
	}

	@Override
	public void escribir(String texto) {
		
		System.out.println("Escribiendo a boli en color " + this.getColor()+ " el texto: " + texto);

	}

}
