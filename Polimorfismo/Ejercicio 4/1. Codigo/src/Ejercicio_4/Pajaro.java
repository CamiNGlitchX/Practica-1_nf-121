package Ejercicio_4;

public class Pajaro {
	private String nombre;
	private String tipo;
	
	public Pajaro(String nombre, String tipo) {
		this.nombre = nombre;
		this.tipo = tipo;
	}
	public String getNombre() {
		return nombre;}
	public void setNombre(String nombre) {
		this.nombre = nombre;	}
	public String getTipo() {
		return tipo;	}
	public void setTipo(String tipo) {
		this.tipo = tipo;	}

	public void hacerSonido(String silvidos) {
		if (silvidos.equals(silvidos)) {
			System.out.println("Este animal hace el siguiente sonido: " + silvidos);
		}
	}
	
	public void hacerSonidos() {
		System.out.println("Este animal hace el siguiente sonido: Fiu Fiu");
	}
	
	public void moverse() {
		System.out.println("El pajaro vuela ");
	}
}
