package Ejercicio_3;

public class Aula {
	public String nombre;
	public int capacidad;
	public int nroPupitres;
	
	public Aula(String nombre, int capacidad, int nroPupitres) {
		this.nombre = nombre;
		this.capacidad = capacidad;
		this.nroPupitres = nroPupitres;
	}
	
	public void mostrar() {
		System.out.println("Numero de sillas: " + nroPupitres);
	}
	
	public void cantidadMuebles() {
		System.out.println("La cantidad de muebles es: " + this.nroPupitres);
	}
	
	public int cantidadMuebles(String tipo) {
		if(tipo.equals("sillas")) {
			return 0;
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
			return nroPupitres;
	}
		else {
			return 0;
		}
	}
}