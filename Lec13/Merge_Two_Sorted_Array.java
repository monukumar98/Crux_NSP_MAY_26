package Lec13;

public class Merge_Two_Sorted_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = { 2, 3, 5, 7, 9, 11, 13 };
		int[] arr2 = { 2, 3, 5, 7 };
		int[] a = Merge_Two_Array(arr1, arr2);
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}

	}

	public static int[] Merge_Two_Array(int[] arr1, int[] arr2) {
		int i = 0, j = 0, k = 0;
		int[] ans = new int[arr1.length + arr2.length];
		while (i < arr1.length && j < arr2.length) {
			if (arr1[i] < arr2[j]) {
				ans[k++] = arr1[i++];
			} else {
				ans[k++] = arr2[j++];
			}
		}

		while (i < arr1.length) {
			ans[k++] = arr1[i++];
		}

		while (j < arr2.length) {
			ans[k++] = arr2[j++];
		}
		return ans;
	}

}
