package arrays;

public class ReadArrayValues {
	public static void main(String[] args) {
		int[] arrayInt1 = new int[9];
		arrayInt1[0] = 11;
		arrayInt1[1] = 24;
		arrayInt1[2] = 33;
		arrayInt1[3] = 45;
		arrayInt1[4] = 57;
		for (int i = 0; i < arrayInt1.length; i++) {
			System.out.printf("%5d%8d%n", i, arrayInt1[i]);
		}
		
		System.out.println();
		
		int[] arrayInt2 = { 32, 27, 64, 18, 95, 14, 90, 70, 60, 37 };
		for (int i = 0; i < arrayInt2.length; i++) {
			System.out.printf("%5d%8d%n", i, arrayInt2[i]);
		}
	}
}
