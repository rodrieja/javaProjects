package observerPattern;

import java.util.ArrayList;

public class Carta implements CardSubject, ElixirObserver {
	protected int elixirNecesario;
	protected boolean disponible;
	protected String nombre;
	ArrayList<CardObserver> observers;

	public Carta(ElixirSubject subject) {
		observers = new ArrayList<CardObserver>();
		subject.registerObserver(this);
	}

	public void actualizar(int elixirDisponible) {
		if (elixirDisponible >= elixirNecesario) {
			disponible = true;
		} else {
			disponible = false;
		}
	}

	public boolean getDisponible() {
		return this.disponible;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void registerObserver(CardObserver observer) {
		observers.add(observer);

	}

	public void removeObserver(CardObserver observer) {
		observers.remove(observer);
	}

	public void notifyObservers() {
		for (CardObserver cardObserver : observers) {
			cardObserver.update(this);
		}
	}

	public void update(int elixir) {
		if (!disponible && elixir == elixirNecesario){
			disponible = true;
			notifyObservers();
		}
	}
}
