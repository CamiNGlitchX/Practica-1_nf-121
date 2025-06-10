package Ejercicio1;

public class App {

	public static void main(String[] args) {
		Casa miCasa = new Casa("Av. Siempre Viva 742");

        Habitacion cocina = new Habitacion("Cocina", 12.0);
        Habitacion sala = new Habitacion("Sala", 20.5);
        Habitacion dormitorio = new Habitacion("Dormitorio", 15.3);
        Habitacion baño = new Habitacion("Baño", 6.7);

        miCasa.agregarHabitacion(cocina);
        miCasa.agregarHabitacion(sala);
        miCasa.agregarHabitacion(dormitorio);
        miCasa.agregarHabitacion(baño);

        miCasa.mostrarCasa();
    }

}