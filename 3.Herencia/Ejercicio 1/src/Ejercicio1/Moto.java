package Ejercicio1;

public class Moto extends Vehiculo {
    private int cilindrada;
    private String tipoMotor;

    public Moto(String marca, String modelo, int anio, int precioBase, int cilindrada, String tipoMotor) {
        super(marca, modelo, anio, precioBase);
        this.cilindrada = cilindrada;
        this.tipoMotor = tipoMotor;
    }
    
    public int getCilindrada() { return cilindrada; }
    public void setCilindrada(int cilindrada) { this.cilindrada = cilindrada; }

    public String getTipoMotor() { return tipoMotor; }
    public void setTipoMotor(String tipoMotor) { this.tipoMotor = tipoMotor; }

    @Override
    public void mostrar_info() {
        super.mostrar_info();
        System.out.println("Cilindrada: " + cilindrada +
                           "\nTipo de motor: " + tipoMotor);
    }

}