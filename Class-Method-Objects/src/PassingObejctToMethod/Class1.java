package PassingObejctToMethod;

public class Class1 {
	int height;
	int width;
	Class1(int h,int w){
		this.height=h;
		this.width=w;
	}
	// passing object to a constructor
	Class1(Class1 b) {
		this.width=b.width;
		this.height=b.height;
	}
	
	void printValue(Class1 b){
		System.out.println("The height is "+this.height+" and the width is "+this.width);
	}
	boolean isEqual(Class1 b) {
		if(this.height==b.height &&this.width==b.width) {
			return true;
		}
		else
			return false;
	}
	//returning an object from method
	Class1 duplicate() {
		Class1 temp=new Class1(this);
		return temp;
	}
	
	//checking with a static object
	
	static boolean checkingIfEqual(Class1 b1, Class1 b2) {
		if(b1.height==b2.height && b1.width==b2.width) {
			return true;
		}
		else 
			return false;
	}
}
