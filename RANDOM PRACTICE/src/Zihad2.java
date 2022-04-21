
public class Zihad2 {

	public static void main(String[] args) {
		Student1 obj1=new Student1("Zihad",2304804);
		System.out.println(obj1.name);
		System.out.println(obj1.ID);

	}

}
class Student1{
	String name;
	int ID;
	Student1(String name1,int id){
		this.name=name1;
		this.ID=id;
	}
}
