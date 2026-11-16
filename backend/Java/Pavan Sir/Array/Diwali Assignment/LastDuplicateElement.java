class LastDuplicateElement 
{
	public static void main(String[] args) 
	{
		int[] a = {5, 2, 8, 2, 5, 9, 3, 9, 4};
		System.out.println(printLastDup(a));
	}
	
	public static int printLastDup(int [] n)
	{
		for(int i = n.length - 1; i >= 0; i--)
		{
			for(int j = i - 1; j >= 0; j--)
			{
				if(n[i] == n[j])
				{
					return n[i];
				}
			}
		}
		
		return -1;
	}
}
