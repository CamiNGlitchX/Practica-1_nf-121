package ejercicio1;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        archivoEmpleado archivo = new archivoEmpleado("empleados.dat");
        archivo.crearArchivo();

        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n--- Menú Empleados ---");
            System.out.println("1. Guardar empleado");
            System.out.println("2. Buscar empleado por nombre");
            System.out.println("3. Buscar empleado con salario mayor");
            System.out.println("4. Salir");
            System.out.print("Elige una opción: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Nombre: ");
                    String nombre = sc.nextLine();
                    System.out.print("Edad: ");
                    int edad = sc.nextInt();
                    System.out.print("Salario: ");
                    float salario = sc.nextFloat();
                    sc.nextLine(); 
                    archivo.guardarEmpleado(new Empleado(nombre, edad, salario));
                    System.out.println("Empleado guardado.");
                    break;

                case 2:
                    System.out.print("Nombre a buscar: ");
                    String buscarNombre = sc.nextLine();
                    Empleado encontrado = archivo.buscaEmpleado(buscarNombre);
                    if (encontrado != null) {
                        System.out.println("Empleado encontrado: " + encontrado);
                    } else {
                        System.out.println("Empleado no encontrado.");
                    }
                    break;

                case 3:
                    System.out.print("Salario de referencia: ");
                    float ref = sc.nextFloat();
                    sc.nextLine();
                    Empleado mayor = archivo.mayorSalario(ref);
                    if (mayor != null) {
                        System.out.println("Empleado con salario mayor: " + mayor);
                    } else {
                        System.out.println("No hay empleados con salario mayor a " + ref);
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
