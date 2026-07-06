package Lec16;

public class Queue {
	protected int[] arr;
	protected int front = 0;
	private int size = 0;

	public Queue() {
		// TODO Auto-generated constructor stub
		this(5);
	}

	public Queue(int n) {
		// TODO Auto-generated constructor stub
		arr = new int[n];
	}

	public boolean isEmpty() {
		return size == 0;
	}

	public boolean isfull() {
		return size == arr.length;
	}

	public void Enqueue(int x) throws Exception {
		if (isfull()) {
			throw new Exception("Bklol Queue full hai");
		}
		int idx = (front + size) % arr.length;
		arr[idx] = x;
		size++;

	}

	public int Dequeue() throws Exception {
		if (isEmpty()) {
			throw new Exception("Bklol Queue Empty hai");
		}
		int x = arr[front];
		front = (front + 1) % arr.length;
		size--;
		return x;

	}

	public int getfront() throws Exception {
		if (isEmpty()) {
			throw new Exception("Bklol Queue Empty hai");
		}
		int x = arr[front];
		return x;

	}

	public int size() {
		return size;
	}

	public void Display() {
		for (int i = 0; i < size; i++) {
			int idx = (front + i) % arr.length;
			System.out.print(arr[idx] + " ");
		}
		System.out.println();
	}
}
