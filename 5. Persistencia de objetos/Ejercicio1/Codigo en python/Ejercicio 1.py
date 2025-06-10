import pickle
import os

class Empleado:
    def __init__(self, nombre, edad, salario):
        self.nombre = nombre
        self.edad = edad
        self.salario = salario

    def __str__(self):
        return f"Empleado: {self.nombre}, Edad: {self.edad}, Salario: {self.salario}"

class ArchivoEmpleado:
    def __init__(self, nomA):
        self.nomA = nomA

    def crear_archivo(self):
        try:
            with open(self.nomA, 'wb') as f:
                pickle.dump([], f)
        except IOError as e:
            print(f"Error creando archivo: {e}")

    def guardar_empleado(self, empleado):
        lista = self._leer_empleados()
        lista.append(empleado)
        try:
            with open(self.nomA, 'wb') as f:
                pickle.dump(lista, f)
        except IOError as e:
            print(f"Error guardando empleado: {e}")

    def busca_empleado(self, nombre):
        lista = self._leer_empleados()
        for e in lista:
            if e.nombre.lower() == nombre.lower():
                return e
        return None

    def mayor_salario(self, s):
        lista = self._leer_empleados()
        for e in lista:
            if e.salario > s:
                return e
        return None

    def _leer_empleados(self):
        if not os.path.exists(self.nomA):
            return []
        try:
            with open(self.nomA, 'rb') as f:
                return pickle.load(f)
        except EOFError:
            return []
        except (IOError, pickle.UnpicklingError) as e:
            print(f"Error leyendo empleados: {e}")
            return []

def main():
    archivo = ArchivoEmpleado("empleados.dat")
    archivo.crear_archivo()

    while True:
        print("\n--- Menú Empleados ---")
        print("1. Guardar empleado")
        print("2. Buscar empleado por nombre")
        print("3. Buscar empleado con salario mayor")
        print("4. Salir")
        opcion = input("Elige una opción: ")

        if opcion == '1':
            nombre = input("Nombre: ")
            try:
                edad = int(input("Edad: "))
                salario = float(input("Salario: "))
                archivo.guardar_empleado(Empleado(nombre, edad, salario))
                print("Empleado guardado.")
            except ValueError:
                print("Error: Edad o salario inválido.")

        elif opcion == '2':
            buscar_nombre = input("Nombre a buscar: ")
            encontrado = archivo.busca_empleado(buscar_nombre)
            if encontrado:
                print("Empleado encontrado:", encontrado)
            else:
                print("Empleado no encontrado.")

        elif opcion == '3':
            try:
                ref = float(input("Salario de referencia: "))
                mayor = archivo.mayor_salario(ref)
                if mayor:
                    print("Empleado con salario mayor:", mayor)
                else:
                    print(f"No hay empleados con salario mayor a {ref}")
            except ValueError:
                print("Error: Salario de referencia inválido.")

        elif opcion == '4':
            print("Saliendo...")
            break

        else:
            print("Opción inválida, intenta de nuevo.")

if __name__ == "__main__":
    main()
