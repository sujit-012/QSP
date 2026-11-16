class FirstDuplicateElement 
{
	public static void main(String[] args) 
	{
		int[] nums = {5, 2, 8, 2, 5, 9, 3, 9, 4};
		System.out.println(printFirstDuplicate(nums));
	}
	
	public static int printFirstDuplicate(int [] n)
	{
		for(int i = 0; i < n.length; i++)
		{
			for(int j = i + 1; j < n.length; j++)
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
