package observerPattern;

public interface ElixirSubject {
	public void registerObserver(ElixirObserver observer);

	public void removeObserver(ElixirObserver observer);

	public void notifyObservers();
}
