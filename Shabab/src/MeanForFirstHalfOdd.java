
public class MeanForFirstHalfOdd extends Thread {
	long[] meansOfOddValues=new long[25];
	static double firstHalfOddMean=0;
	double sum=0;
	public void run() {
		
		try {
			
			for(int i=0;i<(Generator.fibonacciNumbers.length)/2;i++) {
				if(Generator.fibonacciNumbers[i]/2!=0) {
					meansOfOddValues[i]=Generator.fibonacciNumbers[i];
					sum=sum+meansOfOddValues[i];
				}
			}
			
			firstHalfOddMean=sum/meansOfOddValues.length;
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
