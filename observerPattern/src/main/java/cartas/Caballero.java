package cartas;

import observerPattern.Carta;
import observerPattern.ElixirSubject;

public class Caballero extends Carta {
	public Caballero(ElixirSubject subject) {
		super(subject);
		
		elixirNecesario = 3;
		nombre = "Caballero";
	}
}
