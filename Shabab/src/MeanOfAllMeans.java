
public class MeanOfAllMeans extends Thread {
	public void run() {
		double meanofAllmeans=(MeanForFirstHalfEven.firstHalfEvenMean+MeanForFirstHalfOdd.firstHalfOddMean+MeanForSecondHalfOdd.secondHalfOddMean+MeanForSecondHalfEven.secondHalfEvenMean)/4;
		System.out.println("Mean of all the 4 mean is "+meanofAllmeans);
	}
}
