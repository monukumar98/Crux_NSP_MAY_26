package Lec31;

public class PrintSubSequnce_Without_Recursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abc";
		PrintSubSequnce(s);

	}

	public static void PrintSubSequnce(String s) {
		int n = s.length();
		for (int i = 0; i < (1 << n); i++) {

			SubSequnce(s, i);
		}

	}

	private static void SubSequnce(String s, int i) {
		// TODO Auto-generated method stub
		String ans = "";
		int pos = 0;
		while (i > 0) {
			if ((i & 1) != 0) {
				ans = ans + s.charAt(pos);
			}
			pos++;
			i >>= 1;
		}
		System.out.println(ans);
	}

}
