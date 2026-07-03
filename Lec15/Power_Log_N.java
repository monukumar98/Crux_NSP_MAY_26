package Lec15;

public class Power_Log_N {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 3;
		int n = 4;
		System.out.println(pow(a, n));

	}

	public static int pow(int a, int n) {
		if (n == 0) {
			return 1;
		}
		int p = pow(a, n / 2);
		p = p * p;
		if (n % 2 != 0) {
			p = p * a;
		}
		return p;

	}

}
