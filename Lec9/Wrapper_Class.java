package Lec9;

public class Wrapper_Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer a1 = 10;
		int a = 9;
		System.out.println(a1);
		System.out.println(a);
		a1 = a;// auto-boxing
		Long ll = 899l;
		Integer c1=19;
		Integer c2=19;
		Integer c3=190;
		Integer c4=190;
		System.out.println(c1==c2);
		System.out.println(c3==c4);
		Character ch1 ='a';
		Character ch2 ='a';
		System.out.println(ch1==ch2);
		boolean b1=false;
		boolean b2=false;
		System.out.println(b1==b2);

	}

}
