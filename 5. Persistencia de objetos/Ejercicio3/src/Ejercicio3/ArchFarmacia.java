package Ejercicio3;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

class ArchFarmacia {
    private String na;

    public ArchFarmacia(String na) {
        this.na = na;
    }

    public void crearArchivo() {
        ObjectOutputStream out = null;
        try {
            out = new ObjectOutputStream(new FileOutputStream(na));
            out.writeObject(new ArrayList<Farmacia>());
        } catch (IOException e) {
            System.out.println("Error creando archivo: " + e.getMessage());
        } finally {
            try {
                if (out != null) out.close();
            } catch (IOException e) {
                System.out.println("Error cerrando archivo: " + e.getMessage());
            }
        }
    }

    public void adicionarFarmacia(Farmacia f) {
        ArrayList<Farmacia> lista = leerFarmacias();
        lista.add(f);
        ObjectOutputStream out = null;
        try {
            out = new ObjectOutputStream(new FileOutputStream(na));
            out.writeObject(lista);
        } catch (IOException e) {
            System.out.println("Error guardando farmacia: " + e.getMessage());
        } finally {
            try {
                if (out != null) out.close();
            } catch (IOException e) {
                System.out.println("Error cerrando archivo: " + e.getMessage());
            }
        }
    }

    @SuppressWarnings("unchecked")
    private ArrayList<Farmacia> leerFarmacias() {
        ObjectInputStream in = null;
        try {
            in = new ObjectInputStream(new FileInputStream(na));
            return (ArrayList<Farmacia>) in.readObject();
        } catch (EOFException e) {
            return new ArrayList<>();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error leyendo archivo: " + e.getMessage());
            return new ArrayList<>();
        } finally {
            try {
                if (in != null) in.close();
            } catch (IOException e) {
                System.out.println("Error cerrando archivo: " + e.getMessage());
            }
        }
    }

    public void mostrarMedicamentosParaTos(int sucursalBuscada) {
        ArrayList<Farmacia> lista = leerFarmacias();
        boolean encontrados = false;
        for (Farmacia f : lista) {
            if (f.getSucursal() == sucursalBuscada) {
                f.mostrarMedicamentosTipo("tos");
                encontrados = true;
            }
        }
        if (!encontrados) {
            System.out.println("No se encontró sucursal con número " + sucursalBuscada);
        }
    }

    public void mostrarSucursalConMedicamento(String nombreMedicamento) {
        ArrayList<Farmacia> lista = leerFarmacias();
        boolean encontrados = false;
        for (Farmacia f : lista) {
            if (f.tieneMedicamento(nombreMedicamento)) {
                System.out.println("Sucursal: " + f.getSucursal() + ", Dirección: " + f.getDireccion());
                encontrados = true;
            }
        }
        if (!encontrados) {
            System.out.println("No hay sucursales con el medicamento '" + nombreMedicamento + "'");
        }
    }
}