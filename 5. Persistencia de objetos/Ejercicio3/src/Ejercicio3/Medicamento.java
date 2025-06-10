package Ejercicio3;

import java.io.Serializable;

class Medicamento implements Serializable {
    private static final long serialVersionUID = 1L;

    private String nombre;
    private String codMedicamento;
    private String tipo;
    private float precio;

    public Medicamento(String nombre, String codMedicamento, String tipo, float precio) {
        this.nombre = nombre;
        this.codMedicamento = codMedicamento;
        this.tipo = tipo;
        this.precio = precio;
    }

    public String getNombre() { return nombre; }
    public String getTipo() { return tipo; }
    public float getPrecio() { return precio; }

    @Override
    public String toString() {
        return "Medicamento [Nombre=" + nombre + ", Código=" + codMedicamento + ", Tipo=" + tipo + ", Precio=" + precio + "]";
    }
}

