package Ejercicio_1;

public class Persona {
	public String nombre;
	public int edad;
	public String ciudad;
	
	public Persona(String nombre, int edad, String ciudad) {
		this.nombre = nombre;
		this.edad = edad;
		this.ciudad = ciudad;
	}

	public void saludar() {
		System.out.println("Hola soy " + nombre + " de " + ciudad);
	}
	
	public void mayor () {
		if (edad >=18) {
			System.out.println(nombre + " con " + edad + " es mayor de edad");
		}
		else {
			System.out.println(nombre + " con " + edad + " es menor de edad");
		}
	}
}