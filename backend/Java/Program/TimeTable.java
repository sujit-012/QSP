import java.util.Scanner;
class TimeTable 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a day : ");
		String day = sc.next();
		
		switch(day)
		{
			case "Monday" :
			{
				System.out.println("Java");
			}
			break;
			case "monday" :
			{
				System.out.println("Java");
			}
			break;
			
			case "Tuesday" :
			{
				System.out.println("HTML and CSS");
			}
			break;
			case "tuesday" : 
			{
				System.out.println("HTML and CSS");
			}
			break;
			
			case "Wednesday" : 
			{
				System.out.println("JavaScript");
			}
			break;
			case "wednesday" :
			{
				System.out.println("JavaScript");
			}
			break;
			
			case "Thursday" :
			{
				System.out.println("React");
			}
			break;
			case "thursday" : 
			{
				System.out.println("React");
			}
			break;
			
			case "Friday" :
			{
				System.out.println("SQL");
			}
			break;
			case "friday" : 
			{
				System.out.println("SQL");
			}
			break;
			
			case "Saturday" :
			{
				System.out.println("Practice of Programming");
			}
			break;
			case "saturday" : 
			{
				System.out.println("Practice of Programming");
			}
			break;
			
			case "Sunday" :
			{
				System.out.println("Revision of all the subject");
			}
			break;
			case "sunday" :
			{
				System.out.println("Revision of all the subject");
			}
			break;
			
			default :
			{
				System.out.println("Enter a valid day");
			}
			
		}
	}
}
