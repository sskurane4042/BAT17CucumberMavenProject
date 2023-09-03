package one;

public class MultilevelInheritance3 extends MultilevelInheritance2{
	
	public void son()
	{
		
	System.out.println("son having number of vechicles");	
	
}
	public static void main(String[] args) {
		
		MultilevelInheritance3 son=new MultilevelInheritance3();
		
		son.Grandfather();
		son.father();
		son.son();
		
	}

}
