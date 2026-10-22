class PelindromeNum 
{
	public static void main(String[] args) 
	{
		int [] a = {111, 58669, 876923, 5225, 121};
System.out.println(countOfPelindromeNum(a));
	}
	
	public static int countOfPelindromeNum(int [] n)
	{
		int count = 0;
		for(int i = 0; i < n.length; i++)
		{
			if(isPelindrome(n[i]))
			{
				System.out.println(n[i]);
				count++;
			}
		}
		return count;
	}
	
	public static boolean isPelindrome(int num)
	{
		int rev = 0;
		int temp = num;
		
		while(num > 0)
		{
			rev = rev * 10 + num % 10;
			num /= 10;
		}
		return temp == rev;
	}
}
