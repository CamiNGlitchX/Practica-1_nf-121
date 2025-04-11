package Ejercicio_5;

import java.util.ArrayList;

public class Computadora {
	ArrayList<String> componentes;
	public boolean estado;

	public Computadora() {
		componentes = new ArrayList<>();
		estado = false;
	}

	public void agregar(String componente) {
		componentes.add(componente);
	}
	
	public void mostrar() {
		for (String componente : componentes) {
			System.out.println(componente);
		}
	}
	
	public void on() {
		estado = true;
		System.out.println("On");
	}
	
	public void off() {
		estado = false;
		System.out.println("Off");
	}
	
	public void estadoFin() {
		if (estado) {
			System.out.println("La computadora esta encendida");
		}
		
		else {
			System.out.println("La computadora esta apagada");
		}
	}
	
}
