class VowelCharIdx 
{
	public static void main(String[] args) 
	{
		char[] ch = {'A', 'b', '@', 'E', 'm', '#', 'u', 'P', '7'};
		vowelCharIdx(ch);
	}
	
	public static void vowelCharIdx(char [] c)
	{
		for(int i = 0; i < c.length; i++)
		{
			if(c[i] == 'A' || c[i] == 'a' || c[i] == 'E' || c[i] == 'e' || c[i] == 'I' || c[i] == 'i' ||
				c[i] == 'O' || c[i] == 'o' || c[i] == 'U' || c[i] == 'u')
			{
					System.out.println(i);
			}
		}
	}
}
