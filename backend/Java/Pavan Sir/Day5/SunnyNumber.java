import java.util.Scanner;
class SunnyNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num = sc.nextInt();
		num++;
		
		for(int i = 1; i*i <= num; i++)
		{
			if(i*i == num)
			{
				System.out.println("Number is a Sunny Number");
				return;
			}
		}
		
		System.out.println("Number is not a Sunny Number");
	}
}
