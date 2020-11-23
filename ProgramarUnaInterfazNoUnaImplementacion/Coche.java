package ProgramarUnaInterfazNoUnaImplementacion;

public class Coche extends Vehiculo{

	public Coche(String matricula) {
		super(matricula);
		}

	@Override
	public void viajar() {
		
		System.out.println("El coche con matricula " +this.matricula +" viaja");
	}
}
