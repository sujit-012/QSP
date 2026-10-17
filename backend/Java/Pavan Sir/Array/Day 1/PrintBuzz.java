class PrintBuzz 
{
	public static void main(String[] args) 
	{
		int [] a = {14, 27, 35, 42, 50, 67, 89};
		printBuzz(a);
	}
	
	public static void printBuzz(int num[])
	{
		for(int i = 0; i < num.length; i++)
		{
			if(isBuzz(num[i]))
			{
				System.out.println(num[i]);
			}
		}
	}
	
	public static boolean isBuzz(int num)
	{
		return num%7 == 0 || num % 10 == 7;
	}
}
