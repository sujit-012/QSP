class CountOfUnniqueElement 
{
	public static void main(String[] args) 
	{
		int[] a = {1, 2, 2, 3, 1, 4};
		System.out.println(countOfUnique(a));
	}
	
	public static int countOfUnique(int [] n)
	{
		boolean[] visited = new boolean[n.length];
		int count1 = 0;
		
		for(int i = 0; i < n.length; i++)
		{
			if(visited[i])
			{
				continue;
			}
			
			int count = 1;
			
			for(int j = i + 1; j < n.length; j++)
			{
				if(n[i] == n[j])
				{
					count++;
					visited[j] = true;
				}
			}
			
			if(count == 1)
			{
				count1++;
			}
		}
		
		return count1;
	}
}
