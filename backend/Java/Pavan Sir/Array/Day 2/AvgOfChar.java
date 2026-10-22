class AvgOfChar 
{
	public static void main(String[] args) 
	{
		char[] ch = {'M', 'N', 'O'};
		System.out.println(avgOfChar(ch));
	}
	
	public static double avgOfChar(char [] c)
	{
		int sum = 0;
		for(int i = 0; i < c.length; i++)
		{
			sum += c[i];
		}
		
		return sum/c.length;
	}
}
