class ProOfEvenChar 
{
	public static void main(String[] args) 
	{
		char[] ch = {'A', 'C', 'E'};
		System.out.println(proOfChar(ch));
	}
	
	public static int proOfChar(char [] c)
	{
		int pro = 1;
		for(int i = 0; i < c.length; i++)
		{
			if(c[i] % 2 == 0)
			{
			   pro *= c[i];
			}
		}
		
		return pro;
	}
}
