package static_things;

public class Driver {
	public static void main(String[] args) {
		System.out.println("What planet is your house on?\nAnswer: " + House.PLANET);
		House.provideDescription();
	}
}
