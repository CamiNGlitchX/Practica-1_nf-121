package Ejercicio3;

import java.util.Scanner;

public class MainFarmacia {
    public static void main(String[] args) {
        ArchFarmacia archivo = new ArchFarmacia("farmacias.dat");
        archivo.crearArchivo();

        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n--- Menú Farmacia ---");
            System.out.println("1. Añadir farmacia con medicamentos");
            System.out.println("2. Mostrar medicamentos para la tos de sucursal X");
            System.out.println("3. Mostrar sucursal y dirección que tienen el medicamento 'Golpex'");
            System.out.println("4. Salir");
            System.out.print("Elige una opción: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Nombre farmacia: ");
                    String nombreFarmacia = sc.nextLine();
                    System.out.print("Número de sucursal: ");
                    int sucursal = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Dirección: ");
                    String direccion = sc.nextLine();

                    Farmacia farmacia = new Farmacia(nombreFarmacia, sucursal, direccion);

                    System.out.print("¿Cuántos medicamentos quieres agregar? ");
                    int cantMed = sc.nextInt();
                    sc.nextLine();

                    for (int i = 0; i < cantMed; i++) {
                        System.out.println("Medicamento " + (i+1));
                        System.out.print("Nombre: ");
                        String nombreMed = sc.nextLine();
                        System.out.print("Código Medicamento: ");
                        String codMed = sc.nextLine();
                        System.out.print("Tipo: ");
                        String tipoMed = sc.nextLine();
                        System.out.print("Precio: ");
                        float precioMed = sc.nextFloat();
                        sc.nextLine();

                        Medicamento med = new Medicamento(nombreMed, codMed, tipoMed, precioMed);
                        farmacia.adicionarMedicamento(med);
                    }

                    archivo.adicionarFarmacia(farmacia);
                    System.out.println("Farmacia y medicamentos guardados.");
                    break;

                case 2:
                    System.out.print("Número de sucursal para buscar medicamentos para tos: ");
                    int sucursalBuscada = sc.nextInt();
                    sc.nextLine();
                    archivo.mostrarMedicamentosParaTos(sucursalBuscada);
                    break;

                case 3:
                    archivo.mostrarSucursalConMedicamento("Golpex");
                    break;

                case 4:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción inválida. Intenta de nuevo.");
            }
        } while (opcion != 4);

        sc.close();
    }
}
