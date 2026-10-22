class PrintUpperCase 
{
	public static void main(String[] args) 
	{
		char[] ch = {'A', 'b', 'e', '#', 'I', 'm', 'o', 'P', 'u', '7'};
		printUpperCase(ch);
	}
	
	public static void printUpperCase(char [] ch)
	{
		for(char c : ch)
		{
			if(c >= 'A' && c <= 'Z')
			{
				System.out.println(c);
			}
		}
	}
}
