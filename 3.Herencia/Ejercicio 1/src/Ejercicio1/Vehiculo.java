package Ejercicio1;

public class Vehiculo {
	private String marca;
	private String modelo;
	private int anio;
	private int precioBase;
	
	public Vehiculo(String marca, String modelo, int anio, int precioBase) {
		this.marca = marca;
		this.modelo = modelo;
		this.anio = anio;
		this.precioBase = precioBase;
	}

	public String getMarca() {return marca;}

	public void setMarca(String marca) {this.marca = marca;}

	public String getModelo() {return modelo;}

	public void setModelo(String modelo) {this.modelo = modelo;}

	public int getAnio() {return anio;}

	public void setAnio(int anio) {	this.anio = anio;}

	public int getPrecioBase() {return precioBase;}

	public void setPrecioBase(int precioBase) {this.precioBase = precioBase;}
	
	public void mostrar_info() {
        System.out.println("Marca: " + marca +
                           "\nModelo: " + modelo +
                           "\nAño: " + anio +
                           "\nPrecio base: " + precioBase);
    }
}
