package Lec16;

public class Stack {

	protected int[] arr;
	private int idx = -1;

	public Stack() {
		// TODO Auto-generated constructor stub
		this(5);// constructor calling
	}

	public Stack(int n) {
		// TODO Auto-generated constructor stub
		arr = new int[n];
	}

	// o(1)
	public boolean isEmpty() {
		return idx == -1;
	}

	// o(1)
	public boolean isFull() {
		return size() == arr.length;
	}

	// o(1)
	public void push(int x) throws Exception {
		if (isFull()) {
			throw new Exception("Bklol thoda dimag lagale Stack full hai ");
		}
		this.arr[++this.idx] = x;// arr[++idx]=x;

	}

	// o(1)
	public int pop() throws Exception {
		if (isEmpty()) {
			throw new Exception("Bklol thoda dimag lagale Stack Empty hai ");
		}
		int x = arr[idx--];
		return x;

	}

	// o(1)
	public int peek() throws Exception {
		if (isEmpty()) {
			throw new Exception("Bklol thoda dimag lagale Stack Empty hai ");
		}
		int x = arr[idx];
		return x;

	}

	// o(1)
	public int size() {
		return idx + 1;
	}

	public void Display() {
		for (int i = 0; i <= idx; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
}
