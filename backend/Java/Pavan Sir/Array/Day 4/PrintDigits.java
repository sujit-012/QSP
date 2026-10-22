class PrintDigits 
{
	public static void main(String[] args) 
	{
		char[] ch = {'A', '7', '@', 'b', '#', '9', '$', '3', 'M'};
		printDigit(ch);
	}
	
	public static void printDigit(char [] ch)
	{
		for(char c : ch)
		{
			if(c >= '0' && c <= '9')
			{
				System.out.println(c);
			}
		}
	}
}
