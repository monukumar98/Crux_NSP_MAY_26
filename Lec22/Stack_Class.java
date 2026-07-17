package Lec22;

public class Stack_Class implements Stack {

	@Override
	public void push(int x) {
		// TODO Auto-generated method stub
		// Stack.x=9;
	}

	@Override
	public int pop() {
		// TODO Auto-generated method stub
		return 0;
	}

	public static void main(String[] args) {
		Stack st = new Stack_Class();
		Stack_Class st1 = new Stack_Class();
		Stack st2 = new Stack() {
			@Override
			public void push(int x) {
				// TODO Auto-generated method stub

			}

			@Override
			public int pop() {
				// TODO Auto-generated method stub
				return 0;
			}
		};
	}

}
