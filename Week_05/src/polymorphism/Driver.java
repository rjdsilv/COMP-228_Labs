package polymorphism;

import java.util.ArrayList;

public class Driver {
	public static void main(String[] args) {
		ArrayList<Animal> animalList = new ArrayList<>();
		animalList.add(new Dog());
		animalList.add(new Fish());
		animalList.add(new Bird());
		MovementService.makeItMove(animalList);
	}
}
