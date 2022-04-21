package Cw26072021;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		Fraction obj1=new Fraction();
		Fraction obj2=new Fraction();
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter the numerator value for object1: ");
		obj1.setNumerator(input.nextInt());
		System.out.println("Enter the denominator value for object1: ");
		obj1.setDenominator(input.nextInt());
		
		System.out.println("Enter the numerator value for object2: ");
		obj2.setNumerator(input.nextInt());
		System.out.println("Enter the denominator value for object2: ");
		obj2.setDenominator(input.nextInt());
		
		System.out.println("The fractions are: "+obj1.getNumerator()+"/"+obj1.getDenominator()+" and "+obj2.getNumerator()+"/"+obj2.getDenominator());
		
		obj1.add(obj2);
		obj1.sub(obj2);
		obj1.multiplication(obj2);
		obj1.division(obj2);
	}

}
