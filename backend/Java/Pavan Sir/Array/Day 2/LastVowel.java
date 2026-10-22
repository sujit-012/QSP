class LastVowel
 
{
	public static void main(String[] args) 
	{
		char[] ch = {'A', 'k', 'e', 'M', 'o', '#'};
		LastVowel(ch);
	}
	
	public static void LastVowel(char [] c)
	{
		for(int i = c.length - 1; i >= 0; i--)
		{
			if(c[i] == 'A' || c[i] == 'a' ||
				c[i] == 'E' || c[i] == 'e' ||
				c[i] == 'I' || c[i] == 'i' ||
				c[i] == 'O' || c[i] == 'o' ||
				c[i] == 'U' || c[i] == 'u' )
			{
				System.out.println(c[i]);
				break;
			}
		}
	}
}
