package MidTermExam;

public class Happy {

	public static void main(String[] args) {
		printed(args);
		String[] stringArray = {"a", "b","c"};
		printed(stringArray);

	}
	static void printed(String[]hi) {
		for(int i=0;i<hi.length;i++) {
			System.out.println(hi[i]+" ");
		}
	}

}
