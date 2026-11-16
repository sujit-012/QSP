class FrequencyOfDuplicateElement 
{
	public static void main(String[] args) 
	{
		int[] a = {1, 2, 2, 3, 1, 4};
		printFrequencyOfDuplicateEle(a);
	}
	
	public static void printFrequencyOfDuplicateEle	(int [] n)
	{
		boolean[] visited = new boolean[n.length];
		
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
			
			if(count > 1)
			{
				System.out.println(n[i] + " ===> " + count);
			}
		}
	}
}
