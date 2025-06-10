package Ejercicio_3;

public class Oficina {
	public int nroSillas;
	public int nroEscritorios;
	public int nroEstanterias;
	
	public Oficina(int nroSillas, int nroEscritorios, int nroEstanterias) {
		this.nroSillas = nroSillas;
		this.nroEscritorios = nroEscritorios;
		this.nroEstanterias = nroEstanterias;
	}
	
	public void mostrar() {
		System.out.println("Numero de sillas: " + nroSillas);
		System.out.println("Numero de escritorios: " + nroEscritorios);
		System.out.println("Numero de estanterias: " + nroEstanterias);
	}
	
	public void cantidadMuebles() {
		int totalMuebles = this.nroSillas + this.nroEscritorios + this.nroEstanterias;
		System.out.println("El total de muebles en la oficina es: " + totalMuebles);
	}
	
	public int cantidadMuebles(String tipo) {
		if(tipo.equals("sillas")) {
			return nroSillas;
		}
		else if 
			(tipo.equals("escritorios")){
				return nroEscritorios;
		}
		else if 
			(tipo.equals("estanterias")){
				return nroEstanterias;
		}
		else {
			return 0;
		}
	}
}