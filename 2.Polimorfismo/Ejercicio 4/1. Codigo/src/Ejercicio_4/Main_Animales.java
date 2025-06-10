package Ejercicio_4;

public class Main_Animales {

	public static void main(String[] args) {

				
		Perro perro1 = new Perro("Jack", 3, "Chapi");
		Gato gato1 = new Gato("Pelusa", "Blanco");
		Pajaro pajaro1 = new Pajaro ("Connie", "pajaro");
		
		System.out.println("Que sonido emite el perro?");
		perro1.hacerSonido("ladra");
		perro1.hacerSonido();
		perro1.moverse();
		
		System.out.println();
		
		System.out.println("Que sonido emite el gato?");
		gato1.hacerSonido("maulla");
		gato1.hacerSonido();
		gato1.moverse();
		
		System.out.println();
		
		System.out.println("Que sonido emite el pajaro?");
		pajaro1.hacerSonido("silvidos");
		pajaro1.hacerSonidos();
		pajaro1.moverse();
	}

}
