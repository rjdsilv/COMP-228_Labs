package polymorphism;

public class Bird extends Animal {
	private int wings;

	public Bird() {
		super();
		type = "Bird";
		wings = 2;
	}

	public int getWings() {
		return wings;
	}

	public void setWings(int wings) {
		this.wings = wings;
	}

	@Override
	public void move() {
		System.out.println("The Bird is flying!!!");
	}
}
