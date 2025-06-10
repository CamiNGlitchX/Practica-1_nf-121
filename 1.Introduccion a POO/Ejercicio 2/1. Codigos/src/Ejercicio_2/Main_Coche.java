package Ejercicio_2;

public class Main_Coche {

	public static void main(String[] args) {
		Coche coche1 = new Coche("Corolla", "Civic 2023", 30);
		Coche coche2 = new Coche("Toyota", "todo terreno", 80);
		
		coche1.inicial();
		coche1.acelerar();
		coche1.frenar();
		
		System.out.println(   );
		
		coche2.inicial();
		coche2.acelerar();
		coche2.frenar();
	}

}
