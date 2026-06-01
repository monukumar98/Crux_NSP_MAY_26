package Lec1;

public class Lottery_Game2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=167;
		if(num>=100 && num<=232) {
			System.out.println("Car");
			if(num<=150) {
				System.out.println("Thar");
			}
			else {
				System.out.println("Creta");
			}
		}
		else if(num>=70 && num<=89) {
			System.out.println("Mac");
			if(num<=78) {
				System.out.println("M1");
			}
			else {
				System.out.println("M2");
			}
		}
		else if(num>=250 && num<=350) {
			System.out.println("Bike");
			if(num<=321) {
				System.out.println("KTM");
			}
			else {
				System.out.println("Hero");
			}
		}
		else if(num>=450 && num<=500) {
			System.out.println("Cycle");
			if(num<=480) {
				System.out.println("ATLAS");
			}
			else {
				System.out.println("AVON");
			}
		}
		else {
			System.out.println("Happy BirthDay!");
		}

	}

}
