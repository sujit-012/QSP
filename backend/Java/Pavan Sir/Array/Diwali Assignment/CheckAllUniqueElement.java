class CheckAllUniqueElement 
{
	public static void main(String[] args) 
	{
		int[] a = {1, 72, 2, 67, 3, 4, 1098, 3289, 38, 438};
		System.out.println(isUnique(a));
	}
	
	public static boolean isUnique(int [] n)
	{
		for(int i = 0; i < n.length; i++)
		{
			for(int j = i + 1; j < n.length; j++)
			{
				if(n[i] == n[j])
				{
					return false;
				}
			}
		}
		
		return true;
	}
}
