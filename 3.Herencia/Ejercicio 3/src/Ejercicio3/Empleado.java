package Ejercicio3;

public class Empleado {
	private String nombre;
	private String apellido;
	private int salarioBase;
	private int aniosAntiguo;
	
	public Empleado(String nombre, String apellido, int salarioBase, int aniosAntiguo) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.salarioBase = salarioBase;
		this.aniosAntiguo = aniosAntiguo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(int salarioBase) {
		this.salarioBase = salarioBase;
	}

	public int getAniosAntiguo() {
		return aniosAntiguo;
	}

	public void setAniosAntiguo(int aniosAntiguo) {
		this.aniosAntiguo = aniosAntiguo;
	}
	
	public String calcularSalario() {
		double salarioTotal = salarioBase*(1 + 0.05 * aniosAntiguo);
		return String.format("El salario total con su bono es de: %.2f",salarioTotal);
	}
	
	public double obtenerSalarioConBono() {
        return salarioBase * (1 + 0.05 * aniosAntiguo);
    }
	
}
