package polymorphism;

import java.util.List;

public final class MovementService {
	public static void makeItMove(List<Animal> animal) {
		animal.forEach(a -> {
			if (a instanceof Fish) {
				System.out.printf("The Fish has %d fins!!!%n", ((Fish) a).getFins());
			}
			a.move();
		});
	}
}
