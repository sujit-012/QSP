class PrintEven 
{
	public static void main(String[] args) 
	{
		int [] a = {10, 20, 11, 27, 30, 41};
		printEven(a);
	}
	
	public static void printEven(int [] num)
	{
		for(int i = 0; i < num.length; i++)
		{
			if(num[i] % 2 == 0)
			{
				System.out.println(num[i]);
			}
		}
	}
}
