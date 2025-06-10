package Ejercicio_3;

public class Laboratorio {
	public String nombre;
	public int capacidad;
	public int nroMesas;
	public int nroSillas;
	
	public Laboratorio(String nombre, int capacidad, int nroMesas, int nroSillas) {
		this.nombre = nombre;
		this.capacidad = capacidad;
		this.nroMesas = nroMesas;
		this.nroSillas = nroSillas;
	}
	
	public void mostrar() {
		System.out.println("Numero de sillas: " + nroSillas);
		System.out.println("Numero de escritorios: " + nroMesas);
	}
	
	public void cantidadMuebles() {
		int totalMuebles = this.nroMesas + this.nroSillas;
		System.out.println("La cantidad de muebles es: " + totalMuebles);
	}
	
	public int cantidadMuebles(String tipo) {
		if(tipo.equals("sillas")) {
			return nroSillas;
		}
		else if 
			(tipo.equals("escritorios")){
				return 0;
		}
		else if 
			(tipo.equals("estanterias")){
				return 0;
		}
		
		else if 
		(tipo.equals("pupitres")){
			return 0;
	}
		
		else if 
		(tipo.equals("mesas")){
			return nroMesas;
		}
	
		else {
			return 0;
		}
	}
}