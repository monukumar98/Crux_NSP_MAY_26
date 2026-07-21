package Lec23;

public class LinkedList<T> {
	private class Node {
		T val;
		Node next;

		public Node(T val) {
			// TODO Auto-generated constructor stub
			this.val = val;
		}
	}

	private Node head;
	private Node tail;
	private int size;

	// O(1)
	public void addfirst(T x) {
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
	public void addlast(T x) {
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
	public void addatindex(int idx, T x) {
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
	public T getfirst() {
		return head.val;
	}

	// O(1)
	public T getlast() {
		return tail.val;
	}

	// O(N)
	public T getatindex(int k) {
		return getNode(k).val;
	}

	// O(1)
	public int size() {
		return size;
	}

	// O(1)
	public T removefirst() {
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

	public T removeLast() {
		if (size == 1) {
			return removefirst();
		} else {
			T val = tail.val;
			Node prev = getNode(size - 2);
			tail = prev;
			tail.next = null;
			size--;
			return val;
		}

	}

	public T removeatindex(int k) {
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
	public static void main(String[] args) {
		LinkedList<String> ll = new LinkedList<>();
		ll.addlast("Raj");
		ll.addlast("Kamlesh");
		ll.addlast("Amisha");
		ll.addlast("Puneet");
		ll.display();
	}

}










