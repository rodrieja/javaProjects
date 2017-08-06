package observerPattern;

import cartas.Bruja;
import cartas.Caballero;
import cartas.Duendes;
import cartas.Esqueletos;

public class Main {

	public static void main(String[] args) {
		Generador generador = new Generador();
		Baraja baraja = new Baraja();

		baraja.add(new Esqueletos(generador));
		baraja.add(new Duendes(generador));
		baraja.add(new Bruja(generador));
		baraja.add(new Caballero(generador));

		generador.start();

		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		generador.stop();

	}

}
