import java.util.Scanner;
class TechNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num = sc.nextInt();
		
		int count = 0;
		
		for(int i = num; i != 0; i /= 10)
		{
			count++;
		}
		
		if(count % 2 == 0)
		{
			int dig = 1;
			
			for(int i = 0; i < count / 2; i++)
			{
				dig = dig * 10;
			}
			
			int num2 = num % dig;
			
			int temp = num;
			
			for(int i = 0; i < count / 2; i++)
			{
				temp = temp / 10;
			}
			
			if((temp + num2) * (temp + num2) == num)
			{
				System.out.println("Number is tech number ");
			}
			else
			{
				System.out.println("Number is not tech number ");
			}	
		}
		else
		{
			System.out.println("Number is not tech number ");
		}
	}
}
