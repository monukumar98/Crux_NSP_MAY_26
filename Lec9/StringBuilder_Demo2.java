package Lec9;

public class StringBuilder_Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	String_Demo();
		StringBuilder_Demo();

	}

	public static void String_Demo() {
		String s = "";
		for (int i = 0; i < 1000_000; i++) {
			s = s + i;
		}

	}

	public static void StringBuilder_Demo() {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < 1000_000; i++) {
			sb.append(i);
		}
	}

}
