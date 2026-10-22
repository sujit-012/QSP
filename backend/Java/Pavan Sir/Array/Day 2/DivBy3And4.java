class DivBy3And4 
{
	public static void main(String[] args) 
	{
		int [] a = {10, 12, 36, 8, 16, 24};
		divBy3And4(a);
	}
	
	public static void divBy3And4(int [] num)
	{
		for(int i = 0; i < num.length; i++)
		{
			if(num[i] % 3 == 0 && num[i] % 4 == 0)
			{
				System.out.println(num[i]);
			}
		}
	}
}
