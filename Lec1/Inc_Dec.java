package Lec1;

public class Inc_Dec {
	public static void main(String[] args) {
		int x = 8;
//		System.out.println(x++);// x = x+1; 8
//		System.out.println(x); // 9
//		System.out.println(--x);// x = x-1;
//		System.out.println(x);

//		int c = x++ + --x + ++x + x--;
//		System.out.println(c);// 34
		int c = x++ - x++ - --x + x++;
		System.out.println(c);
	}

}
