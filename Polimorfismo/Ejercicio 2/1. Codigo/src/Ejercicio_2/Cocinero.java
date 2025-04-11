package Ejercicio_2;

public class Cocinero {
	public String nombre;
	public int sueldoMes;
	public int horasExtra;
	public float sueldoHora;
	
	
	public Cocinero(String nombre, int sueldoMes, int horasExtra, float sueldoHora) {
		this.nombre = nombre;
		this.sueldoMes = sueldoMes;
		this.horasExtra = horasExtra;
		this.sueldoHora = sueldoHora;
	}
	
	public void info(String nombre) {
		System.out.println("Area de cocina:" + nombre);
	}
	
	public void mostrar() {
		System.out.println("Sueldo acumulado: " + sueldoMes);
		float sueldoTotal = sueldoMes + (horasExtra * sueldoHora);
		System.out.println("Sueldo total transferido: " + sueldoTotal);
	}
	
	public void mostrar(float sueldoX) {
		if (this.sueldoMes == sueldoX) {
			System.out.println("Cocinero: " + nombre + "tiene sueldo igual a" + sueldoX);
		}
	}
}