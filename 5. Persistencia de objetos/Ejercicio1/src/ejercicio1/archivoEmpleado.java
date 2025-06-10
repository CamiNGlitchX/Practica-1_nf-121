package ejercicio1;

import java.io.*;
import java.util.ArrayList;

public class archivoEmpleado {
    private String nomA;

    public archivoEmpleado(String nomA) {
        this.nomA = nomA;
    }

    public void crearArchivo() {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(nomA))) {
            out.writeObject(new ArrayList<Empleado>());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void guardarEmpleado(Empleado e) {
        ArrayList<Empleado> lista = leerEmpleados();
        lista.add(e);
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(nomA))) {
            out.writeObject(lista);
        } catch (IOException e1) {
            e1.printStackTrace();
        }
    }

    public Empleado buscaEmpleado(String nombre) {
        ArrayList<Empleado> lista = leerEmpleados();
        for (Empleado e : lista) {
            if (e.getNombre().equalsIgnoreCase(nombre)) {
                return e;
            }
        }
        return null;
    }

    public Empleado mayorSalario(float salarioRef) {
        ArrayList<Empleado> lista = leerEmpleados();
        for (Empleado e : lista) {
            if (e.getSalario() > salarioRef) {
                return e;
            }
        }
        return null;
    }

    private ArrayList<Empleado> leerEmpleados() {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(nomA))) {
            return (ArrayList<Empleado>) in.readObject();
        } catch (EOFException eof) {
            return new ArrayList<>();
        } catch (IOException | ClassNotFoundException e) {
            return new ArrayList<>();
        }
    }
}
