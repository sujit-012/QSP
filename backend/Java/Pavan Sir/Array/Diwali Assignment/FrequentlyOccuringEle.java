class FrequentlyOccuringEle 
{
	public static void main(String[] args) 
	{
		int[] a = {1, 2, 72, 2, 67, 3, 2, 4, 1098, 3, 1098, 3289, 38, 438};
		System.out.println(frequentlyOccur(a));
	}
	
	public static int frequentlyOccur(int [] n)
	{
		boolean[] visited = new boolean[n.length];
		int maxCount = Integer.MIN_VALUE;
		int maxValue = 0;
		
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
			
			if(count > maxCount)
			{
				maxCount = count;
				maxValue = n[i];
			}
		}
		
		return maxValue;
	}
}
