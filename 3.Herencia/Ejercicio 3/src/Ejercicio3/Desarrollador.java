package Ejercicio3;

public class Desarrollador extends Empleado{
	private String lenguajeProgramacion;
    private int horasExtras;

    public Desarrollador(String nombre, String apellido, int salarioBase, int aniosAntiguo,
                         String lenguajeProgramacion, int horasExtras) {
        super(nombre, apellido, salarioBase, aniosAntiguo);
        this.lenguajeProgramacion = lenguajeProgramacion;
        this.horasExtras = horasExtras;
    }

    public String getLenguajeProgramacion() {
        return lenguajeProgramacion;
    }

    public void setLenguajeProgramacion(String lenguajeProgramacion) {
        this.lenguajeProgramacion = lenguajeProgramacion;
    }

    public int getHorasExtras() {
        return horasExtras;
    }

    public void setHorasExtras(int horasExtras) {
        this.horasExtras = horasExtras;
    }

    @Override
    public String calcularSalario() {
        double salarioBaseConBono = super.obtenerSalarioConBono();
        double pagoHorasExtras = horasExtras * 50; 
        double salarioTotal = salarioBaseConBono + pagoHorasExtras;

        return String.format("El salario total del desarrollador con horas extras es de: %.2f", salarioTotal);
    }
}
