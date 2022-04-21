package CreatingArryList;

import java.util.ArrayList;
import java.util.List;

public class CreatingArrayListFromCollection {

	
	//creating array list from an existing collection
	public static void main(String[] args) {
		
		//create arrayList Object
		List<Integer>firstFivePrimeNumbers=new ArrayList<>();
		firstFivePrimeNumbers.add(2);
		firstFivePrimeNumbers.add(3);
		firstFivePrimeNumbers.add(5);
		firstFivePrimeNumbers.add(7);
		firstFivePrimeNumbers.add(9);
		firstFivePrimeNumbers.add(11);
		
		List<Integer>firstTenPrimeNumbers=new ArrayList<>(firstFivePrimeNumbers);
		firstTenPrimeNumbers.add(13);
		firstTenPrimeNumbers.add(15);
		
		System.out.println(firstTenPrimeNumbers);
		
	}

}
