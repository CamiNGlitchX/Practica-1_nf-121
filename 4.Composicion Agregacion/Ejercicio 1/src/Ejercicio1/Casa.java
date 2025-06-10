package Ejercicio1;

import java.util.ArrayList;

public class Casa {
	private String direccion;
	private ArrayList<Habitacion> habitaciones;
	
	public Casa(String direccion) {
		super();
		this.direccion = direccion;
		this.habitaciones = new ArrayList<>();
	}

	public void agregarHabitacion(Habitacion habitacion) {
        habitaciones.add(habitacion);
    }
	
	public void mostrarCasa() {
        System.out.println("Dirección de la casa: " + direccion);
        System.out.println("Habitaciones:");
        for (Habitacion h : habitaciones) {
            h.mostrarInfo();
        }
    }
	
}
