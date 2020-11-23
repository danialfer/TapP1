package FavorecerComposicionSobreHerencia;

public class EscrituraRotulador extends ModoEscritura{
	
	public EscrituraRotulador(String color) {
		super(color);
	}

	@Override
	public void escribir(String texto) {
		
		System.out.println("Escribiendo a rotulador en color " + this.getColor()+ " el texto: " + texto);
		
	}

}
