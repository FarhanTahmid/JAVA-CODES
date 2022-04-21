
public class Encapsulation {

	public static void main(String[] args) {
		SecuredData data1=new SecuredData();
		data1.setData(350983);
		System.out.println("The data inside the encapasulated class is "+data1.getData());
	}

}
//creating an encapsulation unit class
class SecuredData{
	private int data;
	public void setData(int dataFromAnotherClass) {//setter method to initialize a private/secret data.
		data=dataFromAnotherClass;
	}
	public int getData() {  //getter method to get data from private variable;
		return data;
	}
	
}