package Lec17;

import java.util.Stack;

public class Construct_Smallest_Number_From_DI_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String pattern = "IIIDIDDD";
		System.out.println(Construct_Smallest_Number(pattern));
	}

	public static String Construct_Smallest_Number(String pattern) {
		int[] arr = new int[pattern.length() + 1];
		Stack<Integer> st = new Stack<>();
		int c = 1;
		for (int i = 0; i <= pattern.length(); i++) {
			if (i == pattern.length() || pattern.charAt(i) == 'I') {
				arr[i]=c++;
				while(!st.isEmpty()) {
					arr[st.pop()]=c++;
				}

			}
			else {
				st.push(i);
			}
		}
		StringBuilder sb = new StringBuilder();
		for(int x:arr) {
			sb.append(x);
		}
		return sb.toString();
	}

}
