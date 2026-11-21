package interfaces;

public interface NumberPrograms {
	
	double pi = 22.0 / 7.0;
	
	void areaOfCircle(int rad);
	
	void perimeterOfCircle(int num);
	
	static boolean isPrime(int num)
	{
		if(num <= 1)
		{
			return false;
		}
		
		for(int i = 2; i <= num/2; i++)
		{
			if(num % i == 0)
			{
				return false;
			}
		}
		
		return true;
	}
	
	boolean isArmstrong(int num);
	
	void squarePattern(int n);
	
	boolean twistedPrime(int num);
	
	boolean isPalindrome(int num);
	
	static int reverse(int num)
	{
		int rev = 0;
		
		while(num > 0)
		{
			rev = rev * 10 + num % 10;
			num /= 10;
		}
		
		return rev;
	}
	
}
