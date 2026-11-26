package ObjectClass;

public class StudentDriver {
	
	public static void main(String [] args)
	{
		Student s1 = new Student("sujit", 27, 98, "GCOEY", 22);
		
		Student s2 = new Student("sujit", 27, 98, "GCOEY", 22);
		
		System.out.println(s1.equals(s2));
		
		System.out.println(s1);
		System.out.println(s2);
	}
}
