class StoreArmStrongNum 
{
	public static void main(String[] args) 
	{
		int [] a = {98, 153, 79, 370, 99, 34, 371};
		int [] n = storeArmStrong(a);
		
		for(int i = 0; i < n.length; i++)
		{
			System.out.println(n[i]);
		}
	}
	
	public static int[] storeArmStrong(int [] n)
	{
		int size = countOfArmStrongNum(n);
		int [] armStrong = new int[size];
		int index = 0;
		
		for(int i = 0; i < n.length; i++)
		{
			if(isArmStrong(n[i]))
			{
				armStrong[index] =n[i];
				index++;
			}
		}
		
		return armStrong;
	}
	
	public static int countOfArmStrongNum(int [] a)
	{
		int count = 0;
		for(int i = 0; i < a.length; i++)
		{
			if(isArmStrong(a[i]))
			{
				count++;
			}
		}
		return count;
	}
	
	public static boolean isArmStrong(int num)
	{
		int count = ctOfDig(num);
		int temp = num;
		int sum = 0;
		
		while(num > 0)
		{
			sum += power(num%10, count);
			num /= 10;
		}
		
		return temp == sum;
	}
	
	public static int ctOfDig(int num)
	{
		int count = 0;
		while(num > 0)
		{
			count++;
			num /= 10;
		}
		return count;
	}
	
	public static int power(int base, int pw)
	{
		int ans = 1;
		for(int i = 1; i <= pw; i++)
		{
			ans *= base;
		}
		return ans;
	}
}
