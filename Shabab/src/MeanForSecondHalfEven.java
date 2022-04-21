
public class MeanForSecondHalfEven extends Thread {
	long[] meansOfEvenValues=new long[25];
	static double secondHalfEvenMean=0;
	double sum=0;
	public void run() {
		
		try {
			
			for(int i=Generator.fibonacciNumbers.length;i<meansOfEvenValues.length;i--) {
				if(Generator.fibonacciNumbers[i]/2==0) {
					meansOfEvenValues[i]=Generator.fibonacciNumbers[i];
					sum=sum+meansOfEvenValues[i];
				}
			}
			
			secondHalfEvenMean=sum/meansOfEvenValues.length;
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
