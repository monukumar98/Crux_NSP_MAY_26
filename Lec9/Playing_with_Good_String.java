package Lec9;

import java.util.Scanner;

public class Playing_with_Good_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(Longest_substring(str));

	}

	public static int Longest_substring(String str) {
		int ans = 0, c = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (Isvowels(ch)) {
				c++;
				ans = Math.max(ans, c);
			} else {
				c = 0;
			}

		}
		return ans;

	}

	public static boolean Isvowels(char ch) {
		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
			return true;
		}
		return false;
	}
}
