import java.util.Scanner;
class PelindromicZylum
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num = sc.nextInt();
		
		if(num < 0)
		{
			System.out.println("Number is not valid number");
		}
		else
		{
			boolean isPelindrome = false;
			boolean isZylum = false;
			boolean isPhylum = false;
			
			int ans = 0;
			
			for(int temp = num; temp != 0; temp /= 10)
			{
				ans = ans * 10 + temp % 10;
			}
			
			if(ans == num)
			{
				isPelindrome = true;
			}
			
			if(isPelindrome == true)
			{
				if(num > 99)
				{
					int sumOfMid = 0;
					int sumOfEnd = num % 10;
					num = num / 10;
					
					while(num > 9)
					{
						sumOfMid += num % 10;
						num = num / 10;
					}
					
					sumOfEnd += num;
					
					if(sumOfEnd == sumOfMid)
					{
						isZylum = true;
					}
					else
					{
						isPhylum = true;
					}
				}
				else
				{
					isPhylum = true;
				}
				
				if(isPelindrome == true && isZylum == true)
				{
					System.out.println("Number is pelindromic Zylum");
				}
				else if(isPelindrome == true && isPhylum == true)
				{
					System.out.println("Number is pelindromic Phelom");
				}				
				else
				{
					System.out.println("Number is not a pelindromic Zylum or not a pelindromic Phelom");
				}
			}
			else
			{
				System.out.println("Number is not a pelindromic Zylum or not a pelindromic Phelom");
			}
			
		}
	}
}
