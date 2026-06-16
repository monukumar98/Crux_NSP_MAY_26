package Lec8;
import java.util.*;
public class String_Demo3 {
	public static void main(String[] args) {
		System.out.println("Hello" + 10 + 20 + "Bye");
		System.out.println("Hello" + (10 + 20) + "Bye");
		System.out.println(10 + 20 + "Hello" + "Bye");
		Scanner sc = new Scanner(System.in);
		//String s=sc.next();
		String s=sc.nextLine();
		System.out.println(s);
		
	}

}
