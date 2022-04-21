
public class Immutabilty {
	public static void main(String[] args) {
		String s1=new String("farhan");
		System.out.println(s1);
		String s2=s1.concat(" is a boy");
		System.out.println(s1);
		System.out.println(s2);
		String s3="farhan";
		String s4="farhan";
		System.out.println(s3==s4);
		
		//mutable objects using string buffer 
		StringBuffer s5=new StringBuffer("farhana");
		s5.append('z');
		System.out.println(s5);
		
		//passing character array inside a string constructor
		char[] c= {'f','a','r','h','a','n'};
		String s6=new String(c);
		System.out.println(c);
		
		//why using char array to store password is better than using string
		char[]s7=new char[]{'a','b','c'};
		System.out.println("s7: "+s7);
		String s8=new String("abc");
		System.out.println(s8);
		}
}
