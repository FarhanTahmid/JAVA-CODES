
public class StaticBlock {
	static {
		System.out.println("Hello! this is the static block.");
		System.out.println("Static block executes before main method");
	}
	public static void main(String[] args) {
		System.out.println("Hello! this is the main method.");

	}

}
