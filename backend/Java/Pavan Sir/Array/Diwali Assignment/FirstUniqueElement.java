class FirstUniqueElement 
{
	public static void main(String[] args) 
	{
		int[] a = {5, 2, 8, 2, 5, 9, 3, 9, 4};
		System.out.println(printFirstUnique(a));
	}
	
	public static int printFirstUnique(int [] n)
	{
		for(int i = 0; i < n.length; i++)
		{
			int count = 1;
			
			for(int j = i + 1; j < n.length; j++)
			{
				if(n[i] == n[j])
				{
					count++;
				}
			}
			
			if(count == 1)
			{
				return n[i];
			}
		}
		
		return -1;
	}
}
