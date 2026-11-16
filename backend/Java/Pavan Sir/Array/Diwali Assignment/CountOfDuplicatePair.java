class CountOfDuplicatePair 
{
	public static void main(String[] args) 
	{
		int [] a = {10, 20, 20, 30};
		System.out.println(ctOfDupPair(a));
	}
	
	public static int ctOfDupPair(int [] n)
	{
		int count1 = 0;
		
		for(int i = 0; i < n.length  - 1; i++)
		{
			int count = 1;
			int pro = n[i] * n[i + 1];
			
			for(int j = i + 2; j < n.length; j++)
			{
				if((n[i] * n[j]) == pro)
				{
					count++;
				}
			}
			
			if(count > 1)
			{
				count1++;
			}
		}
		
		return count1;
	}
}
