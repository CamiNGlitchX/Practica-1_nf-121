package Ejercicio_5;

public class BloqueHorno extends Bloque{
	private String color;
	private int capacidadComida;
	
	public BloqueHorno(String color, int capacidadComida) {
		this.color = color;
		this.capacidadComida = capacidadComida;
	}
	
	@Override
	public void accion(){
		System.out.println("El bloque de horno de color " + color + " con una capacidad de comida de " + capacidadComida);
	}
	
	public void colocar(String orientacion) {
		if(orientacion.equals(orientacion)) {
			System.out.println("el bloque de horno se posiciono en el " + orientacion + "");
		}
	}
	
	@Override
	public void romper(String estado) {
		if(estado.equals("Textura encendida")) {
			System.out.println("Se rrompio el bloque horno");
			System.out.println("Los items dentro fueron esparcidos tanto combustible como items");
			System.out.println("Recogelos! podrian desaparecer");
		}
		
		else {
			System.out.println("Items esparcidos, el bloque horno desaparecio");
		}
	}
}
