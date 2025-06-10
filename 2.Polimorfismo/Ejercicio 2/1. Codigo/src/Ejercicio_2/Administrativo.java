package Ejercicio_2;

public class Administrativo {
	public String nombre;
	public float sueldoMes;
	public String cargo;
	
	public Administrativo(String nombre, float sueldoMes, String cargo) {
		this.nombre = nombre;
		this.sueldoMes = sueldoMes;
		this.cargo = cargo;
	}
	
	public void info(String nombre) {
		System.out.println("Area de administracion:" + nombre);
	}
	
	public void mostrar() {
		System.out.println("Sueldo total transferido: " + sueldoMes );
	}
	
	public void mostrar(float sueldoX) {
		if (this.sueldoMes == sueldoX) {
			System.out.println("Administrativo: " + nombre + "tiene sueldo igual a" + sueldoX);
		}
	}
}
