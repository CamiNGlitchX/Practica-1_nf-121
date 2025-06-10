package Ejercicio_5;

public class Main_Computadora {

	public static void main(String[] args) {
		Computadora computadora1 = new Computadora();
		
		computadora1.on();
		computadora1.estadoFin();
		
		System.out.println(   );
		
		computadora1.agregar("RAM");
		computadora1.agregar("SSD");
		computadora1.agregar("CPU");
		
		System.out.println("Componentes de la computadora: ");
		computadora1.mostrar();	
		
		System.out.println(   );
		
		computadora1.off();
		computadora1.estadoFin();
	}
}