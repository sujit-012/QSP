class FrequencyOfZero 
{
	public static void main(String[] args) 
	{
		int [] a = {92, 0, 0, 56, 0, 37, 0};
		System.out.println(frequencyOfZero(a));
	}
	
	public static int frequencyOfZero(int [] n)
	{
		int count = 0;
		
		for(int i = 0; i < n.length; i++)
		{
			if(n[i] == 0)
			{
				count++;
			}
		}
		
		return count;
	}
}
