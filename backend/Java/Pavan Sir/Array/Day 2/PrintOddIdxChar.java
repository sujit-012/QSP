class PrintOddIdxChar 
{
	public static void main(String[] args) 
	{
		char[] ch = {'A', 'b', '@', 'E', 'm', '#', 'u', 'P', '7'};
		printOddIdx(ch);
	}
	
	public static void printOddIdx(char [] c)
	{
		for(int i = 0; i < c.length; i++)
		{
			if(i % 2 != 0)
			{
				System.out.println(c[i]);
			}
		}
	}
}
