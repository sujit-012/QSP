class PrintDigits 
{
	public static void main(String[] args) 
	{
		char[] ch = {'A', '7', '@', 'b', '#', '9', '$', '3', 'M'};
		printDigit(ch);
	}
	
	public static void printDigit(char [] c)
	{
		for(int i = 0; i < c.length; i++)
		{
			if(c[i] >= '0' && c[i] <= '9')
			{
				System.out.println(c[i]);
			}
		}
	}
}
