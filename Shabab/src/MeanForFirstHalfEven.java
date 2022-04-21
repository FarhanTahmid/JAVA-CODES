
public class MeanForFirstHalfEven extends Thread {
	long[] meansOfEvenValues=new long[25];
	static double firstHalfEvenMean=0;
	double sum=0;
	public void run() {
		
		try {
			
			for(int i=0;i<(Generator.fibonacciNumbers.length)/2;i++) {
				if(Generator.fibonacciNumbers[i]/2==0) {
					meansOfEvenValues[i]=Generator.fibonacciNumbers[i];
					sum=sum+meansOfEvenValues[i];
				}
			}
			
			firstHalfEvenMean=sum/meansOfEvenValues.length;
			printMyname();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	void printMyname() {
		System.out.println("Zihad");
	}
}
