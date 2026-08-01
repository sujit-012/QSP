class CountOfLeapWhile 
{
	public static void main(String[] args) 
	{
		int year = 2000;
		int count = 0;
		
		while(year <= 3000)
		{
			if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
			{
				count++;
			}
			year++;
		}
		
		System.out.println("Total number of leap year from 2000 to 3000 is " + count);
	}
}
