import java.util.Scanner;
class PronicNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num = sc.nextInt();
		
		for(int i = 1; i*(i+1) <= num; i++)
		{
			if(i*(i+1) == num)
			{
				System.out.println("Number is a Pronic Number");
				return;
			}
		}
		
		System.out.println("Number is not a Pronic Number");
	}
}
