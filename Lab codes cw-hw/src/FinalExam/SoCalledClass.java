package FinalExam;

public class SoCalledClass implements SoCalledInterface {
	
	int x;
	String s;
	
	public void soCalledMethod(int x) {
		
		int y=(x*5)+10;
		System.out.println(y);
	}
	
	public void soCalledMethod(double x) {
		
		double y=(x*5)+10;
		System.out.println(y);
	}
	public void soCalledMethod(String x) {
	
	int y=(Integer.parseInt(x)*5)+10;
	System.out.println(y);
}
	public void soCalledMethod(char x) {
	
	int y=(x*5)+10;
	System.out.println(y);
	}
		
}
