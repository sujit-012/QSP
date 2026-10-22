class SumOfOddChar 
{
	public static void main(String[] args) 
	{
		char[] ch = {'A', 'b', 'C', 'd', 'E'};
		System.out.println(sumOfOddChar(ch));
	}
	
	public static int sumOfOddChar(char [] ch)
	{
		int sum = 0;
		for(char c : ch)
		{
			if(c % 2 != 0)
			{
				sum += c;
			}
		}
		
		return sum;
	}
}
