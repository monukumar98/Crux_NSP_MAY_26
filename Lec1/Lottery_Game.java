package Lec1;

public class Lottery_Game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=67;
		if(num>=100 && num<=232) {
			System.out.println("Car");
		}
		else if(num>=70 && num<=89) {
			System.out.println("Mac");
		}
		else if(num>=250 && num<=350) {
			System.out.println("Bike");
		}
		else if(num>=450 && num<=500) {
			System.out.println("Cycle");
		}
		else {
			System.out.println("Happy BirthDay!");
		}

	}

}
