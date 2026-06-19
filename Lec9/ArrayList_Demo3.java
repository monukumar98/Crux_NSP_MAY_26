package Lec9;

import java.util.ArrayList;
import java.util.Vector;

public class ArrayList_Demo3 {

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
		Vector<Integer> v = new Vector<>();// 2 grow
		System.out.println(v.capacity());
	}

}
