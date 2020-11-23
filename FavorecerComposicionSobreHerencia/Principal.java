package FavorecerComposicionSobreHerencia;

public class Principal {

	public static void main(String[] args) {
		
		InstrumentoEscritura lapiz = new InstrumentoEscritura(new EscrituraLapiz("Negro"), new BorradoNoBorrado());
		InstrumentoEscritura lapizGoma = new InstrumentoEscritura(new EscrituraLapiz("Negro"), new BorradoLapiz());
		InstrumentoEscritura boli = new InstrumentoEscritura(new EscrituraBoli("Rojo"), new BorradoNoBorrado());
		InstrumentoEscritura boliCuchilla = new InstrumentoEscritura(new EscrituraBoli("Azul"), new BorradoBoli());
		
		lapiz.getEscritor().escribir("Hola soy un lápiz");
		lapiz.getBorrador().borrar();
		lapizGoma.getEscritor().escribir("Hola soy un lápiz con goma");
		lapizGoma.getBorrador().borrar();
		boli.getEscritor().escribir("Hola soy un boli");
		boli.getBorrador().borrar();
		boliCuchilla.getEscritor().escribir("Hola soy un boli con cuchilla");
		boliCuchilla.getBorrador().borrar();
	}
}
