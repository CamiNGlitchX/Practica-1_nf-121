package Ejercicio2;

import java.time.LocalDate;

public class Estudiante extends Persona{
	private int ru;
	private LocalDate fechaIngreso;
	private int semestre;
	
	public Estudiante(int ci, String nombre, String apellido, int celular, LocalDate fechaNac, char sexo,
            int ru, LocalDate fechaIngreso, int semestre) {
		super(ci, nombre, apellido, celular, fechaNac, sexo); // llama al constructor de Persona
		this.ru = ru;
		this.fechaIngreso = fechaIngreso;
		this.semestre = semestre;
	}

	public int getRu() {return ru;}

	public void setRu(int ru) {this.ru = ru;}

	public LocalDate getFechaIngreso() {return fechaIngreso;}

	public void setFechaIngreso(LocalDate fechaIngreso) {this.fechaIngreso = fechaIngreso;}

	public int getSemestre() {return semestre;}

	public void setSemestre(int semestre) {this.semestre = semestre;}
	
	@Override
	public void mostrar() {
		super.mostrar();
		System.out.println("El ru es: "+ru+
				"\nLafecha de ingreso es: "+fechaIngreso+
				"\nEl semestre es: "+semestre);
	}
	
}
