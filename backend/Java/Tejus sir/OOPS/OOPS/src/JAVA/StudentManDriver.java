package JAVA;

public class StudentManDriver {
	public static void main(String args[])
	{
		StudentMan s1 = new StudentMan("Kunal", 28);
		s1.setMMarks("Sujit", "123", 90);
		s1.setEMarks("Sujit", "123", 97);
		s1.setSMarks("Sujit", "123", 95);
		
		System.out.println("Math Mark " + (s1.getMMarks("Sujit", "123")));
		System.out.println("Science Mark " + (s1.getSMarks("Sujit", "123")));
		System.out.println("English Mark " + s1.getEMarks("Sujit", "123"));
		System.out.println("Toral Mark " + s1.getMarks("Sujit", "123"));
		
		System.out.println("-----------------------------------------------------------------------------");
		
		StudentMan s2 = new StudentMan("Prfull", 28);
		s2.setMMarks("Sujit", "123", 99);
		s2.setEMarks("Sujit", "123", 99);
		s2.setSMarks("Sujit", "123", 99);
		
		System.out.println("Math Mark " + (s2.getMMarks("Sujit", "123")));
		System.out.println("Science Mark " + (s2.getSMarks("Sujit", "123")));
		System.out.println("English Mark " + s2.getEMarks("Sujit", "123"));
		System.out.println("Total Mark " + s2.getMarks("Sujit", "123"));
		
	}
}
