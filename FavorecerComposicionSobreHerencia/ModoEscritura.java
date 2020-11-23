package FavorecerComposicionSobreHerencia;

public abstract class ModoEscritura {

	private String color;
	
	public ModoEscritura(String color) {
		
		this.color = color;
	}
	
	public String getColor() {
		
		return this.color;
	}
	
	public abstract void escribir(String texto);
}
