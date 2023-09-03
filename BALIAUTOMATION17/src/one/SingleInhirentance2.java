package one;

public class SingleInhirentance2 extends SingleInhirentance1{
	
	public void Child()
	{
	System.out.println("Child have Buildings");
	
	}
public static void main(String[] args) {
	
	SingleInhirentance2 ref=new SingleInhirentance2();
	
	ref.Child();
	ref.Parent();
	
	
}
}
