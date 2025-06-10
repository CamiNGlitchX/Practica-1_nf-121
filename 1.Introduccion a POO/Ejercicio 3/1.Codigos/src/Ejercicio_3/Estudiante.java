package Ejercicio_3;

public class Estudiante {
	public String nombre;
	public int nota_1;
	public int nota_2;
	
	public Estudiante(String nombre, int nota_1, int nota_2) {
		this.nombre = nombre;
		this.nota_1 = nota_1;
		this.nota_2 = nota_2;
	}
	
	public int calcProm() {
		int prom = (nota_1 + nota_2) / 2;
		return prom;
	}
	
	public void aprobo() {
		int prom = calcProm();
		if(prom >= 6) {
			System.out.println("El estudiante " + nombre + " aprobo");
		}
		else {
			System.out.println("Elestudiante " + nombre + " reprobo");
		}
	}
}
