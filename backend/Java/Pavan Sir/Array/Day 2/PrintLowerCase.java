class PrintLowerCase 
{
	public static void main(String[] args) 
	{
		char[] ch = {'A', 'b', 'e', '#', 'I', 'm', 'o', 'P', 'u', '7'};
		printLowerCase(ch);
	}
	
	public static void printLowerCase(char [] c)
	{
		for(int i = 0; i < c.length; i++)
		{
			if(c[i] >= 'a' && c[i] <= 'z')
			{
				System.out.println(c[i]);
			}
		}
	}
}
