package FinalExam;

public class DriverClass {
	public static void main(String[] args) {
		FirstSubClass first=new FirstSubClass();
		first.horribleMethod();
		SecondSubClass second=new SecondSubClass();
		second.horribleMethod();
		ThirdSubClass third=new ThirdSubClass();
		third.horribleMethod();
		
		System.out.println("\n");
		SoCalledClass farhan=new SoCalledClass();
		farhan.soCalledMethod(5);
		farhan.soCalledMethod(6.9);
		farhan.soCalledMethod("9");
		farhan.soCalledMethod('c');
		
	
	}
}
