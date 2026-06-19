package Lec9;

public class StringBuilder_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder();
		System.out.println(sb.capacity());
		System.out.println(sb.length());
		sb.append("hjgsj");
		sb.append(10);
		sb.append('a');
		sb.append(true);
		System.out.println(sb);
		sb.append("naan");
		sb.append('a');
		System.out.println(sb.length());
		System.out.println(sb.capacity());
//		System.out.println(sb.charAt(2));
//		System.out.println(sb.substring(1, 3));
		String s = sb.toString();
		System.out.println(s);
		System.out.println(sb.reverse());
	}

}