class SumOfEvenIndex 
{
	public static void main(String[] args) 
	{ 
		int [] a = {10, 20, 30, 40, 50};
	    System.out.println(sumOfEvenIndex(a));
	}
	
	public static int sumOfEvenIndex(int [] num)
	{
		int sum = 0;
		
		for(int i = 0; i < num.length; i++)
		{
			if(i % 2 == 0)
			{
				sum = sum + num[i];
			}
		}
		return sum;
	}
}
