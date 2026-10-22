class LastSpecialChar 
{
	public static void main(String[] args) 
	{
		char[] ch = {'A', '7', '$', 'm', '#'};
		lastSpecialChar(ch);
	}
	
	public static void lastSpecialChar(char [] c)
	{
		for(int i = c.length - 1; i >= 0; i--)
		{
			if(!((c[i] >= 'A' && c[i] <= 'Z') || (c[i] >= 'a' && c[i] <= 'z') || (c[i] >= '0' && c[i] <= '9')))
			{
				System.out.println(c[i]);
				break;
			}
		}
	}
}
