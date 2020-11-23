package ProgramarUnaInterfazNoUnaImplementacion;
//Programar un interfaz y no una implementación

//Descripción: El código debe depender de clases abstractas o interfaces y, solo luego, implementaremos las clases hijas o que implementan el interface.

//Ventajas: 
//-Al tener una interface común, se puede programar un código genérico que utilice dicha interface, en vez de un código en particular para cada implementación.
//-Mayor facilidad para extender el código (crear nuevos tipos de vehículos) sin modificar el código ya existente (v.viajar). Cumple con el principio Open/Closed.
//-Bien programado, cumple con el principio de Sutitución de Liskov que indica que una subclase (Coche) debe comportarse correctamente siempre que se utilice en lugar de su padre (Vehiculo).

//Ejemplo de aplicación:
//-Contexto: Desarrollar un progrmaa muy sencillo que permita crear un tipo de vehículo (inicialmente sólo podrá ser un coche) y viajar con él.
public class Principal {
	public static void main(String[] args) {

	Vehiculo v = new Coche("0322KPB");
	//Gracias a que hemos programado una interfaz, podríamos añadir nuevos tipos de vehículos y usarlos sin cambiar el código posterior
	//Vehiculo v = new Moto("9876JKL");
	v.viajar();
	}
}
