package Ejercicio_4;

public class Gato {
	private String nombre;
	private String color;
	
	public Gato(String nombre, String color) {
		this.nombre = nombre;
		this.color = color;
	}
	public String getNombre() {
		return nombre;}
	public void setNombre(String nombre) {
		this.nombre = nombre;	}
	public String getColor() {
		return color;	}
	public void setColor(String color) {
		this.color = color;	}

	public void hacerSonido(String maulla) {
		if(maulla.equals(maulla))
			System.out.println("Este animal hace el siguiente sonido: " + maulla);
	}
	
	public void hacerSonido() {
		System.out.println("Este animal hace el sonido: Miauu Miauu");
	}
	
	public void moverse() {
		System.out.println("El gato camina y salta ");
	}
}