package simUDuck;

public abstract class Duck {
	protected QuackBehavior quackBehavior;
	protected FlyBehavior flyBehavior;

	public void quack() {
		quackBehavior.quack();
	}

	public void fly() {
		flyBehavior.fly();
	}

	public abstract void display();

	public void swim() {
		System.out.println("All duck swim.");
	}

	public void setFlyBehavoir(FlyBehavior fb) {
		this.flyBehavior = fb;
	}

	public void setQuackBehavior(QuackBehavior qb) {
		this.quackBehavior = qb;
	}
}
