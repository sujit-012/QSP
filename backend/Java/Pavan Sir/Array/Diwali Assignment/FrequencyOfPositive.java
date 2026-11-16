class FrequencyOfPositive 
{
	public static void main(String[] args) 
	{
		int [] a = {92, -19, -33, 56, -93, 37, -9};
		System.out.println(frequencyOfPositive(a));
	}
	
	public static int frequencyOfPositive(int [] n)
	{
		int count = 0;
		
		for(int i = 0; i < n.length; i++)
		{
			if(n[i] > 0)
			{
				count++;
			}
		}
		
		return count;
	}
}
