
public class Assignment1Q20 {

	public static void main(String[] args) {
		int randomNum;
		int countH=0;
		int countT=0;
		int i;
		for(i=0;i<100;i++) {
			randomNum=(int)(Math.random()*((1-0)+1)+0);
			if(randomNum==1) {
				 countH++;
			} 
			else{
				countT++;
			}
		}
		System.out.println("Total number of heads in the 100 flips of a coin is "+ countH+" times");
		System.out.println("Total number of tails in the 100 flips of a coin is "+ countT+" times");
	}

}
