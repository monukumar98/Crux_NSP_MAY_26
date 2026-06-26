package Lec12;

public class Check_Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 67;
		System.out.println(Is_Prime(n));
	}
	public static boolean Is_Prime(int n) {
		int div=2;
		while(div*div<=n) {
			if(n%div==0) {
				return false;
			}
			div++;
		}
		return true;
	}

}
