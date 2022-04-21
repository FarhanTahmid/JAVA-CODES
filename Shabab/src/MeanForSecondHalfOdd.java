
public class MeanForSecondHalfOdd extends Thread {
	long[] meansOfOddValues=new long[25];
	static double secondHalfOddMean=0;
	double sum=0;
	public void run() {
		
		try {
			
			for(int i=Generator.fibonacciNumbers.length;i<meansOfOddValues.length;i--) {
				if(Generator.fibonacciNumbers[i]/2!=0) {
					meansOfOddValues[i]=Generator.fibonacciNumbers[i];
					sum=sum+meansOfOddValues[i];
				}
			}
			
			secondHalfOddMean=sum/meansOfOddValues.length;
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
