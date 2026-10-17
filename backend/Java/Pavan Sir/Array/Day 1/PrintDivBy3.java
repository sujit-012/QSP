class PrintDivBy3 
{
	public static void main(String[] args) 
	{
		int [] a = {5, 12, 7, 145, 99, 3, 456};
		printDivBy3(a);
	}
	
	public static void printDivBy3(int num[])
	{
		for(int i = 0; i < num.length; i++)
		{
			if(num[i] % 3 == 0)
			{
				System.out.println(num[i]);
			}
		}
	}
}
