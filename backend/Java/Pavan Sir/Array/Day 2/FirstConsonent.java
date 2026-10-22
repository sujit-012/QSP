class FirstConsonent
 
{
	public static void main(String[] args) 
	{
		char[] ch = {'@', '3', 'A', 'k', 'e', 'M'};
		firstConsonent(ch);
	}
	
	public static void firstConsonent(char [] c)
	{
		for(int i = 0; i < c.length; i++)
		{
			if(!(c[i] == 'A' || c[i] == 'a' ||
				c[i] == 'E' || c[i] == 'e' ||
				c[i] == 'I' || c[i] == 'i' ||
				c[i] == 'O' || c[i] == 'o' ||
				c[i] == 'U' || c[i] == 'u') && ((c[i] >= 'A' && c[i] <= 'Z') || (c[i] >= 'a' && c[i] <= 'z') ))
			{
				System.out.println(c[i]);
				break;
			}
		}
	}
}
