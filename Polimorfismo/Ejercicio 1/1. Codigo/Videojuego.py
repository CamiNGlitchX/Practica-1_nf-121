class Videojuego:
    def __init__(self, nombre, plataforma="Steam", cant_jugadores=1):
        self.nombre = nombre
        self.plataforma = plataforma
        self.cant_jugadores = cant_jugadores
        self.jugadores = []

    @classmethod
    def solo_nombre(cls, nombre):
        return cls(nombre)

    def mostrar(self):
        print(f"El juego es {self.nombre} de la plataforma {self.plataforma} con {self.cant_jugadores} jugadores")

    def agregar(self, jugador):
        if isinstance(jugador, list):
            self.jugadores.extend(jugador)
            print("Se agregaron a los siguientes jugadores:", self.jugadores)
        else:
            self.jugadores.append(jugador)
            print("Se añadió al jugador:", jugador)

print("SALA PARA JUGADORES EN SOLITARIO")

juego1 = Videojuego.solo_nombre("Brawl Stars")
juego1.mostrar()
juego1.agregar("Nataniel")

print()
print("SALA PARA MULTIPLES JUGADORES")

juego2 = Videojuego("Roblox", "Prime Gaming", 5)
juego2.mostrar()

jugadores = ["Lisa", "Belen", "Juliet"]
juego2.agregar(jugadores)
