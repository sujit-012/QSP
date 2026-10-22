class PrintUpperCase 
{
	public static void main(String[] args) 
	{
		char[] ch = {'A', 'b', 'e', '#', 'I', 'm', 'o', 'P', 'u', '7'};
		printUpperCase(ch);
	}
	
	public static void printUpperCase(char [] c)
	{
		for(int i = 0; i < c.length; i++)
		{
			if(c[i] >= 'A' && c[i] <= 'Z')
			{
				System.out.println(c[i]);
			}
		}
	}
}
