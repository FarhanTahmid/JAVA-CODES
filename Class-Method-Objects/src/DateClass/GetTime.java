package DateClass;
import java.util.*;
public class GetTime {

	public static void main(String[] args) {
	Date date=new Date();
	System.out.println("The elapsed time from january 1970 to now is "+date.getTime()+" milliseconds");
	
	System.out.println("Current Date and Time is "+date.toString());
	}

}
