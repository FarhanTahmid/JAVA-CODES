import java.util.Scanner;

public class ProblemC {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		Scanner numberinput=new Scanner(System.in);
		int numberOfTimes=input.nextInt();
		int numbersInLine[][]=new int[numberOfTimes][numberOfTimes];
		String numbers[]=new String[numberOfTimes];
		for(int i=0;i<numberOfTimes;i++) {
			for(int j=0;j<numberOfTimes;j++) {
				numbers[i]=numberinput.nextLine();
				numberinput.nextLine();
				numbers[i].split(" ");
				numbersInLine[i]=Integer.parseInt(numbers[i]);	
			}
		}
	}

}
