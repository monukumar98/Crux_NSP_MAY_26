package Lec18;

public class Intersection_of_Two_LinkedLists {
	public class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
			next = null;
		}
	}

	
	public class Solution {
		public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
			ListNode A=headA;
			ListNode vgf=headB;
			while(A!=vgf) {
				if(A==null) {
					A=headB;
				}
				else {
				A=A.next;
				}
				if(vgf==null) {
					vgf=headA;
				}
				else {
					vgf=vgf.next;
				}
				
				
			}
			return vgf;

		}
	}

}
