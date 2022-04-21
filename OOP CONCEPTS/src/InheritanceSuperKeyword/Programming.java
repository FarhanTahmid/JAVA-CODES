package InheritanceSuperKeyword;


//Java program to demonstrate
//the concepts of constructor
//overloading.

//Base Class
class Programming {

 // Creating Constructor for
 // class Programming.
 public Programming()
 {
     System.out.println("Programming");
 }

 // Parameterized Constructor
 public Programming(int i, int j)
 {
     System.out.println("Programming + +");
 }
}

//Child Class
class DP extends Programming {

 public DP()
 {
     // Calling by using
     // Programming(int i,int j)
     // from class Programming.
     super(10, 20);
     System.out.println("DP");
 }

 // Parameterized Constructor
 // for class DP
 public DP(int i, int j)
 {
     System.out.println("DP + +");
 }
}
