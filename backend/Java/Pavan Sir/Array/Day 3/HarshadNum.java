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
		for(int i = 0; i < n.length; i++)
		{
			if(isHarshad(n[i]))
			{
				System.out.println(n[i]);
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
