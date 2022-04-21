
public class Generator extends Thread {
	static long [] fibonacciNumbers=new long [50];
	public void run()
	{
		try
		{
			int a=0, b=1, c,totalNumber=50;
			fibonacciNumbers[0]=0;
			fibonacciNumbers[1]=1;
			for(int i=2;i<totalNumber;i++)
			{
				c=a+b;
				fibonacciNumbers[i]=c;
				a=b;
				b=c;				
			}
			for(int i=0;i<fibonacciNumbers.length;i++) {
				System.out.println(fibonacciNumbers[i]);
			}
			//System.out.println(fibonacciNumbers.length);
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		
	}
}