class SumOfOddChar 
{
	public static void main(String[] args) 
	{
		char[] ch = {'A', 'b', 'C', 'd', 'E'};
		System.out.println(sumOfOddChar(ch));
	}
	
	public static int sumOfOddChar(char [] c)
	{
		int sum = 0;
		for(int i = 0; i < c.length; i++)
		{
			if(c[i] % 2 != 0)
			{
				sum += c[i];
			}
		}
		
		return sum;
	}
}
