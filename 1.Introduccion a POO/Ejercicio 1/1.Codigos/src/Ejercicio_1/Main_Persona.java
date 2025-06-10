package Ejercicio_1;

public class Main_Persona {

	public static void main(String[] args) {
		Persona persona1 = new Persona("Amy", 23, "Suiza");
		Persona persona2 = new Persona("Sandy", 16, "Espania");
		Persona persona3 = new Persona("Emilia", 30, "Francia");
		
		persona1.saludar();
		persona1.mayor();
		
		System.out.println(   );
		
		persona2.saludar();
		persona2.mayor();
		
		System.out.println(   );
		
		persona3.saludar();
		persona3.mayor();
	}
}