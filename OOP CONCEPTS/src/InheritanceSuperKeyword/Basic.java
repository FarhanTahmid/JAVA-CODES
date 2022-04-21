package InheritanceSuperKeyword;

public class Basic extends InheritedClass {
	int name=10;
	String str="Subclass";
	public Basic() {
	// TODO Auto-generated constructor stub
}
public void show() {
	System.out.println(this.name);
	System.out.println(super.name);
	System.err.println(this.str);
	System.out.println(super.str);
	System.out.println(super.toString()); //calling method of superclass

}
	
public static void main(String[] args) {
		
		Basic obj=new Basic();
		obj.toString();
		System.out.println(obj.toString());
		obj.show();
		}
	public String toString() {
		
		return "This tostring() method is in sub class";

	}

}
class InheritedClass{
	public InheritedClass() {
		}
	String str="Superclass";
	int name=20;
	public String toString() {
		return "This tostring() method is in parent class";
	}
}