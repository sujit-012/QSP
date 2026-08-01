class CountOfLeapDoWhile 
{
	public static void main(String[] args) 
	{
		int year = 2000;
		int count = 0;
		
		do
		{
			if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
			{
				count++;
			}
			year++;
		}
		while (year <= 3000);
		
		System.out.println("Total Number of leap from 2000 to 3000 is " + count);
	}
}
