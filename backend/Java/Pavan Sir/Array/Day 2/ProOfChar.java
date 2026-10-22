class ProOfChar 
{
	public static void main(String[] args) 
	{
		char[] ch = {'A', 'B', 'C'};
		System.out.println(proOfChar(ch));
	}
	
	public static int proOfChar(char [] c)
	{
		int pro = 1;
		for(int i = 0; i < c.length; i++)
		{
			pro *= c[i];
		}
		
		return pro;
	}
}
