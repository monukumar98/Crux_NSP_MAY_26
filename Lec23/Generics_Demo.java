package Lec23;

public class Generics_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] arr1 = { 10, 20, 30, 40, 50 };
		display(arr1);
		String[] arr2 = { "Raj", "Ankit", "Ankita", "Anku" };
		display(arr2);

	}

	public static <T> void display(T[] arr1) {

		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + " ");
		}
		System.out.println();
	}

	public static <T> T ger(T[] arr1) {
		return arr1[0];
	}

}
