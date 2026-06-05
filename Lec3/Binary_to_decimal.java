package Lec3;

public class Binary_to_decimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 100101;
		int mul = 1;
		int sum = 0;
		while (n > 0) {
			int rem = n % 10;
			sum = sum + rem * mul;
			n = n / 10;
			mul = mul * 2;

		}
		System.out.println(sum);
	}

}
