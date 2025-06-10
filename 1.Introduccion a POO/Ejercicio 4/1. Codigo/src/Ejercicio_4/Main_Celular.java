package Ejercicio_4;

public class Main_Celular {

	public static void main(String[] args) {
		Celular celular1 = new Celular();
		
		celular1.instalarApp("WhatsApp", 50);
		celular1.instalarApp("Tik Tok", 150);
		celular1.instalarApp("Brawl Stars", 300);
		
		System.out.println(  );
		
		celular1.usarApp("WhatsApp", 30);
		celular1.usarApp("Tik Tok", 20);
		celular1.usarApp("Brawl Stars", 40);
		celular1.usarApp("Minecraft", 500);
	}

}
