package polymorphism;

public class Dog extends Animal {
	private int legs;

	public Dog() {
		super();
		legs = 4;
		type = "Dog";
	}

	public void setLegs(int legs) {
		this.legs = legs;
	}

	public int getLegs() {
		return legs;
	}

	@Override
	public void move() {
		System.out.println("The Dog is running!!!");
	}
}
