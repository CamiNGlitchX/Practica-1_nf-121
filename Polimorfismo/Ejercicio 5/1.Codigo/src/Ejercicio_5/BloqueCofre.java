package Ejercicio_5;

public class BloqueCofre extends Bloque{
	private int capacidad;
	private int resistencia;
	private String tipo;
	
	public BloqueCofre(int capacidad, int resistencia, String tipo) {
		this.capacidad = capacidad;
		this.resistencia = resistencia;
		this.tipo = tipo;
	}
	
	@Override
	public void accion() {
		System.out.println("El bloque de cofre es de tipo " + tipo + " con capacidad de " + capacidad + " y con una resistencia de " + resistencia);
	}
	
	public void colocar(String orientacion) {
		if(orientacion.equals(orientacion)) {
			System.out.println("el bloque cofre se posiciono en el " + orientacion + "");
		}
	}
	
	@Override
	public void romper(String tipo) {
		if(tipo.equals("Cofre solido")) {
			System.out.println("Se rrompio el bloque de cofre de tipo: " + tipo);
			System.out.println("Los items dentro fueron esparcidos");
			System.out.println("Recogelos! podrian desaparecer");
	}
		else {
			System.out.println("Los elementos desaparecieron porque es cofre ender");
		}
	}
}