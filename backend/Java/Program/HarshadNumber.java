import java.util.Scanner;
class HarshadNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number :");
		int num = sc.nextInt();
		
		int temp = num;
		
		int sum = 0;
		
		while(temp != 0)
		{
			sum = sum + (temp%10);
			temp = temp / 10;
		}
		
		if(num % sum == 0)
		{
			System.out.println("Number is a Harshad number ");
		}
		else
		{
			System.out.println("Number is not a harshad number ");
		}
	}
}
