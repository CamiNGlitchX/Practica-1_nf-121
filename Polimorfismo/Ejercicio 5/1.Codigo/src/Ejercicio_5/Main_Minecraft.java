package Ejercicio_5;

public class Main_Minecraft {

	public static void main(String[] args) {
		
		System.out.println("COFRES");
		Bloque bloqueCofre1 = new BloqueCofre(13, 3000, "Cofre solido");
		bloqueCofre1.accion();
		bloqueCofre1.colocar("pared");
		bloqueCofre1.colocar(242, 123, 765);
		bloqueCofre1.romper("Cofre solido");
		System.out.println();
		Bloque bloqueCofre2 = new BloqueCofre(20, 5500, "Cofre ender");
		bloqueCofre2.accion();
		bloqueCofre2.colocar("piso");
		bloqueCofre2.colocar(121, 23, 110);
		bloqueCofre2.romper("Cofre ender");
		
		System.out.println(         );
		
		System.out.println("TnT");
		Bloque bloqueTnT1 = new BloqueTnt ("TnT normal", 100);
		bloqueTnT1.accion();
		bloqueTnT1.colocar("techo");
		bloqueTnT1.colocar(570, 409, 680);
		bloqueTnT1.romper("TnT normal");
		System.out.println();
		Bloque bloqueTnT2 = new BloqueTnt ("TnT de agua", 500);
		bloqueTnT2.accion();
		bloqueTnT2.colocar("pared");
		bloqueTnT2.colocar(570, 450, 350);
		bloqueTnT2.romper("TnT de agua");
		
		System.out.println(         );
		
		System.out.println("HORNO");
		Bloque bloqueHorno1 = new BloqueHorno ("Textura encendida", 64);
		bloqueHorno1.accion();
		bloqueHorno1.colocar("piso");
		bloqueHorno1.colocar(120, 100, 90);
		bloqueHorno1.romper("Textura encendida");
		System.out.println();
		Bloque bloqueHorno2 = new BloqueHorno ("Textura apagado", 50);
		bloqueHorno2.accion();
		bloqueHorno1.colocar("pared");
		bloqueHorno1.colocar(120, 300, 190);
		bloqueHorno1.romper("Textura apagada");
	}

}
