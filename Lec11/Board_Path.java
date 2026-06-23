package Lec11;

public class Board_Path {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;
		Path(n, 0, "");

	}

	public static int Path(int n, int curr, String ans) {
		if (curr == n) {
			System.out.println(ans);
			return 1;
		}
		if (curr > n) {

			return 0;
		}
		int c = 0;
		for (int dice = 1; dice <= 3; dice++) {
			c += Path(n, curr + dice, ans + dice);
		}
		return c;
//		Path(n, curr + 1, ans + 1);
//		Path(n, curr + 2, ans + 2);
//		Path(n, curr + 3, ans + 3);
	}

}
