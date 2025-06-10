package Ejercicio2;

import java.time.LocalDate;

public class Docente extends Persona {
    private int nit;
    private String profesion;
    private String especialidad;

    public Docente(int ci, String nombre, String apellido, int celular, LocalDate fechaNac, char sexo,
                   int nit, String profesion, String especialidad) {
        super(ci, nombre, apellido, celular, fechaNac, sexo); // incluye 'sexo'
        this.nit = nit;
        this.profesion = profesion;
        this.especialidad = especialidad;
    }


	public int getNit() {return nit;}

	public void setNit(int nit) {this.nit = nit;}

	public String getProfesion() {return profesion;}

	public void setProfesion(String profesion) {this.profesion = profesion;}

	public String getEspecialidad() {return especialidad;}

	public void setEspecialidad(String especialidad) {this.especialidad = especialidad;}
	
	@Override
	public void mostrar() {
		super.mostrar();
		System.out.println("El nit es: "+nit+
				"\nLa profesion es: "+profesion+
				"\nLa especialidad es: "+especialidad);
	}
	
}
