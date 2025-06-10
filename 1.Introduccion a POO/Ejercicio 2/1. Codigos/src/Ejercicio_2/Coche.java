package Ejercicio_2;

public class Coche {
	public String marca;
	public String modelo;
	public int velocidad;
	
	public Coche(String marca, String modelo, int velocidad) {
		this.marca = marca;
		this.modelo = modelo;
		this.velocidad = velocidad;
	}
	
	public void inicial(){
		System.out.println("La marca es: " + marca);
		System.out.println("El modelo es: " + modelo);
		System.out.println("La velocidad actual es: " + velocidad);
	}

	public void acelerar() {
		velocidad += 10;
		System.out.println("La velocidad actual acelerar es: " + velocidad);
	}
	
	public void frenar() {
		velocidad -= 5;
		System.out.println("La velocidad actuala frenar es: " + velocidad);
	}
}
