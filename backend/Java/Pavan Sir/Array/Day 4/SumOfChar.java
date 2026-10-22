class SumOfChar 
{
	public static void main(String[] args) 
	{
		char[] ch = {'J', 'a', 'v', 'a'};
		System.out.println(sumOfChar(ch));
	}
	
	public static int sumOfChar(char [] ch)
	{
		int sum = 0;
		for(char c : ch)
		{
			sum += c;
		}
		return sum;
	}
}
