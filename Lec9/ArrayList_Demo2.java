package Lec9;

import java.util.ArrayList;

public class ArrayList_Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> ll = new ArrayList<>(100);
		ll.add(10);// O(1)
		ll.add(20);
		ll.add(30);
		ll.add(2);
		ll.add(3);
		ll.add(40);
		ll.add(1, -9);// O(N)
		for (int i = 0; i < ll.size(); i++) {
			System.out.print(ll.get(i) + " ");
		}
		System.out.println();
		int[] arr = new int[5];
		for (int v : arr) {
			System.out.print(v + " ");
		}
		System.out.println();
		for (int v : ll) {
			System.out.print(v + " ");
		}
	}

}
