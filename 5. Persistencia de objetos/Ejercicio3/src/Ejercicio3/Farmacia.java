package Ejercicio3;

import java.io.Serializable;

class Farmacia implements Serializable {
    private static final long serialVersionUID = 1L;

    private String nombreFarmacia;
    private int sucursal;
    private String direccion;
    private Medicamento[] m;
    private int numMedicamentos;

    public Farmacia(String nombreFarmacia, int sucursal, String direccion) {
        this.nombreFarmacia = nombreFarmacia;
        this.sucursal = sucursal;
        this.direccion = direccion;
        this.m = new Medicamento[100];
        this.numMedicamentos = 0;
    }

    public void adicionarMedicamento(Medicamento med) {
        if (numMedicamentos < 100) {
            m[numMedicamentos++] = med;
        } else {
            System.out.println("Máximo de medicamentos alcanzado en esta farmacia.");
        }
    }

    public void mostrarMedicamentos() {
        System.out.println("Medicamentos en farmacia: " + nombreFarmacia + " - Sucursal: " + sucursal);
        for (int i = 0; i < numMedicamentos; i++) {
            System.out.println(m[i]);
        }
    }

    public void mostrarMedicamentosTipo(String tipoBuscado) {
        System.out.println("Medicamentos tipo '" + tipoBuscado + "' en sucursal " + sucursal);
        boolean encontrados = false;
        for (int i = 0; i < numMedicamentos; i++) {
            if (m[i].getTipo().equalsIgnoreCase(tipoBuscado)) {
                System.out.println(m[i]);
                encontrados = true;
            }
        }
        if (!encontrados) System.out.println("No hay medicamentos de ese tipo.");
    }

    public boolean tieneMedicamento(String nombreMedicamento) {
        for (int i = 0; i < numMedicamentos; i++) {
            if (m[i].getNombre().equalsIgnoreCase(nombreMedicamento)) return true;
        }
        return false;
    }

    public int getSucursal() { return sucursal; }
    public String getDireccion() { return direccion; }
}
