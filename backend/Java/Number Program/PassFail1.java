import java.util.Scanner;
class PassFail1 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a Mark : ");
		int mark = sc.nextInt();
		
		if(mark > 35)
		{
			System.out.println("Student is Pass");
		}
		else
		{
			System.out.println("Student is fail");
		}
	}
}
