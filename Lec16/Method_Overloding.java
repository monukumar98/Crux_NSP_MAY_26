package Lec16;

public class Method_Overloding {
	public static void main(String[] args) {
		System.out.println(add(3, 8));
		System.out.println(add(3, 8, 11));
		System.out.println(add(3, 8, 7.9));
		System.out.println(add(2, 2, 4, 3, 11, 2, 22, 2, 2, 45, 5, 6, 6, 9));

	}

	public static int add(int x, int y) {
		return x + y;
	}

	public static int add(int x, int y, int z) {
		return x + y + z;
	}

	public static int add(int x, int... a) {
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		return sum;
	}

	public static int add(int x, int y, double z) {
		return (int) (x + y + z);
	}
}
