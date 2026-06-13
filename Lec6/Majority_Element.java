package Lec6;

public class Majority_Element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 2, 2, 1, 1, 1, 2, 2 };
	}
	public static int Moore_Voting(int []arr) {
		int vote=1;
		int e=arr[0];
		for (int i = 1; i < arr.length; i++) {
			if(vote==0)
			{
				e=arr[i];
			}
			if(e==arr[i]) {
				vote++;
			}
			else {
				vote--;
			}
		}
		return e;
	}

}
