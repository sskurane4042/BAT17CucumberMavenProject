package one;

public class HirarchicalInheritance3 extends HirarchicalInheritance1 {
	
	public void child()
	{
		System.out.println("Child Received land from parent");
	}

	public static void main(String[] args) {
		HirarchicalInheritance3 ref=new HirarchicalInheritance3();
		
		ref.parent();
		ref.child();
		
	}
}
