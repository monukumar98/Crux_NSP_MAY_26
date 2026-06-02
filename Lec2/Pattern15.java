package Lec2;

public class Pattern15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int row = 1;
		int star = n;
		int space = 0;
		while (row <= 2 * n - 1) {
			// space
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
			// Mirror
			if (row < n) {// mirror wale line se pehle
				star--;
				space += 2;
			} else {
				star++;
				space -= 2;
			}

			// next line ki prep
			System.out.println();
			row++;

		}
	}

}
