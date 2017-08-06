package cartas;

import observerPattern.Carta;
import observerPattern.ElixirSubject;

public class Duendes extends Carta {
	public Duendes(ElixirSubject subject) {
		super(subject);
		
		elixirNecesario = 2;
		nombre = "Duendes";
	}
}
