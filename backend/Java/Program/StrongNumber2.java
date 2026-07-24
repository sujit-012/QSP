import java.util.Scanner;
class StrongNumber2 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num = sc.nextInt();
		
		int sum = 0;;
		
		int temp = num;
		
		while(temp != 0)
		{
			int dig = temp % 10;
			
			int res = fact(dig);
			
			sum = sum + res;
			
			temp = temp / 10;
		}
		
		if(sum == num)
		{
			System.out.println("Strong Number");
		}
		else
		{
			System.out.println("Not a Strong Number");
		}
	}
	
	public static int fact(int num)
	{
		int pro = 1;
		
		for(int i = 1; i <= num; i++)
		{
			pro = pro * i;
		}
		
		return pro;
	}
}
