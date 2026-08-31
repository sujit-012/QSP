import java.util.Scanner;
class ArmStrong 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num = sc.nextInt();
		
		int count = 0;
		for(int i = num; i > 0; i /= 10)
		{
			count++;
		}
		
		int sum = 0;
		
		for(int i = num; i > 0; i /= 10)
		{
			int dig = i % 10;
			int pow = 1;
			
			for(int j = 1; j <= count; j++)
			{
				pow *= dig;
			}
			
			sum += pow;
		}
		
		if(sum == num) System.out.println("ArmStrong Number");
		else System.out.println("Not ArmStrong Number");
	}
}
