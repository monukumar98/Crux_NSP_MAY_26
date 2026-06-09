package Lec5;

public class Find_Pivot_Index2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 7, 3, 6, 5, 6 };
		System.out.println(Pivot_Index(arr));
	}

	public static int Pivot_Index(int[] arr) {
		int n = arr.length;
		// Prefix sum
		int[] left = new int[n];
		left[0] = 0;
		for (int i = 1; i < n; i++) {
			left[i] = left[i - 1] + arr[i - 1];
		}
		// Suffix sum
		int[] right = new int[n];
		right[n - 1] = 0;
		for (int i = n - 2; i >= 0; i--) {
			right[i] = right[i + 1] + arr[i + 1];
		}
		// calcualtions
		for (int i = 0; i < n; i++) {
			if(left[i]==right[i]) {
				return i;
			}
		}
		return -1;
	}

}
