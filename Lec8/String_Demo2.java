package Lec8;

public class String_Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Hello";
		String s2 = "Hello";
		String s3 = new String("Hello");
		String s4 = new String("Hello");
		s1 = s1 + "Bye";// s1=s1.concat("Bye");
		s2 = s3 + s4;
		String s5 = "Hello" + "Bye";
	}

}
