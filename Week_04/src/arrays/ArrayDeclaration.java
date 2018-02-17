package arrays;

public class ArrayDeclaration {
	public static void main(String[] args) {
		int[] arrayInt1 = new int[9];
		arrayInt1[0] = 11;
		arrayInt1[0] = 24;
		arrayInt1[0] = 33;
		arrayInt1[0] = 45;
		arrayInt1[0] = 57;
		
		int[] arrayInt2 = { 32, 27, 64, 18, 95, 14, 90, 70, 60, 37 };
		System.out.println(arrayInt1.length);
		System.out.println(arrayInt2.length);
		System.out.println(arrayInt1);
		System.out.println(arrayInt2);
	}
}
