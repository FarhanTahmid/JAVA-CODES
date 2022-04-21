import java.util.Scanner;

public class ProblemB {
	
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		String x;
		int index=0;
		String[] hajjType=new String[10];
		int i=0;
		do {
			x=input.nextLine();
			hajjType[i]=x;
			i++;
			index=i;
		}while(!x.equals("*"));
		
		for(i=0;i<index;i++) {
			if(hajjType[i].equals(null)) {
				break;
			}
			else if(hajjType[i].equals("Hajj")) {
				System.out.println("Hajj-e-Akbar");
			}
			else if(hajjType[i].equals("Umrah")){
				System.out.println("Hajj-e-Asghar");
			}
		}
	}

}
