package Lec16;

public class DynmaicStack extends Stack {
	@Override
	public void push(int x) throws Exception {
		if (this.isFull()) {
			int[] new_arr = new int[2 * size()];
			for (int i = 0; i < arr.length; i++) {
				new_arr[i] = arr[i];
			}
			arr = new_arr;

		}
		
		super.push(x);

	}

}
