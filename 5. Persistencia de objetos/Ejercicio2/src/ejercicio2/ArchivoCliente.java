package ejercicio2;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

class ArchivoCliente {
    private String nomA;

    public ArchivoCliente(String nomA) {
        this.nomA = nomA;
    }

    public void crearArchivo() {
        ObjectOutputStream out = null;
        try {
            out = new ObjectOutputStream(new FileOutputStream(nomA));
            out.writeObject(new ArrayList<Cliente>());
        } catch (IOException e) {
            System.out.println("Error al crear archivo: " + e.getMessage());
        } finally {
            try {
                if (out != null) out.close();
            } catch (IOException e) {
                System.out.println("Error cerrando archivo: " + e.getMessage());
            }
        }
    }

    public void guardarCliente(Cliente c) {
        ArrayList<Cliente> lista = leerClientes();
        lista.add(c);
        ObjectOutputStream out = null;
        try {
            out = new ObjectOutputStream(new FileOutputStream(nomA));
            out.writeObject(lista);
        } catch (IOException e) {
            System.out.println("Error al guardar cliente: " + e.getMessage());
        } finally {
            try {
                if (out != null) out.close();
            } catch (IOException e) {
                System.out.println("Error cerrando archivo: " + e.getMessage());
            }
        }
    }

    public Cliente buscarCliente(int id) {
        ArrayList<Cliente> lista = leerClientes();
        for (Cliente c : lista) {
            if (c.getId() == id) return c;
        }
        return null;
    }

    public Cliente buscarCelularCliente(int telefono) {
        ArrayList<Cliente> lista = leerClientes();
        for (Cliente c : lista) {
            if (c.getTelefono() == telefono) return c;
        }
        return null;
    }

    @SuppressWarnings("unchecked")
    private ArrayList<Cliente> leerClientes() {
        ObjectInputStream in = null;
        try {
            in = new ObjectInputStream(new FileInputStream(nomA));
            return (ArrayList<Cliente>) in.readObject();
        } catch (EOFException e) {
            return new ArrayList<>();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error leyendo clientes: " + e.getMessage());
            return new ArrayList<>();
        } finally {
            try {
                if (in != null) in.close();
            } catch (IOException e) {
                System.out.println("Error cerrando archivo: " + e.getMessage());
            }
        }
    }
}
