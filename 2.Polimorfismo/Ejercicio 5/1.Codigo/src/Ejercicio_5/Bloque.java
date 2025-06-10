package Ejercicio_5;

public class Bloque {
	
	public void accion() {
		System.out.println("Este bloque realiza una accion");
	}
	
	public void colocar(String orientacion) {
		if(orientacion.equals(orientacion)) {
			System.out.println("el bloque se posiciono en el " + orientacion + "");
		}
	}
	
	public void colocar(int x, int y, int z) {
		System.out.println("Las coordenadas de la posicion del bloque son de " + x +","+ y +","+ z);
	}
	
	public void romper(String tipo) {
		System.out.println("Este bloque se rompe");
	}
}
