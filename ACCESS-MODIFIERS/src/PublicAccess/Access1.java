package PublicAccess;

public class Access1 {
	public static int a=5;
	public static int b=6;
	public static void main(String[] args) {
		System.out.println("The value of a and b is "+a+" and "+b);
		a=6;
		b=7;
		System.out.println(a);
		System.out.println(b);
	}

}
