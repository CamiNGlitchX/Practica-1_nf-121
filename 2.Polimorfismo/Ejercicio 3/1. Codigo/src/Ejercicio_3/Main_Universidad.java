package Ejercicio_3;

public class Main_Universidad {

	public static void main(String[] args) {
		Oficina mueblesOfi1 = new Oficina (24, 12, 5);
		Oficina mueblesOfi2 = new Oficina (12, 6, 3);
		Aula mueblesAu1 = new Aula("Aula 3", 20, 10);
		Aula mueblesAu2 = new Aula("Aula 1", 20, 20);
		Laboratorio mueblesLabo = new Laboratorio ("Lab-quimica", 20, 10, 20);
		
		System.out.println("Informacion de la oficina 1 ");
		mueblesOfi1.mostrar();
		mueblesOfi1.cantidadMuebles();
		
		System.out.println("Busqueda por cantidades");
		System.out.println(mueblesOfi1.cantidadMuebles("sillas") + " sillas encontradas");
		System.out.println(mueblesOfi1.cantidadMuebles("mesas") + " mesas encontradas");
		System.out.println(mueblesOfi1.cantidadMuebles("escritorios") + " escritorios encontrados");
		
		System.out.println("-----------------------------------------------------------------");
		
		System.out.println("Informacion de la oficina 2");
		mueblesOfi2.mostrar();
		mueblesOfi2.cantidadMuebles();
		
		System.out.println("Busqueda por cantidades");
		System.out.println(mueblesOfi2.cantidadMuebles("sillas") + " sillas encontradas");
		System.out.println(mueblesOfi2.cantidadMuebles("mesas") + " mesas encontradas");
		System.out.println(mueblesOfi2.cantidadMuebles("escritorios") + " escritorios encontrados");
		
		System.out.println("-----------------------------------------------------------------");
		System.out.println("Informacion de la aula 1");
		mueblesAu1.mostrar();
		mueblesAu1.cantidadMuebles();
		
		System.out.println("Busqueda por cantidades");
		System.out.println(mueblesAu1.cantidadMuebles("sillas") + " sillas encontradas");
		System.out.println(mueblesAu1.cantidadMuebles("mesas") + " mesas encontradas");
		System.out.println(mueblesAu1.cantidadMuebles("escritorios") + " escritorios encontrados");
		
		System.out.println();
		
		System.out.println("Informacion de la aula 2");
		mueblesAu2.mostrar();
		mueblesAu2.cantidadMuebles();
		
		System.out.println("Busqueda por cantidades");
		System.out.println(mueblesAu2.cantidadMuebles("sillas") + " sillas encontradas");
		System.out.println(mueblesAu2.cantidadMuebles("mesas") + " mesas encontradas");
		System.out.println(mueblesAu2.cantidadMuebles("escritorios") + " escritorios encontrados");
		
		System.out.println("-----------------------------------------------------------------");
		
		System.out.println("Informacion del laboratorio");
		mueblesLabo.mostrar();
		mueblesLabo.cantidadMuebles();
		
		System.out.println("Busqueda por cantidades");
		System.out.println(mueblesLabo.cantidadMuebles("sillas") + " sillas encontradas");
		System.out.println(mueblesLabo.cantidadMuebles("mesas") + " mesas encontradas");
		System.out.println(mueblesLabo.cantidadMuebles("escritorios") + " escritorios encontrados");
		
		System.out.println();
	}
}