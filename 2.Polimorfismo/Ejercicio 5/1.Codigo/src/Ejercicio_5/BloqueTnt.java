package Ejercicio_5;

public class BloqueTnt extends Bloque {
	private String tipo;
	private int dano;
	
	public BloqueTnt(String tipo, int dano) {
		this.tipo = tipo;
		this.dano = dano;
	}
	
	@Override
	public void accion() {
		System.out.println("El bloque de TnT es de tipo " + tipo + " con un daño de " + dano);
	}
	
	public void colocar(String orientacion) {
		if(orientacion.equals(orientacion)) {
			System.out.println("el bloque de TnT se posiciono en el " + orientacion + "");
		}
	}
	
	@Override
	public void romper(String tipo) {
		if(tipo.equals("TnT normal")) {
			System.out.println("Se rrompio el bloque de TnT de tipo: " + tipo);
			System.out.println("Se detuvo la detonacion de TnT");
		}
		
		else {
			System.out.println("Se rrompio el bloque de TnT de tipo: " + tipo);
			System.out.println("Inevitable desbordamiento del agua");
		}
	}
}
