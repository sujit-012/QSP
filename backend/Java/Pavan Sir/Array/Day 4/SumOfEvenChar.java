class SumOfEvenChar 
{
	public static void main(String[] args) 
	{
		char[] ch = {'B', 'c', 'D', 'e'};
		System.out.println(sumOfEvenChar(ch));
	}
	
	public static int sumOfEvenChar(char [] ch)
	{
		int sum = 0;
		for(char c : ch)
		{
			if(c % 2 == 0)
			{
				sum += c;
			}
		}
		
		return sum;
	}
}
