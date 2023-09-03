package one;

public class HirarchicalInheritance2 extends HirarchicalInheritance1{
	
	public void son()
	{
		System.out.println("Son Received land from parent");
	}
	
	public static void main(String[] args) {
		
		HirarchicalInheritance2 ref=new HirarchicalInheritance2();
		
	ref.parent();
	ref.son();
		
	}
	

}
