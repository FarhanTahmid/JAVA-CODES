package scanningandmaths;

import java.io.IOException;

public class TryCatch {

	public static void main(String[] args) {
		int a=5;
		int b=10;
		int c=0;
		try {
			c=a+b;
			c=a/0;
			c=a+5;
		} catch (NullPointerException e  ) {
			System.out.println(e);
			System.exit(0);
		}
		catch (ExceptionInInitializerError e) {
			System.exit(0);
		}
		finally {
			System.out.println("yo");
		}
		System.out.println(c);
	}

}
