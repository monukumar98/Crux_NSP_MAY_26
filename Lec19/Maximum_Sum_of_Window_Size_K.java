package Lec19;

public class Maximum_Sum_of_Window_Size_K {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 2, 3, 1, 3, 1, 3, 8, 2, 1, };
		int k = 3;
		System.out.println(Sum_of_Window_Size_K(arr, k));
	}

	public static int Sum_of_Window_Size_K(int[] arr, int k) {
		int sum = 0;
		// 1st window ka answer
		for (int i = 0; i < k; i++) {
			sum += arr[i];
		}
		int ans = sum;
		// 2nd Steps
		for (int i = k; i < arr.length; i++) {
			// 1. window grow
			sum += arr[i];
			// 2. window shrink
			sum -= arr[i - k];
			// ans update
			ans = Math.max(sum, ans);

		}
		return ans;

	}

}

