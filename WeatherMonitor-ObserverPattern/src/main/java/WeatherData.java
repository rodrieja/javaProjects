import java.util.ArrayList;

public class WeatherData implements Subject {
	ArrayList<Observer> observerList;

	float temp;
	float humidity;
	float pressure;

	public WeatherData() {
		observerList = new ArrayList<Observer>();
	}

	public void registerObserver(Observer observer) {
		observerList.add(observer);

	}

	public void removeObserver(Observer observer) {
		int index = observerList.indexOf(observer);
		if (index > 0) {
			observerList.remove(index);
		}
	}

	public void notifyObservers() {
		for (Observer observer : observerList) {
			observer.update(temp, humidity, pressure);
		}
	}

	public void measurementsChanged() {
		notifyObservers();
	}

	public void setMeasurements(float temp, float humidity, float pressure) {
		this.temp = temp;
		this.humidity=humidity;
		this.pressure= pressure;
		
		this.measurementsChanged();
	}
}
