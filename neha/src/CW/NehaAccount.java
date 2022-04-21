package CW;

public class NehaAccount {
	String n;
	int b;
	static int accNum=2000;
	
	NehaAccount(String n, int b)
	{
		this.n=n;
		this.b=b;
	}
	public boolean Loan(int b)
	{
		if(b>1000000)
			return true;
		else
			return false;
	}
	public void acc()
	{
		System.out.println("Name: "+n+"\n");
		System.out.println("Account Number: "+accNum+"\n");
		System.out.println("Balance: "+b+"");
	}
}