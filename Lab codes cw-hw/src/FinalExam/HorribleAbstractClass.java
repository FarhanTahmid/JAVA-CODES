package FinalExam;

public abstract class HorribleAbstractClass {
	void horribleMethod(){
		int x=5*5;
		System.out.println("The value of x is from the Abstract Class and it is "+x);
	}
}

class FirstSubClass extends HorribleAbstractClass	{
	
	
	@Override
	void horribleMethod() {
		int x=5*6;
		System.out.println("The value of x is from the First Subclass and it is "+x);
		super.horribleMethod();
	}
}

class SecondSubClass extends HorribleAbstractClass{
	
	String s="5";
	int x=6031;
	@Override
	void horribleMethod() {
		int y=(Integer.parseInt(s)*x);
		System.out.println("The value of y is from the Second Subclass and it is "+y);
		super.horribleMethod();
	}
}

class ThirdSubClass extends HorribleAbstractClass{
	@Override
	void horribleMethod() {
		int arr[]= {1,2,3};
		int temp=arr[0];
		int max;
		for(int i=0;i<arr.length;i++) {
			if(temp<arr[i]) {
				temp=arr[i];
			}
			max=temp;
		}
		System.out.println("The value of largest element of the array is "+temp+"\nand this is from the third class");
		super.horribleMethod();
	}
}

