package Lec5;

public class Find_Pivot_Index {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 7, 3, 6, 5, 6 };
		System.out.println(Pivot_Index(arr));
	}

	public static int Pivot_Index(int[] arr) {
		int n=arr.length;
		for (int i = 0; i < arr.length; i++) {
			if(leftSum(arr, 0, i)==rightSum(arr, i+1, n-1)) {
				return i;
			}
		}
		return -1;

	}

	public static int leftSum(int[] arr, int si,int ei) {
		int sum=0;
		for (int i = si; i <ei; i++) {
			sum+=arr[i];
		}
		return sum;
		
	}
	public static int rightSum(int[] arr, int si,int ei) {
		int sum=0;
		for (int i = si; i <=ei; i++) {
			sum+=arr[i];
		}
		return sum;
		
	}

}
