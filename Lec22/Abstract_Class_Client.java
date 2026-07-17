package Lec22;

public class Abstract_Class_Client {
	public static void main(String[] args) {
//		Abstract_Class_Demo ab = new Abstract_Class_Demo();
//		ab.Pay_bal(100);
		Abstract_Class_Demo2 ab = new Abstract_Class_Demo2();
		ab.Pay_bal(100);
		Abstract_Class_Demo ab2 = new Abstract_Class_Demo() {

			@Override
			public boolean Pay_bal(int x) {
				// TODO Auto-generated method stub
				return false;
			}
			
			
		};
	}
}
