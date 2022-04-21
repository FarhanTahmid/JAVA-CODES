package PassingObejctToMethod;

public class Class2 {
	public static void main(String[] args) {
		Class1 obj1=new Class1(16,25);
		Class1 obj2=new Class1(10,15);
		//passing this object to the constructor
		Class1 obj3=new Class1(obj1);  //its gonna initialize the value of obj3's height and width with the obj1's one;
		//creating another duplicate object by returning from a method;
		Class1 obj4=obj2.duplicate();
		
		System.out.println("For Object1: ");
		obj1.printValue(obj1);
		System.out.println("For object2: ");
		obj2.printValue(obj2);
		System.out.println("For object3: ");
		obj3.printValue(obj3);
		System.out.println("For object4: ");
		obj4.printValue(obj4);
		
		System.out.println("Equality checking: ");
		if(obj1.isEqual(obj2)) {    //if we call via obj1 in this class2 the value of this.width in class1 will be that of obj1 and if we call via obj2 the values will be of obj2
			System.out.println("The height and width are same.");
		}
		else {
			System.out.println("The height and width are not same.");
			
		}
		System.out.println("\nEquality checking by passing objects toa static method");
		if(Class1.checkingIfEqual(obj2, obj3)) {
			System.out.println("The height and width are same.");
		}
		else {
			System.out.println("The height and width are not same.");
			
		}
	}
}
