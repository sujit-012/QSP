class StorePelindrome 
{
	public static void main(String[] args) 
	{
		int [] a = {111, 58669, 876923, 5225, 121};
		int [] pelindrome = storePelindrome(a);
		
		for(int i = 0; i < pelindrome.length; i++)
		{
			System.out.println(pelindrome[i]);
		}
	}
	
	public static int[] storePelindrome(int [] n)
	{
		int size = countOfPelindrome(n);
		int [] pelindrome = new int[size];
		
		int index = 0;
		
		for(int i = 0; i < n.length; i++)
		{
			if(isPelindrome(n[i]))
			{
				pelindrome[index] = n[i];
				index++;
			}
		}
		
		return pelindrome;
	}
	
	public static int countOfPelindrome(int [] n)
	{
		int count = 0;
		for(int i = 0; i < n.length; i++)
		{
			if(isPelindrome(n[i]))
			{
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
		
		return rev == temp;
	}
	
}
