class Persona:
    def __init__(self, nombre, edad, ciudad):
        self.nombre = nombre
        self.edad = edad
        self.ciudad = ciudad 

    def saludo(self):
        return f"Hola, soy {self.nombre} de {self.ciudad}" 

    def verificacionEdad(self):
        if self.edad >= 18:
            return "Es mayor de edad"
        else:
            return "Es menor de edad"

persona1 = Persona("Amy", 16, "Argentina")
print(persona1.saludo())
print(persona1.verificacionEdad())  

print()

persona2 = Persona("America", 18, "Rusia")
print(persona2.saludo())
print(persona2.verificacionEdad())

print()

persona3 = Persona("Mimica", 30, "Brasil")
print(persona3.saludo())
print(persona3.verificacionEdad())