class HarshadNum 
{
	public static void main(String[] args) 
	{
		int [] a = {18, 23, 81, 39};
		System.out.println(countHarshad(a));
	}
	
	public static int countHarshad(int [] n)
	{
		int count = 0;
		for(int a : n)
		{
			if(isHarshad(a))
			{
				System.out.println(a);
				count++;
			}
		}
		return count;
	}
	
	public static boolean isHarshad(int num)
	{
		int sum = 0;
		int temp = num;
		
		while(num > 0)
		{
			sum += num%10;
			num /= 10;
		}
		
		return temp%sum == 0;
	}
}
