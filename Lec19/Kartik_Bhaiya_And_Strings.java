package Lec19;

public class Kartik_Bhaiya_And_Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abaabbaaabababababaabaaaaaaaa";
		int k = 2;
		int flip_a = length_of_substring(str, k, 'a');
		int flip_b = length_of_substring(str, k, 'b');
		System.out.println(Math.max(flip_a, flip_b));
	}

	public static int length_of_substring(String str, int k, char ch) {

		int flip = 0, si = 0, ei = 0, ans = 0;
		while (ei < str.length()) {
			// 1. window grow
			if (str.charAt(ei) == ch) {
				flip++;
			}
			// 2. window shrink
			while (flip > k) {
				if (str.charAt(si) == ch) {
					flip--;
				}
				si++;
			}
			// 3. ans update
			ans = Math.max(ans, ei - si + 1);

			ei++;
		}
		return ans;
	}
}
