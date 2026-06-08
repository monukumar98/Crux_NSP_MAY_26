package Lec4;

public class Funtions_Demo3 {
	static int val = 100;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hey");
		int a = 8;
		int b = 7;
		System.out.println(val);
		System.out.println(addition(a, b));
		System.out.println(val);
		System.out.println("Bye");
	}

	public static int addition(int a, int b) {

		int c = a + b;
		int val = 80;
		Funtions_Demo3.val = Funtions_Demo3.val - 5;
		return c + sub(c, b);

	}

	public static int sub(int a, int b) {

		int c = a - b;
		return c;

	}

}
