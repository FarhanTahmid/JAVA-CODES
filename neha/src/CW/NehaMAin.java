package CW;

import java.util.Scanner;

public class NehaMAin {
	
	public static void main(String[] args) {
		  
		  NehaAccount h1=new NehaAccount("Neha", 9748264);
		  h1.acc();
		  NehaAccount.accNum++;
		  
		  
		  NehaAccount h2=new NehaAccount("Farhan", 863246);
		  h2.acc();
		  NehaAccount.accNum++;
		  
		  NehaAccount h3=new NehaAccount("Alam",8138213);
		  h3.acc();
		  NehaAccount.accNum++;
		  
		  NehaAccount h4=new NehaAccount("Mofiz",1234);
		  h4.acc();
		  NehaAccount.accNum++;
		  
		  NehaAccount h5=new NehaAccount("Nandini", 1341);
		  h5.acc();
		  NehaAccount.accNum++;
		  
		  if(h1.Loan(h1.b))
		  
			  System.out.println(h1.n+" Eligible for the loan");
		  
		  else
			  System.out.println(h1.n+" Not eligible for the loan");
		  
		  if(h2.Loan(h2.b))
		  
			  System.out.println(h2.n+" Eligible for the loan");
		  
		  else
			  System.out.println(h2.n+" Not eligible for the loan");
		  
		  if(h3.Loan(h3.b))
		  
			  System.out.println(h3.n+" Eligible for the loan");
		  
		  else 
			  System.out.println(h3.n+" Not eligible for the loan");
		  
		  if(h4.Loan(h4.b))
		  
			  System.out.println(h4.n+" Eligible for the loan");
		  
		  else
			  System.out.println(h4.n+" Not eligible for the loan");
		  
		  if(h5.Loan(h5.b))
		  
			  System.out.println(h5.n+" Eligible for the loan");
		  
		  else
			  System.out.println(h5.n+" Not eligible for the loan");

		  
	}
}

