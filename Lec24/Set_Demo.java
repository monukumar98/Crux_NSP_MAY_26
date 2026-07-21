package Lec24;

import java.util.*;

public class Set_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer> set = new HashSet<>();
		// add
		set.add(10);
		set.add(2);
		set.add(9);
		set.add(7);
		set.add(7);
		set.add(-4);
		System.out.println(set);
//		// get
//		System.out.println(set.contains(7));
//		System.out.println(set.contains(17));
//		// remove
//		System.out.println(set.remove(7));
//		System.out.println(set.remove(17));
//		System.out.println(set);
		TreeSet<Integer> set1 = new TreeSet<>();
		// add
		set1.add(10);
		set1.add(2);
		set1.add(9);
		set1.add(7);
		set1.add(7);
		set1.add(-4);
		System.out.println(set1);
		LinkedHashSet<Integer> set2 = new LinkedHashSet<>();
		// add
		set2.add(10);
		set2.add(2);
		set2.add(9);
		set2.add(7);
		set2.add(7);
		set2.add(-4);
		System.out.println(set2);
		
		for(int x:set) {
			System.out.print(x+" ");
		}
		System.out.println();
		for(int x:set1) {
			System.out.print(x+" ");
		}
		System.out.println();

	}

}












