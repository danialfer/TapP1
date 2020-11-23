package ProgramarUnaInterfazNoUnaImplementacion;
//Programar un interfaz y no una implementaci�n

//Descripci�n: El c�digo debe depender de clases abstractas o interfaces y, solo luego, implementaremos las clases hijas o que implementan el interface.

//Ventajas: 
//-Al tener una interface com�n, se puede programar un c�digo gen�rico que utilice dicha interface, en vez de un c�digo en particular para cada implementaci�n.
//-Mayor facilidad para extender el c�digo (crear nuevos tipos de veh�culos) sin modificar el c�digo ya existente (v.viajar). Cumple con el principio Open/Closed.
//-Bien programado, cumple con el principio de Sutituci�n de Liskov que indica que una subclase (Coche) debe comportarse correctamente siempre que se utilice en lugar de su padre (Vehiculo).

//Ejemplo de aplicaci�n:
//-Contexto: Desarrollar un progrmaa muy sencillo que permita crear un tipo de veh�culo (inicialmente s�lo podr� ser un coche) y viajar con �l.
public class Principal {
	public static void main(String[] args) {

	Vehiculo v = new Coche("0322KPB");
	//Gracias a que hemos programado una interfaz, podr�amos a�adir nuevos tipos de veh�culos y usarlos sin cambiar el c�digo posterior
	//Vehiculo v = new Moto("9876JKL");
	v.viajar();
	}
}
