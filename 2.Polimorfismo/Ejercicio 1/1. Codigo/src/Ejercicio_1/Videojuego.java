package Ejercicio_1;

import java.util.ArrayList;

public class Videojuego {
	private String nombre;
	private String plataforma;
	private int cantJugadores;
	
	ArrayList<String> jugadores;
	
	//Constructor recibira solo el nombre del videojuego
	public Videojuego(String nombre) {
		this.nombre = nombre;
		this.plataforma = "Steam";
		this.cantJugadores = 1;
		this.jugadores = new ArrayList<>();
	}
	
	//constructor recbira la plataforma y el nro de jugadores
	public Videojuego(String nombre, String plataforma, int cantJugadores) {
		this.nombre = nombre;
		this.plataforma = plataforma;
		this.cantJugadores = cantJugadores;
		this.jugadores = new ArrayList<>();
	}
	
	public void mostrar () {
		System.out.println("El juego es "+ nombre + " de la plataforma " + plataforma + " con " + cantJugadores + " jugadores");
	}

	public void agregar(String jugador) {
		jugadores.add(jugador);
		System.out.println("Se añadio al jugador: " + jugador);
	}
	
	public void agregar(ArrayList<String> jugNuevos) {
		jugadores.addAll(jugNuevos);
		System.out.println("Se agregaron a los siguientes jugadores: "+ jugadores);
	}
}	








