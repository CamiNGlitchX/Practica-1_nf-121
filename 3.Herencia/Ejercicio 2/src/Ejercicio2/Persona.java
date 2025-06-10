package Ejercicio2;

import java.time.LocalDate;
import java.time.Period;

public class Persona {
	private int ci;
	private String nombre;
	private String apellido;
	private int celular;
	private LocalDate fechaNac;
	private char sexo;
	
	public Persona(int ci, String nombre, String apellido, int celular, LocalDate fechaNac,char sexo) {
		this.ci = ci;
		this.nombre = nombre;
		this.apellido = apellido;
		this.celular = celular;
		this.fechaNac = fechaNac;
		this.sexo = sexo;
	}

	public int getCi() {return ci;}

	public void setCi(int ci) {this.ci = ci;}

	public String getNombre() {return nombre;}

	public void setNombre(String nombre) {this.nombre = nombre;}

	public String getApellido() {return apellido;}

	public void setApellido(String apellido) {this.apellido = apellido;}

	public int getCelular() {return celular;}

	public void setCelular(int celular) {this.celular = celular;}

	public LocalDate getFechaNaci() {return fechaNac;}

	public void setFechaNaci(int fechaNaci) {this.fechaNac = fechaNac;}
	
	public int getEdad() {return Period.between(fechaNac, LocalDate.now()).getYears();}
	
	public char getSexo() { return sexo; }
	public void setSexo(char sexo) { this.sexo = sexo; }
	
	public void mostrar() {
		System.out.println("El nombre es: "+nombre+
				"\nEl apellido es: "+apellido+
				"\nEl numero de celular es: "+celular+
				"\nLa fecha de nacimiento es: "+fechaNac);
	}
	
}
