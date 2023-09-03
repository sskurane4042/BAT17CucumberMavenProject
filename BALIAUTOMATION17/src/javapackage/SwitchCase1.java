package javapackage;

public class SwitchCase1 {

	public static void main(String[] args) {
	
	int ch=1;	
	int c;	
	int a,b; a=10; b=5;
	
	switch(ch)
	{
	case 1: c=a+b;
		System.out.println("print " +c);break;
	
	case 2: c=a-b;
		System.out.println("print " + c);break;
	
	case 3: c=a*b;
		System.out.println("print " + c);break;
	
	case 4: c=a/b;
		System.out.println("print " + c);break;
		default:                                 // default condition is used to print default statement
		{
			System.out.println("Type valid number");
		}
	
	}
	}
	}