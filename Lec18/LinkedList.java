package Lec18;

public class LinkedList {
	private class Node {
		int val;
		Node next;

		public Node(int val) {
			// TODO Auto-generated constructor stub
			this.val = val;
		}
	}

	private Node head;
	private Node tail;
	private int size;

	// O(1)
	public void addfirst(int x) {
		Node nn = new Node(x);
		if (size == 0) {
			head = nn;
			tail = nn;
			size++;
		} else {
			nn.next = head;
			head = nn;
			size++;
		}

	}

	// O(1)
	public void addlast(int x) {
		if (size == 0) {
			addfirst(x);
		} else {
			Node nn = new Node(x);
			tail.next = nn;
			tail = nn;
			size++;
		}

	}

	// O(N)
	public void addatindex(int idx, int x) {
		if (idx == 0) {
			addfirst(x);
		} else if (idx == size) {
			addlast(x);
		} else {
			Node prev = getNode(idx - 1);
			Node nn = new Node(x);
			nn.next = prev.next;
			prev.next = nn;
			size++;
		}

	}

	private Node getNode(int k) {
		Node temp = head;
		for (int i = 0; i < k; i++) {
			temp = temp.next;
		}
		return temp;
	}

	public void display() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.val + "-->");
			temp = temp.next;
		}
		System.out.println(".");

	}

	// O(1)
	public int getfirst() {
		return head.val;
	}

	// O(1)
	public int getlast() {
		return tail.val;
	}

	// O(N)
	public int getatindex(int k) {
		return getNode(k).val;
	}

	// O(1)
	public int size() {
		return size;
	}

	// O(1)
	public int removefirst() {
		Node temp = head;
		if (size == 1) {
			head = null;
			tail = null;
		} else {
			head = head.next;
			temp.next = null;
		}
		size--;
		return temp.val;
	}

	public int removeLast() {
		if (size == 1) {
			return removefirst();
		} else {
			int val = tail.val;
			Node prev = getNode(size - 2);
			tail = prev;
			tail.next = null;
			size--;
			return val;
		}

	}

	public int removeatindex(int k) {
		if (k == 0) {
			return removefirst();
		}
		else if (k == size-1) {
			return removeLast();
		}
		else {
			Node prev=getNode(k-1);
			Node curr=prev.next;
			prev.next=curr.next;
			curr.next=null;
			size--;
			return curr.val;
		}



	}

}




















