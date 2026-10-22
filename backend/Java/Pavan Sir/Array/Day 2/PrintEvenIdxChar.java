class PrintEvenIdxChar 
{
	public static void main(String[] args) 
	{
		char[] ch = {'A', 'b', '@', 'E', 'm', '#', 'u', 'P', '7'};
		printEvenIdx(ch);
	}
	
	public static void printEvenIdx(char [] c)
	{
		for(int i = 0; i < c.length; i++)
		{
			if(i % 2 == 0)
			{
				System.out.println(c[i]);
			}
		}
	}
}
