package Ejercicio3;

public class Gerente extends Empleado{
	private String departamento;
	private int bonoGerencial;
	
	public Gerente(String nombre, String apellido, int salarioBase, int aniosAntiguo, String departamento,
			int bonoGerencial) {
		super(nombre, apellido, salarioBase, aniosAntiguo);
		this.departamento = departamento;
		this.bonoGerencial = bonoGerencial;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public int getBonoGerencial() {
		return bonoGerencial;
	}

	public void setBonoGerencial(int bonoGerencial) {
		this.bonoGerencial = bonoGerencial;
	}
	
	@Override
	public String calcularSalario() {
	    double salarioBaseConBono = super.obtenerSalarioConBono();
	    double salarioTotal = salarioBaseConBono + bonoGerencial;
	    return String.format("El salario total del gerente con todos los bonos es de: %.2f", salarioTotal);
	}

	

}
