package Lec4;

public class Funtions_Demo2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hey");
		int a = 8;
		int b = 7;
//		int ans=addition(a, b);
//		System.out.println(ans);
		System.out.println(addition(a, b));
		System.out.println("Bye");
	}

	public static int addition(int a, int b) {

		int c = a + b;
		return c + sub(c, b);

	}

	public static int sub(int a, int b) {

		int c = a - b;
		return c;

	}
}
