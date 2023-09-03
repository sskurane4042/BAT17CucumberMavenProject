package javapackage;

public class ForLoop1 {
	public static void main(String[] args) {
		
		second sec=new second(); //object created of new class second, to return value of line number 18 class
		
		
		for (int i=0; i<5; i++)
		
		{
			System.out.println("This is i value :" +i);	break;
		}
	}

}

 class second{     //new created class outside the class
	 {
	 
	 for (int p=1; p<5; p++)
	 System.out.println("Print value of" +p);
	
	 }
 }