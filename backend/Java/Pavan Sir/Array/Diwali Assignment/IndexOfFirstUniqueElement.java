class IndexOfFirstUniqueElement 
{
	public static void main(String[] args) 
	{
		int[] a = {5, 2, 8, 2, 5, 9, 3, 9, 4};
		System.out.println(idxOfFirstUni(a));
	}
	
	public static int idxOfFirstUni(int [] n)
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
				return i;
			}
		}
		
		return -1;
	}
}
