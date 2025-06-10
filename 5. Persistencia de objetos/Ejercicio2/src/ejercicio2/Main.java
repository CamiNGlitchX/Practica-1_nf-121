package ejercicio2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArchivoCliente archivo = new ArchivoCliente("clientes.dat");
        archivo.crearArchivo();

        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n--- Menú Clientes ---");
            System.out.println("1. Guardar cliente");
            System.out.println("2. Buscar cliente por ID");
            System.out.println("3. Buscar cliente por teléfono");
            System.out.println("4. Salir");
            System.out.print("Elige una opción: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Nombre: ");
                    String nombre = sc.nextLine();
                    System.out.print("Teléfono: ");
                    int telefono = sc.nextInt();
                    sc.nextLine();
                    archivo.guardarCliente(new Cliente(id, nombre, telefono));
                    System.out.println("Cliente guardado.");
                    break;

                case 2:
                    System.out.print("ID a buscar: ");
                    int buscarId = sc.nextInt();
                    sc.nextLine();
                    Cliente c1 = archivo.buscarCliente(buscarId);
                    if (c1 != null) {
                        System.out.println("Cliente encontrado: " + c1);
                    } else {
                        System.out.println("Cliente no encontrado.");
                    }
                    break;

                case 3:
                    System.out.print("Teléfono a buscar: ");
                    int buscarTel = sc.nextInt();
                    sc.nextLine();
                    Cliente c2 = archivo.buscarCelularCliente(buscarTel);
                    if (c2 != null) {
                        System.out.println("Cliente encontrado: " + c2);
                    } else {
                        System.out.println("Cliente no encontrado.");
                    }
                    break;

                case 4:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción inválida, intenta de nuevo.");
            }
        } while (opcion != 4);

        sc.close();
    }
}