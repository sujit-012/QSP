import java.util.Scanner;
class PassFail2 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a Mark : ");
		int mark = sc.nextInt();
		
		String result = (mark > 35) ? "Student is Pass" : "Student is fail";
		
		System.out.println(result);
	}
}
