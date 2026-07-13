package Lec20;

import java.util.LinkedList;
import java.util.Queue;

public class LinlkedList_Java {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	LinkedList<Integer> ll = new LinkedList<>();
		Queue<Integer> ll = new LinkedList<>();
		ll.add(10);// add last
		ll.add(20);// add last
		ll.add(30);// add last
		ll.add(40);// add last
		ll.add(50);// add last
		ll.add(60);// add last
		System.out.println(ll);
		System.out.println(ll.remove());// remove first
		System.out.println(ll);

	}

}
