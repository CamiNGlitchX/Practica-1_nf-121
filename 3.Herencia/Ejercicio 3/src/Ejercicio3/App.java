package Ejercicio3;

import java.util.ArrayList;

public class App {

	public static void main(String[] args) {
		Gerente gerente1 = new Gerente("Lucía", "Mendoza", 40000, 5, "TI", 3000);
        Gerente gerente2 = new Gerente("Roberto", "Santos", 38000, 3, "Ventas", 800);
        Desarrollador dev1 = new Desarrollador("Carlos", "Ramírez", 35000, 3, "Java", 10);
        Desarrollador dev2 = new Desarrollador("María", "Gómez", 37000, 2, "Python", 15);

        System.out.println("=== Salarios Calculados ===");
        System.out.println(gerente1.calcularSalario());
        System.out.println(gerente2.calcularSalario());
        System.out.println(dev1.calcularSalario());
        System.out.println(dev2.calcularSalario());

        ArrayList<Gerente> listaGerentes = new ArrayList<>();
        listaGerentes.add(gerente1);
        listaGerentes.add(gerente2);

        ArrayList<Desarrollador> listaDesarrolladores = new ArrayList<>();
        listaDesarrolladores.add(dev1);
        listaDesarrolladores.add(dev2);

        System.out.println("\n=== Gerentes con bono mayor a 1000 ===");
        for (Gerente g : listaGerentes) {
            if (g.getBonoGerencial() > 1000) {
                System.out.println(g.getDepartamento() + " - " + g.calcularSalario());
            }
        }

        System.out.println("\n=== Desarrolladores con más de 10 horas extras ===");
        for (Desarrollador d : listaDesarrolladores) {
            if (d.getHorasExtras() > 10) {
                System.out.println(d.getLenguajeProgramacion() + " - " + d.calcularSalario());
            }
        }

	}

}
