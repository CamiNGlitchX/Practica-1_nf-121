package Ejercicio2;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;

public class App {

	public static void main(String[] args) {
		ArrayList<Estudiante> estudiantes = new ArrayList<>();

		estudiantes.add(new Estudiante(1, "Carla", "Apaza", 12345678, LocalDate.of(1995, 5, 10), 'F', 1001, LocalDate.of(2020, 2, 1), 6));
		estudiantes.add(new Estudiante(2, "Amira", "Rios", 87654321, LocalDate.of(2003, 10, 5), 'F', 1002, LocalDate.of(2022, 3, 15), 3));
		estudiantes.add(new Estudiante(3, "Luis", "Fernandez", 76543210, LocalDate.of(1998, 7, 20), 'M', 1003, LocalDate.of(2019, 8, 10), 7));
		estudiantes.add(new Estudiante(4, "Marta", "Gonzales", 65432109, LocalDate.of(2000, 1, 15), 'F', 1004, LocalDate.of(2021, 1, 20), 4));
		estudiantes.add(new Estudiante(5, "Jorge", "Apaza", 54321098, LocalDate.of(1990, 12, 30), 'M', 1005, LocalDate.of(2010, 5, 5), 10));
	
		System.out.println("----------LISTA DE ESTUDIANTES----------");
		for (Estudiante est : estudiantes) {
			est.mostrar();
			System.out.println();
		}
		
		ArrayList<Docente> docentes = new ArrayList<>();
		docentes.add(new Docente(101, "Carlos", "Ramos", 71234567, LocalDate.of(1978, 3, 15), 'M', 501, "Ingeniero", "Sistemas"));
		docentes.add(new Docente(102, "Lucía", "Fernandez", 72345678, LocalDate.of(1985, 6, 20), 'F', 502, "Licenciada", "Educación"));
		docentes.add(new Docente(103, "Miguel", "Soto", 73456789, LocalDate.of(1990, 9, 10), 'M', 503, "Ingeniero", "Electrónica"));
		docentes.add(new Docente(104, "Daniel", "Ramos", 74567890, LocalDate.of(1965, 12, 5), 'M', 504, "Doctor", "Matemáticas"));

		System.out.println("----------LISTA DE DOCENTES----------");
		for (Docente doc : docentes) {
			doc.mostrar();
			System.out.println();
		}
		
	for (Estudiante e : estudiantes) {
		LocalDate nacimiento = e.getFechaNaci();
	    int edad = Period.between(nacimiento, LocalDate.now()).getYears();
	    
	    if (edad > 25) {
	    	System.out.println("--------Estudiante mayor a 25 años: ");
	    	e.mostrar();
	    	System.out.println("Edad: "+edad);
	    }
	}
	
	System.out.println();
	
	Docente docenteMayor = null;
	int edadMayor = -1;

	for (Docente d : docentes) {
	    if (d.getProfesion().equalsIgnoreCase("Ingeniero") && d.getSexo() == 'M') {
	        int edad = Period.between(d.getFechaNaci(), LocalDate.now()).getYears();
	        if (edad > edadMayor) {
	            edadMayor = edad;
	            docenteMayor = d;
	        }
	    }
	}

	if (docenteMayor != null) {
	    System.out.println("El docente ingeniero masculino de mayor edad es:");
	    docenteMayor.mostrar();
	    System.out.println("Edad: " + edadMayor);
	}

	System.out.println();
	
	for (Estudiante est : estudiantes) {
	    for (Docente doc : docentes) {
	        if (est.getApellido().equalsIgnoreCase(doc.getApellido())) {
	            System.out.println("Coincidencia de apellido: " + est.getApellido());
	            System.out.println("Estudiante:");
	            est.mostrar();
	            System.out.println("Docente:");
	            doc.mostrar();
	            System.out.println("-----------------------------------");
	        }
	    }
	}

	
	}

}
