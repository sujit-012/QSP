package interfaces;

public class NumberProgramsImp implements NumberPrograms{
	
	public void areaOfCircle(int rad)
	{
		double area = pi * (rad * rad);
		System.out.println(area);
	}
	
	public void perimeterOfCircle(int rad)
	{
		double perimeter = 2 * pi * rad;
		System.out.println(perimeter);
	}
	
	public boolean isArmstrong(int num)
	{
		int count = count(num);
		int sum = 0;
		
		for(int i = num; i > 0; i /= 10)
		{
			sum += pow(i%10, count);
		}
		
		return sum == num;
	}
	
	private int count(int num)
	{
		int count = 0;
		
		while(num > 0)
		{
			count++;
			num /= 10;
		}
		
		return count;
	}
	
	private int pow(int base, int raise)
	{
		int ans = 1;
		
		while(raise > 0)
		{
			ans *= base;
			raise--;
		}
		
		return ans;
	}
	
	public void squarePattern(int n)
	{
		for(int i = 0; i < n; i++)
		{
			for(int j = 0; j < n; j++)
			{
				System.out.print("*" + " ");
			}
			System.out.println();
		}
	}
	
	public boolean twistedPrime(int num)
	{
		return NumberPrograms.isPrime(num) && NumberPrograms.isPrime(NumberPrograms.reverse(num));
	}
	
	public boolean isPalindrome(int num)
	{
		return num == NumberPrograms.reverse(num);
	}

}
