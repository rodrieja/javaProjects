package cartas;

import observerPattern.Carta;
import observerPattern.ElixirSubject;

public class Bruja extends Carta {
	public Bruja(ElixirSubject subject) {
		super(subject);
		
		elixirNecesario = 5;
		nombre = "Bruja";
	}
}
