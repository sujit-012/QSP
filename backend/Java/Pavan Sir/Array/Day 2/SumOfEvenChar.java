class SumOfEvenChar 
{
	public static void main(String[] args) 
	{
		char[] ch = {'B', 'c', 'D', 'e'};
		System.out.println(sumOfEvenChar(ch));
	}
	
	public static int sumOfEvenChar(char [] c)
	{
		int sum = 0;
		for(int i = 0; i < c.length; i++)
		{
			if(c[i] % 2 == 0)
			{
				sum += c[i];
			}
		}
		
		return sum;
	}
}
