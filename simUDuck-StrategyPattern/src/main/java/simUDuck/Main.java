package simUDuck;

public class Main {

	public static void main(String[] args) {
		Duck mallard = new MallardDuck();
		mallard.display();
		mallard.quack();
		mallard.fly();
		
		Duck model = new ModelDuck();
		model.display();
		model.quack();
		model.fly();
		model.setFlyBehavoir(new FlyRocketPowered());
		model.fly();
	}

}
