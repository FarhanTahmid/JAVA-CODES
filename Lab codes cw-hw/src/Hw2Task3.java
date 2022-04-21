import java.util.Scanner;
public class Hw2Task3 {

	public static void main(String[] args) {
		System.out.println("Enter the Kelvin temperature");
		Scanner tempIn=new Scanner(System.in);
		double kelvin=tempIn.nextDouble();
		double celcius=kelvin - 273.15;
		System.out.printf("The temperature converted from %.3f Kelvin is %.5f degree Celcius",kelvin,celcius);
	}

}
