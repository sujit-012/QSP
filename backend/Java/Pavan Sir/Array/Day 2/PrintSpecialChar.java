class PrintSpecialChar 
{
	public static void main(String[] args) 
	{
		char[] ch = {'A', 'b', 'e', '#', 'I', '@', 'm', 'o', 'P', '$', 'u', '7'};
		printSpecialChar(ch);
	}
	
	public static void printSpecialChar(char [] c)
	{
		for(int i = 0; i < c.length; i++)
		{
			if(!((c[i] >= 'A' && c[i] <= 'Z') || (c[i] >= 'a' && c[i] <= 'z') || (c[i] >= '0' && c[i] <= '9')))
			{
				System.out.println(c[i]);
			}
		}
	}
}
