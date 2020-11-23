package FavorecerComposicionSobreHerencia;

public class InstrumentoEscritura {
	
	private ModoEscritura escritor;
	private ModoBorrado borrador;

	
	public InstrumentoEscritura(ModoEscritura escritor, ModoBorrado borrador) {
		
		this.escritor = escritor;
		this.borrador = borrador;
	}


	public ModoEscritura getEscritor() {
		return escritor;
	}


	public ModoBorrado getBorrador() {
		return borrador;
	}
	
}
