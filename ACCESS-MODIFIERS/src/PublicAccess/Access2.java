package PublicAccess;

public class Access2 {

	public static void main(String[] args) {
		System.out.println("The value of A and b from Access1 class is "+Access1.a+" and "+Access1.b);
		Access1.a=10;
		Access1.b=30;
		System.out.printf("After changing the values of A and B are from Access1 class %d and %d",Access1.a,Access1.b);

	}

}
