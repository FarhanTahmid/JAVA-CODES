package CreatingArryList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class AccessingArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String>topProgrammingLanguages=new ArrayList<>();
		topProgrammingLanguages.add("java");
		topProgrammingLanguages.add("Python");
		topProgrammingLanguages.add("C#");
		topProgrammingLanguages.add(".net");
		System.out.println(topProgrammingLanguages);
		System.out.println(topProgrammingLanguages.size());
		System.out.println(topProgrammingLanguages.get(1));
		System.out.println(topProgrammingLanguages.get(0));
		
		//modifying element in an index
		topProgrammingLanguages.set(3, "C++");
		System.out.println(topProgrammingLanguages);
		
		//removing element
		topProgrammingLanguages.remove(0);
		System.out.println(topProgrammingLanguages);
		
		//Iterating over an arrayList
		List<String> courses=Arrays.asList("C","C#","C++","python","java");
		//basic for loop
		for(int i=0;i<courses.size();i++) {
			System.out.println(courses.get(i));
		}
		//using for each loop
		for(String course:courses) {
			System.out.println();
			System.out.println(course);
		}
		//basic loop with iterator
		for(Iterator iterator=courses.iterator();iterator.hasNext();) {
			String course=(String)iterator.next();
			System.out.println(course);
		}
		
	}

}
