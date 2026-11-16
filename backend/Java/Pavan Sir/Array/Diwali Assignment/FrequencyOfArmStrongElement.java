class FrequencyOfArmStrongElement 
{
	public static void main(String[] args) 
	{
	    int[] a = {18, 36, 371, 153, 38, 47, 370, 89867};
		System.out.println(freqOfArmStrong(a));
	}
	
	public static int freqOfArmStrong(int [] n)
	{
		int count = 0;
		
		for(int i = 0; i < n.length; i++)
		{
			if(isArmStrong(n[i]))
			{
				count++;
			}
		}
		
		return count;
	}
	
	public static boolean isArmStrong(int num)
	{
		int count = count(num);
		int sum = 0;
		
		for(int i = num; i > 0; i /= 10)
		{
			sum += pow(i%10, count);
		}
		
		return sum == num;
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
	
	public static int pow(int base, int pow)
	{
		int ans = 1;
		
		while(pow > 0)
		{
			ans *= base;
			pow--;
		}
		
		return ans;
	}
}
