package cartas;

import observerPattern.Carta;
import observerPattern.ElixirSubject;

public class Esqueletos extends Carta {
	public Esqueletos(ElixirSubject subject) {
		super(subject);
		
		elixirNecesario = 1;
		nombre = "Esqueletos";
	}
}
