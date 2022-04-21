package RifatMid;

import java.lang.String;

public class StringCheck {

	public static void main(String[] args) {

		String a1 = "Rifat Ahmed";
		String a2 = "rifAt Ahmed";

		if (a1.compareToIgnoreCase(a2)) {
			System.out.println("Equal");
		} else {
			System.out.println("Not equal");
		}

	}

}