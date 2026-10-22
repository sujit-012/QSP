class StorePerfectNum
{
	public static void main(String[] args) 
	{
		int [] a = {12, 6, 17, 28, 11, 496, 1};
		int [] n = storePerfect(a);
		
		for(int i = 0; i < n.length; i++)
		{
			System.out.println(n[i]);
		}
	}
	
	public static int[] storePerfect(int [] n)
	{
		int size = countOfPerfectNum(n);
		int [] perfect = new int[size];
		int index = 0;
		
		for(int i = 0; i < n.length; i++)
		{
			if(isPerfect(n[i]))
			{
				perfect[index] = n[i];
				index++;
			}
		}
		
		return perfect;
	}
	
	public static int countOfPerfectNum(int [] n)
	{
		int count = 0;
		for(int i = 0; i < n.length; i++)
		{
			if(isPerfect(n[i]))
			{
				count++;
			}
		}
		
		return count;
	}
	
	public static boolean isPerfect(int num)
	{
		int sum = 0;
		
		for(int i = 1;  i <= num/2; i++)
		{
			if(num % i == 0)
			{ 
				sum += i;
			}
		}
		
		return sum == num;
	}
}
