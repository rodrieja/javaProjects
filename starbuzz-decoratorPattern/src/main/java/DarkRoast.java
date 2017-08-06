
public class DarkRoast extends Beverage {
	private double cost;

	public DarkRoast() {
		description = "DarkRoast";
		cost = 1.49;
	}
	
	@Override
	public double cost() {
		return cost;
	}

}
