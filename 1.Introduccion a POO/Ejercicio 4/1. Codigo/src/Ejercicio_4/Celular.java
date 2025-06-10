package Ejercicio_4;

import java.util.ArrayList;

public class Celular {
	public int bateria;
	public int espacioDisponible;
	public ArrayList<Aplicacion> aplicaciones;
	
	public Celular() {
		this.bateria = 100;
		this.espacioDisponible = 1024;
		this.aplicaciones = new ArrayList<>();
	}
	
	public void instalarApp(String nombre, int tamano) {
		Aplicacion nuevaApp = new Aplicacion (nombre, tamano);
		aplicaciones.add(nuevaApp);
		espacioDisponible -= tamano;
		System.out.println("La aplicacion " + nombre + " se instalo correctamente");
	}

	public void usarApp(String nombre, int minutosUso) {
	    for (Aplicacion app : aplicaciones) {
	        if (app.nombre.equals(nombre)) {
	            int porcentajeUso = 1;

	            if (app.tamano > 250) {
	                porcentajeUso = 5;
	            } else if (app.tamano > 100) {
	                porcentajeUso = 2;
	            }

	            int bateriaConsumida = (minutosUso / 10) * porcentajeUso;

	            if (bateria < bateriaConsumida) {
	                System.out.println("No tiene suficiente bateria");
	                System.out.println("Celular Apagado");
	                return;
	            }

	            bateria -= bateriaConsumida;
	            System.out.println("Se utilizo la aplicacion " + nombre);
	            System.out.println("Bateria restante: " + bateria);
	            return;
	        }
	    }
	    System.out.println("La aplicacion " + nombre + " no esta instalada.");
	}

}