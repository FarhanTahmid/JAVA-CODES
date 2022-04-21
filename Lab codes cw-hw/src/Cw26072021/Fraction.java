package Cw26072021;

public class Fraction {
	private int numerator;
	private int denominator;
	
	public int getNumerator() {
		return numerator;
	}
	public int getDenominator() {
		return denominator;
	}
	public void setNumerator(int newNumerator) {
		numerator=newNumerator;
	}
	public void setDenominator(int newDenominator) {
		denominator=newDenominator;
	}
	public void add(Fraction obj) {
		int addNumerators=(this.numerator*obj.denominator)+(this.denominator*obj.numerator);
		int addDenomnitaor=(this.denominator*obj.denominator);
		System.out.println("Add value is: "+addNumerators+"/"+addDenomnitaor);
	}
	public void sub(Fraction obj) {
		int subNumerators=(this.numerator*obj.denominator)-(this.denominator*obj.numerator);
		int subDenomnitaor=(this.denominator*obj.denominator);
		System.out.println("Subtraction value is: "+subNumerators+"/"+subDenomnitaor);
	}
	public void multiplication(Fraction obj) {
		int multiplicationNumerators=(this.numerator*obj.denominator);
		int multiplicationDenomnitaor=(this.denominator*obj.numerator);
		System.out.println("Multiplication value is: "+multiplicationNumerators+"/"+multiplicationDenomnitaor);
	}
	public void division(Fraction obj) {
		int divisionNumerator=(this.numerator*obj.numerator);
		int divisionDenmoinator=(this.denominator*obj.denominator);
		System.out.println("Division value is: "+divisionNumerator+"/"+divisionDenmoinator);
	}
	
	
}
