package observerPattern;

public interface CardSubject {
	public void registerObserver(CardObserver observer);

	public void removeObserver(CardObserver observer);

	public void notifyObservers();
}
