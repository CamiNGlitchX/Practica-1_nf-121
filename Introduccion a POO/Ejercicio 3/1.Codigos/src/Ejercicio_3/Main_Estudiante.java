package Ejercicio_3;

public class Main_Estudiante {

	public static void main(String[] args) {
		Estudiante estudiante1 = new Estudiante("Nicca", 9, 7);
		Estudiante estudiante2 = new Estudiante("Liz", 4, 10);
		Estudiante estudiante3 = new Estudiante("Missy", 2, 5);
		
		estudiante1.aprobo();
		estudiante1.calcProm();
		
		estudiante2.aprobo();
		estudiante2.calcProm();
		
		estudiante3.aprobo();
		estudiante3.calcProm();
	}

}
