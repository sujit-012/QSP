class CountOfDitinctElement 
{
	public static void main(String[] args) 
	{
		int[] a = {1, 2, 2, 3, 1, 4, 1098, 3, 1098};
		System.out.println(countOfDistinctEle(a));
	}
	
	public static int countOfDistinctEle(int [] n)
	{
		boolean[] visited = new boolean[n.length];
		int count = 0; 
		
		for(int i = 0; i < n.length; i++)
		{
			if(visited[i])
			{
				continue;
			}
			
			for(int j = i + 1; j < n.length; j++)
			{
				if(n[i] == n[j])
				{
					visited[j] = true;
				}
			}
			
			count++;
		}
		
		return count;
	}
}
