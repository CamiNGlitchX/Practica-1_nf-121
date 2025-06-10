import pickle
import os

class Cliente:
    def __init__(self, id, nombre, telefono):
        self.id = id
        self.nombre = nombre
        self.telefono = telefono

    def __str__(self):
        return f"Cliente [ID={self.id}, Nombre={self.nombre}, Teléfono={self.telefono}]"

class ArchivoCliente:
    def __init__(self, nomA):
        self.nomA = nomA

    def crear_archivo(self):
        try:
            with open(self.nomA, 'wb') as f:
                pickle.dump([], f)
        except IOError as e:
            print(f"Error al crear archivo: {e}")

    def guardar_cliente(self, cliente):
        lista = self._leer_clientes()
        lista.append(cliente)
        try:
            with open(self.nomA, 'wb') as f:
                pickle.dump(lista, f)
        except IOError as e:
            print(f"Error al guardar cliente: {e}")

    def buscar_cliente(self, id):
        lista = self._leer_clientes()
        for cliente in lista:
            if cliente.id == id:
                return cliente
        return None

    def buscar_celular_cliente(self, telefono):
        lista = self._leer_clientes()
        for cliente in lista:
            if cliente.telefono == telefono:
                return cliente
        return None

    def _leer_clientes(self):
        if not os.path.exists(self.nomA):
            return []
        try:
            with open(self.nomA, 'rb') as f:
                return pickle.load(f)
        except (EOFError, IOError, pickle.UnpicklingError) as e:
            print(f"Error leyendo clientes: {e}")
            return []

def main():
    archivo = ArchivoCliente("clientes.dat")
    archivo.crear_archivo()

    while True:
        print("\n--- Menú Clientes ---")
        print("1. Guardar cliente")
        print("2. Buscar cliente por ID")
        print("3. Buscar cliente por teléfono")
        print("4. Salir")
        try:
            opcion = int(input("Elige una opción: "))
        except ValueError:
            print("Entrada inválida. Intenta de nuevo.")
            continue

        if opcion == 1:
            try:
                id = int(input("ID: "))
                nombre = input("Nombre: ")
                telefono = int(input("Teléfono: "))
                cliente = Cliente(id, nombre, telefono)
                archivo.guardar_cliente(cliente)
                print("Cliente guardado.")
            except ValueError:
                print("Datos inválidos, intenta de nuevo.")
        elif opcion == 2:
            try:
                buscar_id = int(input("ID a buscar: "))
                cliente = archivo.buscar_cliente(buscar_id)
                if cliente:
                    print("Cliente encontrado:", cliente)
                else:
                    print("Cliente no encontrado.")
            except ValueError:
                print("Entrada inválida.")
        elif opcion == 3:
            try:
                buscar_tel = int(input("Teléfono a buscar: "))
                cliente = archivo.buscar_celular_cliente(buscar_tel)
                if cliente:
                    print("Cliente encontrado:", cliente)
                else:
                    print("Cliente no encontrado.")
            except ValueError:
                print("Entrada inválida.")
        elif opcion == 4:
            print("Saliendo...")
            break
        else:
            print("Opción inválida, intenta de nuevo.")

if __name__ == "__main__":
    main()
