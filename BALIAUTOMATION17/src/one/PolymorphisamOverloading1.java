package one;

public class PolymorphisamOverloading1 {

	public void Teacher()
	{
		System.out.println("Teacher is happy in Home");
		
	}
	public void Teacher(String school)
	
	{
		System.out.println("Teacher is angrey in school");
	}
    public void Teacher(int salary)
	
	{
		System.out.println("Teacher is delight on salary");
	}
	public static void main(String[] args) {
		
		PolymorphisamOverloading1 teacher=new PolymorphisamOverloading1();
		
		teacher.Teacher();
		teacher.Teacher(50000);
		teacher.Teacher("Malu Highschool");
	}
	}
	

