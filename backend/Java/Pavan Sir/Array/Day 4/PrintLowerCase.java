class PrintLowerCase 
{
	public static void main(String[] args) 
	{
		char[] ch = {'A', 'b', 'e', '#', 'I', 'm', 'o', 'P', 'u', '7'};
		printLowerCase(ch);
	}
	
	public static void printLowerCase(char [] ch)
	{
		for(char c : ch)
		{
			if(c >= 'a' && c <= 'z')
			{
				System.out.println(c);
			}
		}
	}
}
