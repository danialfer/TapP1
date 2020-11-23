package FavorecerComposicionSobreHerencia;

public class EscrituraLapiz extends ModoEscritura{

	public EscrituraLapiz(String color) {
		super(color);
	}

	@Override
	public void escribir(String texto) {
		
		System.out.println("Escribiendo a lápiz en color " + this.getColor()+ " el texto: " + texto);

	}
}