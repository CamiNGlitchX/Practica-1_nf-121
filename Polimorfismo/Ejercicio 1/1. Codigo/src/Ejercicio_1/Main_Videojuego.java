package Ejercicio_1;

import java.util.ArrayList;

public class Main_Videojuego {

	public static void main(String[] args) {
		System.out.println("SALA PARA JUGADORES EN SOLITARIO");
		
		Videojuego juego1 = new Videojuego("Brawl Stars");
		
		juego1.mostrar();
		
		juego1.agregar("Nataniel");
		
		System.out.println(   );
		System.out.println("SALA PARA MULTIPLES JUGADORES");
		
		
		Videojuego juego2 = new Videojuego("Roblox", "Prime Gaming", 5);
		
		juego2.mostrar();
		
		ArrayList<String> jugadores =new ArrayList<>();
		jugadores.add("Lisa");
		jugadores.add("Belen");
		jugadores.add("Juliet");
		
		juego2.agregar(jugadores);
	}
}
