class LastLowerCase 
{
	public static void main(String[] args) 
	{
		char[] ch = {'A', 'b', 'M', 'n', 'P', 'z'};
		lastUpperCase(ch);
	}
	
	public static void lastUpperCase(char [] c)
	{
		for(int i = c.length - 1; i >= 0; i--)
		{
			if(c[i] >= 'a' && c[i] <= 'z')
			{
				System.out.println(c[i]);
				break;
			}
		}
	}
}
