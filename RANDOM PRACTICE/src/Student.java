

public class Student {
		private String name;
	    private int id;
	    private double cgpa;
	    
	   Student(){}
	 Student(String n,int number,double cg){
	       name = n;
	       id = number;
	       cgpa = cg;
	     }
	 
	  
	   Student(Student obj){
	     this.name=obj.name;
	     this.id=obj.id;
	     this.cgpa=obj.cgpa;
	}
	
	   static int index=0;
	public double Highestmark(Student[] obj,int size) {
		for(int i=0;i<size;i++) {
	    	if(obj[0].cgpa<obj[i].cgpa) {
	    		obj[0]=obj[i];
	    		index=i;
	    	}
	   
		}
		return obj[0].cgpa;
	}
	
	public String getName() {
	return name;
	}
	public void setName(String name) {
	this.name = name;
	}
	public int getId() {
	return id;
	}
	public void setId(int id) {
	this.id = id;
	}
	public double getCgpa() {
	return cgpa;
	}
	public void setCgpa(double cgpa) {
	this.cgpa = cgpa;
	}
	
}


	


