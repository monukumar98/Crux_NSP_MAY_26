package Lec9;

import java.util.*;

public class ArrayList_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[6];
		ArrayList<Integer> ll = new ArrayList<>(100);
		System.out.println(ll.size());
		ll.add(10);// O(1)
		ll.add(20);
		ll.add(30);
		ll.add(2);
		ll.add(3);
		ll.add(40);
		ll.add(1, -9);// O(N)
		System.out.println(ll);
		// get
		System.out.println(ll.get(1));// O(1)
		//remove
		System.out.println(ll.remove(1));// O(N)
		System.out.println(ll);
		// update
		ll.set(4, -11);// O(1)
		System.out.println(ll);
		//sort 
		Collections.sort(ll);// Nlog(N)
		System.out.println(ll);
		Collections.reverse(ll);
		System.out.println(ll);
		
	}

}











