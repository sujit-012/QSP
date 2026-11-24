package ObjectClass;

public class StudentDriver {
	
	public static void main(String [] args)
	{
		Student s1 = new Student("Sujit", 22, "GCOEY", 70, 27);
		
		Student s2 = new Student("Sujit", 22, "GCOEY", 70, 27);
		
		System.out.println(s1.equals(s2));
		
		System.out.println(s1);
		System.out.println(s2);
	}
}
