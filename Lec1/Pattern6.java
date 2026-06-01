package Lec1;

public class Pattern6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int row = 1;
		int star = n;
		int space = 0;
		while (row <= n) {
			// sapce
			int i = 1;
			while (i <= space) {
				System.out.print("  ");
				i++;
			}
			// star
			int j = 1;
			while (j <= star) {
				System.out.print("* ");
				j++;
			}
			// next line ki prep
			row++;
			System.out.println();
			star--;
			space+=2;
		}

	}

}
