package polymorphism;

public class Fish extends Animal {
	private int fins;
	
	public Fish() {
		super();
		fins = 2;
		type = "Fish";
	}

	public int getFins() {
		return fins;
	}

	public void setFins(int fins) {
		this.fins = fins;
	}

	@Override
	public void move() {
		System.out.println("The Fish is swimming!!!");
	}
}
