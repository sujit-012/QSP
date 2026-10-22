class StoreTechNum 
{
	public static void main(String[] args) 
	{
		int [] a = {2894, 2025, 986, 3025, 81, 639};
		int [] n = storeTechNum(a);
		
		for(int i = 0; i < n.length; i++)
		{
			System.out.println(n[i]);
		}
	}
	
	public static int[] storeTechNum(int []n)
	{
		int size = countOfTechNum(n);
		int [] tech = new int[size];
		int index = 0;
		
		for(int i = 0; i < n.length; i++)
		{
			if(isTechNum(n[i]))
			{
				tech[index] = n[i];
				index++;
			}
		}
		
		return tech;
	}
	
	public static int countOfTechNum(int [] n)
	{
		int count = 0;
		for(int i = 0; i < n.length; i++)
		{
			if(isTechNum(n[i]))
			{
				count++;
			}
		}
		return count;
	}
	
	public static boolean isTechNum(int num)
	{
		int count = count(num);
		
		if(count % 2 == 0)
		{
			int div = div(count/2);
			int num1  = (num / div) + (num % div);
			return (num1 * num1) == num;
		}
		
		return false;
	}
	
	public static int count(int num)
	{
		int count = 0;
		while(num > 0)
		{
			count++;
			num /= 10;
		}
		return count;
	}
	
	public static int div(int dig)
	{
		int ans = 1;
		while(dig > 0)
		{
			ans *= 10;
			dig--;
		}
		return ans;
	}
}
