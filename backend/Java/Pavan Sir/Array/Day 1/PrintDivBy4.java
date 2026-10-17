class PrintDivBy4 
{
	public static void main(String[] args) 
	{
		int [] a = {5, 12, 7, 145, 99, 3, 456};
		printDivBy4(a);
	}
	
	public static void printDivBy4(int num[])
	{
		for(int i = 0; i < num.length; i++)
		{
			if(num[i] % 4 == 0)
			{
				System.out.println(num[i]);
			}
		}
	}
}
