class IndexOfFirstDuplicateElement 
{
	public static void main(String[] args) 
	{
		int[] a = {5, 2, 8, 2, 5, 9, 3, 9, 4};
		System.out.println(idxOfFirstDup(a));
	}
	
	public static int idxOfFirstDup(int [] n)
	{
		for(int i = 0; i < n.length; i++)
		{
			for(int j = i + 1; j < n.length; j++)
			{
				if(n[i] == n[j])
				{
					return i;
				}
			}
		}
		
		return -1;
	}
}
