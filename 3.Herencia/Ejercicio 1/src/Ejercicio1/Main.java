package Ejercicio1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
      
        ArrayList<Coche> coches = new ArrayList<>();
        coches.add(new Coche("Toyota", "Corolla", 2025, 20000, 5, "Gasolina"));
        coches.add(new Coche("Ford", "Fiesta", 2024, 18000, 6, "Diésel"));
        coches.add(new Coche("Renault", "Clio", 2025, 16000, 2, "Eléctrico"));

        ArrayList<Moto> motos = new ArrayList<>();
        motos.add(new Moto("Honda", "CBR500", 2025, 8000, 500, "4 tiempos"));
        motos.add(new Moto("Yamaha", "MT07", 2023, 7000, 689, "4 tiempos"));

        System.out.println("== Información de todos los coches ==");
        for (Coche c : coches) {
            c.mostrar_info();
            System.out.println("-------------------");
        }

        System.out.println("\n== Información de todas las motos ==");
        for (Moto m : motos) {
            m.mostrar_info();
            System.out.println("-------------------");
        }

        System.out.println("\n== Coches con más de 4 puertas ==");
        for (Coche c : coches) {
            if (c.getNumPuertas() > 4) {
                c.mostrar_info();
                System.out.println("-------------------");
            }
        }

        System.out.println("\n== Vehículos del año 2025 ==");
        for (Coche c : coches) {
            if (c.getAnio() == 2025) {
                c.mostrar_info();
                System.out.println("-------------------");
            }
        }
        for (Moto m : motos) {
            if (m.getAnio() == 2025) {
                m.mostrar_info();
                System.out.println("-------------------");
            }
        }
    }
}
