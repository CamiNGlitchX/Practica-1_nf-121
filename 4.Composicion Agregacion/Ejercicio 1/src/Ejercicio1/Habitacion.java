package Ejercicio1;

public class Habitacion {
	private String nombre;
	private double tamano;
	
	public Habitacion(String nombre, double tamano) {
		this.nombre = nombre;
		this.tamano = tamano;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getTamano() {
		return tamano;
	}

	public void setTamano(double tamano) {
		this.tamano = tamano;
	}
	
	public void mostrarInfo() {
		System.out.println("La habitacion "+nombre+" y el tamaño es de "+tamano+" metros cuadrados");
	}
	
}
