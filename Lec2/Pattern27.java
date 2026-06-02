package Lec2;
import java.util.*;
public class Pattern27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int n =sc.nextInt();
		int row = 1;
		int star = 1;
		int space = n-1;
		while (row <= n) {
			// sapce
			int i = 1;
			while (i <= space) {
				System.out.print("  ");
				i++;
			}
			// star
			int val=1;
			int j = 1;
			while (j <= star) {
				System.out.print(val+" ");
				if(j<star/2+1) {
				val++;
				}
				else {
					val--;
				}
				j++;
			}
			// next line ki prep
			row++;
			System.out.println();
			star+=2;
			space--;
		}
	}

}
