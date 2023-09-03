package one;

public class PolymorphisumOverriding2 extends PolymorphisumOverriding1 {
	
public void Marry()
	
	{
		System.out.println("Parent say marry with ALIA");
		
	}

public static void main(String[] args) {
	

PolymorphisumOverriding2 ma=new PolymorphisumOverriding2();

   ma.Marry();
   ma.Marry();
   
   PolymorphisumOverriding1 ma1=new PolymorphisumOverriding1();

   ma.Marry();


}}
