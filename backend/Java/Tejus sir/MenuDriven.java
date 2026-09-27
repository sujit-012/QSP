import java.util.Scanner;
class MenuDriven 
{
	static int temp;
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = sc.nextInt();
		temp = num;
		
		while(true)
		{
			System.out.println();
			System.out.println("Select a option \n1.Prime \n2.Palindrome \n3.Armstrong \n4.Strong \n5.Perfect \n6.Neon \n7.Automorphic \n8.Reverse \n9.Digit Sum \n10.Largest Digit \n11.Smallest Digit \n12.Exit");
			int num1 = sc.nextInt();
			System.out.println();
			
			if(num1 == 12) break;
			
			switch(num1)
			{
				case 1 :
				{
					System.out.println(isPrime(num1, 2));
					break;
				}
				
				case 2 :
				{
					System.out.println(isPalindrome(num1, 0));
					break;
				}
				
				case 3 :
				{
					System.out.println(isArmstrong(num1, count(num1, 0), 0));
					break;
				}
				default :
				{
					System.out.println("Enter a valid number " );
				}
			}
		}
		
		System.out.println("Thank you for using our software");
	}
	
	
	//1
	public static boolean isPrime(int num, int den)
	{
		if(num <= 1) return false;
		else if(num == den) return true;
		else if(num % den == 0) return false;
		
		return isPrime(num, den+1);
	}
	
	
	//2
	public static boolean isPalindrome(int num, int rev)
	{
		if(num == 0) return rev == temp;
		
		return isPalindrome(num /= 10, rev * 10 + num % 10);
	}
	
	public static int count(int num, int ct)
	{
		if(num == 0) return ct;
		
		return count(num / 10, ct+1);
	}
	
	public static int power(int num, int po, int ans)
	{
		if(po == 0) return ans;
		
		return power(num, po-1, ans*num);
	}
	
	//3
	public static boolean isArmstrong(int num, int count, int sum)
	{
		if(num == 0) return sum == temp;
		
		int pow = power(num%10, count, 1);
		
		return isArmstrong(num/10, count, sum + pow);
	}
	
	//4
	public static boolean isStrong(int num, int sum)
	{
		if(num == 0) return sum == temp;
		int fact = fact(num%10);
		return isStrong(num/10, sum + fact);
	}
	
	public static int fact(int num)
	{
		if(num == 0 || num == 1) return num;
		
		return num * fact(num - 1);
	}
	
	
	//5
	public static int isPerfect(int num, int sum, int i)
	{
		if(i > num/2) return sum == temp;
		
		if(num % i == 0) sum = sum + i;
		
		return isPerfect(num, sum, i+1);
	}
	
	//6
	public static boolean isNeon(int sq, int sum)
	{
		if(sq == 0) return sum == temp;
		
		return isNeon(sq/10, sum + num % 10);
	}
	
	
	//7
	public static boolean isAutomorphic(int num, int sq, int den)
	{
		
}
