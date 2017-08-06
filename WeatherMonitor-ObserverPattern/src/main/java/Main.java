
public class Main {

	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();

		CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);

		weatherData.setMeasurements(25, 65, 30.4f);
	}

}
