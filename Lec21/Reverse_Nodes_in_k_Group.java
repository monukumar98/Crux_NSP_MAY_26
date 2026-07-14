package Lec21;

import java.util.Stack;

public class Reverse_Nodes_in_k_Group {
	public class ListNode {
		int val;
		ListNode next;

		ListNode() {
		}

		ListNode(int val) {
			this.val = val;
		}

		ListNode(int val, ListNode next) {
			this.val = val;
			this.next = next;
		}
	}

	class Solution {
		public ListNode reverseKGroup(ListNode head, int k) {
			Stack<ListNode> st = new Stack<>();
			ListNode Dummy = new ListNode();
			ListNode start = head;
			ListNode temp = Dummy;
			while (head != null) {
				st.push(head);
				head = head.next;
				if (st.size() == k) {
					while (!st.isEmpty()) {
						Dummy.next = st.pop();
						Dummy = Dummy.next;

					}
					start = head;
					Dummy.next = null;// cycle remove kr rahe hain
				}

			}
			if (!st.isEmpty()) {
				Dummy.next = start;
			}

			return temp.next;
		}
	}
}
