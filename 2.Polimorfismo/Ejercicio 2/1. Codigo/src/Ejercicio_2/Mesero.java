package Ejercicio_2;

public class Mesero {
	public String nombre;
	public int sueldoMes;
	public int horasExtra;
	public float sueldoHora;
	public float propina;
	
	
	public Mesero(String nombre, int sueldoMes, int horasExtra, float sueldoHora, float propina) {
		this.nombre = nombre;
		this.sueldoMes = sueldoMes;
		this.horasExtra = horasExtra;
		this.sueldoHora = sueldoHora;
		this.propina = propina;
	}
	
	public void info(String nombre) {
		System.out.println("Area de camareros:" + nombre);
	}
	
	public void mostrar() {
		System.out.println("Sueldo acumulado: " + sueldoMes);
		float sueldoTotal = sueldoMes + (horasExtra * sueldoHora) + propina;
		System.out.println("Sueldo total transferido: " + sueldoTotal);
	}
	
	public void mostrar(float sueldoX) {
		if (this.sueldoMes == sueldoX) {
			System.out.println("Mesero: " + nombre + "tiene sueldo igual a" + sueldoX);
		}
	}
}
