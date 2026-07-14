import java.util.Scanner;
class PassFail 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a Mark : ");
		int mark = sc.nextInt();
		
		if(mark < 0 && mark > 100)
		{
			System.out.println("Enter a valid marks!");
		}
		else if(mark >= 0 && mark < 35)
		{
			System.out.println("You Fail");
		}
		else if(mark >= 35 && mark < 50)
		{
			System.out.println("You just Pass ");
		}
		else if(mark >= 50 && mark < 60)
		{
			System.out.println("You Pass with the Second class");
		}
		else if (mark >= 60 && mark < 75)
		{
			System.out.println("You pass with the first class");
		}
		else if (mark >= 75 && mark < 90)
		{
			System.out.println("You pass with first class and distinction");
		}
		else
		{
			System.out.println("You pass with distinction");
		}
	}
}
