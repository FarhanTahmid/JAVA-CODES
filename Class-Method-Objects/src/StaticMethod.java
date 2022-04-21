
public class StaticMethod {

	static void ece() {
		System.out.println("I am a student of ECE department.");
	}
	public static void main(String[] args) {
		StaticMethod.ece();
		AnotherClass.department();
		System.out.println(AnotherClass.a);
	}

}
class AnotherClass{
	static int a=5;
	static void department() {
		System.out.println("My major subject is Computer Science and Engineering");
	}
}
