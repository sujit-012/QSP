class LastUpperCase 
{
	public static void main(String[] args) 
	{
		char[] ch = {'A', 'b', 'M', '7', 'P', 'e'};
		lastUpperCase(ch);
	}
	
	public static void lastUpperCase(char [] c)
	{
		for(int i = c.length - 1; i >= 0; i--)
		{
			if(c[i] >= 'A' && c[i] <= 'Z')
			{
				System.out.println(c[i]);
				break;
			}
		}
	}
}
