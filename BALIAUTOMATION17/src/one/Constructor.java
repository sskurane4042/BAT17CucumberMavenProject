package one;

public class Constructor {
	
	public Constructor(String Sanjay)
	{
		System.out.println("Print constructor");
	}
	
	public Constructor()
	{
		System.out.println("Print not constructor");
	}
	
	public static void main(String[] args) {
		
		Constructor c=new Constructor("k");
	}
}