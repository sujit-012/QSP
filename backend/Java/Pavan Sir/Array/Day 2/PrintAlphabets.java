class PrintAlphabets 
{
	public static void main(String[] args) 
	{
		char [] c = {'A', 'b', 'e', '#', 'I', '@', 'm', 'o', 'P', '$', 'u', '7'};
		printAlphabets(c);
	}
	
	public static void printAlphabets(char [] c)
	{
		for(int i = 0; i < c.length; i++)
		{
			if((c[i] >= 'A' && c[i] <= 'Z') || (c[i] >= 'a' && c[i] <= 'z'))
			{
				System.out.println(c[i]);
			}
		}
	}
}
