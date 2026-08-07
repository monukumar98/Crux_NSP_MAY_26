package Lec31;

import java.util.Arrays;

public class Single_Number_III {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 1, 2, 1, 3, 2, 5 };
		System.out.println(Arrays.toString(SingleNumber(nums)));
	}

	public static int[] SingleNumber(int[] nums) {
		int xor = 0;
		for (int i = 0; i < nums.length; i++) {
			xor = xor ^ nums[i];
		}
		int mask = (xor & (-1 * xor));
		int a = 0;
		for (int i = 0; i < nums.length; i++) {
			if ((nums[i] & mask) == 0) {
				a ^= nums[i];
			}
		}
		int b = xor ^ a;
		int[] ar = { a, b };
		return ar;
	}
}
