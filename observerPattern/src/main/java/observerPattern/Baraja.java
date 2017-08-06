package observerPattern;

import java.util.ArrayList;

import cartas.Esqueletos;

public class Baraja implements CardObserver {
	ArrayList<Carta> cartas;

	public Baraja() {
		cartas = new ArrayList<Carta>();
	}

	public void add(Carta carta) {
		this.cartas.add(carta);
		carta.registerObserver(this);
	}

	public void update(Carta carta) {
		System.out.println(carta.getNombre() + " está disponible");
	}

}
