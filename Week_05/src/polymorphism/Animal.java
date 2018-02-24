package polymorphism;

public abstract class Animal {
	protected int eyes;
	protected String color;
	protected String type;

	protected Animal() {
		super();
	}

	public abstract void move();

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getEyes() {
		return eyes;
	}

	public void setEyes(int eyes) {
		this.eyes = eyes;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
}
