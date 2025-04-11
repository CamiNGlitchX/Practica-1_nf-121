package Ejercicio_2;

public class Main_Restaurante {

	public static void main(String[] args) {
		
		System.out.println("Plantel de cocineros");
		Cocinero cocinero1 = new Cocinero("MAtilda", 5000, 25, 3);
		System.out.println();
		cocinero1.info("Matilda");
		cocinero1.mostrar();
		
		System.out.println(        );
		
		System.out.println("Plantel de meseros");
		Mesero mesero1 = new Mesero("Amira", 3500, 1, 5, 2);
		mesero1.info("Amira");
		mesero1.mostrar();
		
		Mesero mesero2 = new Mesero("Mike", 3500, 1, 5, 3);
		mesero2.info("Mike");
		mesero2.mostrar();
		
		System.out.println(        );
		
		System.out.println("Plantel de administrativos");
		Administrativo admin1 = new Administrativo("Emilia", 4000, "Supervisora");
		admin1.info("Emilia");
		admin1.mostrar();
		Administrativo admin2 = new Administrativo("Erika", 4000, "Gestor capacitor");
		admin2.info("Erika");
		admin2.mostrar();
		
		System.out.println("Busqueda de empleados con: 5000");
		cocinero1.mostrar(5000);
		mesero1.mostrar(5000);
		mesero2.mostrar(5000);
		admin1.mostrar(5000);
		admin2.mostrar(5000);
	}

}
