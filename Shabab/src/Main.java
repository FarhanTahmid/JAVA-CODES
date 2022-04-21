
public class Main {
	public static void main(String[] args) {
		
		try {
			Generator generate=new Generator();
			generate.start();
			generate.sleep(40);
			
			MeanForFirstHalfOdd mean1= new MeanForFirstHalfOdd();
			mean1.start();
			mean1.sleep(40);
			System.out.println("First Half Odd Mean");
			System.out.println(MeanForFirstHalfOdd.firstHalfOddMean);
			
			MeanForFirstHalfEven mean2=new MeanForFirstHalfEven();
			mean2.start();
			mean2.sleep(40);
			System.out.println("First Half Even Mean");
			System.out.println(MeanForFirstHalfEven.firstHalfEvenMean);
			
			MeanForSecondHalfOdd mean3=new MeanForSecondHalfOdd();
			mean3.start();
			mean3.sleep(40);
			System.out.println("Second Hald Odd mean");
			System.out.println(MeanForSecondHalfOdd.secondHalfOddMean);
			
			MeanForSecondHalfEven mean4=new MeanForSecondHalfEven();
			mean4.start();
			mean4.sleep(4000);
			System.out.println("Second Half Even Mean");
			System.out.println(MeanForSecondHalfEven.secondHalfEvenMean);
		
			MeanOfAllMeans mean=new MeanOfAllMeans();
			mean.start();
			mean.sleep(4000);
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
