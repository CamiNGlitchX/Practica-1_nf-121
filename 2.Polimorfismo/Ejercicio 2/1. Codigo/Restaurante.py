class Administrativo:
    def __init__(self, nombre, sueldo_mes, cargo):
        self.nombre = nombre
        self.sueldo_mes = sueldo_mes
        self.cargo = cargo

    def info(self, nombre):
        print("Área de administración:", nombre)

    def mostrar(self, sueldoX=None):
        if sueldoX is None:
            print("Sueldo total transferido:", self.sueldo_mes)
        else:
            if self.sueldo_mes == sueldoX:
                print(f"Administrativo: {self.nombre} tiene sueldo igual a {sueldoX}")


class Cocinero:
    def __init__(self, nombre, sueldo_mes, horas_extra, sueldo_hora):
        self.nombre = nombre
        self.sueldo_mes = sueldo_mes
        self.horas_extra = horas_extra
        self.sueldo_hora = sueldo_hora

    def info(self, nombre):
        print("Área de cocina:", nombre)

    def mostrar(self, sueldoX=None):
        if sueldoX is None:
            print("Sueldo acumulado:", self.sueldo_mes)
            sueldo_total = self.sueldo_mes + (self.horas_extra * self.sueldo_hora)
            print("Sueldo total transferido:", sueldo_total)
        else:
            if self.sueldo_mes == sueldoX:
                print(f"Cocinero: {self.nombre} tiene sueldo igual a {sueldoX}")


class Mesero:
    def __init__(self, nombre, sueldo_mes, horas_extra, sueldo_hora, propina):
        self.nombre = nombre
        self.sueldo_mes = sueldo_mes
        self.horas_extra = horas_extra
        self.sueldo_hora = sueldo_hora
        self.propina = propina

    def info(self, nombre):
        print("Área de camareros:", nombre)

    def mostrar(self, sueldoX=None):
        if sueldoX is None:
            print("Sueldo acumulado:", self.sueldo_mes)
            sueldo_total = self.sueldo_mes + (self.horas_extra * self.sueldo_hora) + self.propina
            print("Sueldo total transferido:", sueldo_total)
        else:
            if self.sueldo_mes == sueldoX:
                print(f"Mesero: {self.nombre} tiene sueldo igual a {sueldoX}")


# -----------------------------
# MAIN (principal del programa)
# -----------------------------
print("Plantel de cocineros")
cocinero1 = Cocinero("Matilda", 5000, 25, 3)
print()
cocinero1.info("Matilda")
cocinero1.mostrar()

print()

print("Plantel de meseros")
mesero1 = Mesero("Amira", 3500, 1, 5, 2)
mesero1.info("Amira")
mesero1.mostrar()

mesero2 = Mesero("Mike", 3500, 1, 5, 3)
mesero2.info("Mike")
mesero2.mostrar()

print()

print("Plantel de administrativos")
admin1 = Administrativo("Emilia", 4000, "Supervisora")
admin1.info("Emilia")
admin1.mostrar()

admin2 = Administrativo("Erika", 4000, "Gestor capacitor")
admin2.info("Erika")
admin2.mostrar()

print()
print("Búsqueda de empleados con: 5000")
cocinero1.mostrar(5000)
mesero1.mostrar(5000)
mesero2.mostrar(5000)
admin1.mostrar(5000)
admin2.mostrar(5000)
