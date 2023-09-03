package javapackage;

public class SwitchCaseAddi {
	
		public static void main(String[] args) {
		
			int a=35; int b=5;
			int ch=40;
			int c;
			switch(ch)
			{
			case 10: c=a+b;
			{
				System.out.println("Add =" +c);break;
			}
			case 15:c=a-b;{
				System.out.println("sub =" +c);break;
			}
			case 30:c=a*b;
					{
				System.out.println("mul =" +c);break;
			}
			case 40:c=a/b;
					{
				System.out.println("div =" +c);break;
			}
			default:
			{
				System.out.println("Enter correct value");
			}
}			
}
}