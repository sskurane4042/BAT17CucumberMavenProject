package javapackage;

public class ElseIf {
	public static void main(String[] args) {
		
		int marks=39;
		
		if (marks>=0  && marks<=39)
		{
			System.out.println("Print fail");
		}
		
		else if(marks<=40) 
		{
			System.out.println("Pass"); 
		}
		else if (marks>=50 && marks<=60)
		{
			System.out.println("Print first class");
		}
	
	    else if (marks>=60 && marks<=70)
		{
			System.out.println("Print distinction");
		}
	    else
	    {
	    	System.out.println("Print Extra ordinory");
	    }
	
}
}
