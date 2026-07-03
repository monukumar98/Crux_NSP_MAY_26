package Lec15;

public class Student_Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hey");
		Student s = new Student();
		s.name = "Kaju";
		s.age = 20;
		s.Intro_yourSelf();
		Student s1 = new Student();
		s1.name = "Ramesh";
		s1.age = 22;
		s1.Intro_yourSelf();
		s1.SayHey("Suresh");
		Student.Mentor_Name();

	}
	static {
		System.out.println("Static blocks in Main  2");
	}


}
