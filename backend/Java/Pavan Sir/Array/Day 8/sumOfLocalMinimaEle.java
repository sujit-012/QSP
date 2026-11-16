class sumOfLocalMinimaEle 
{
	public static void main(String[] args) 
	{
		int [] a = {10, 20, 5, 30, 25, 30, 40};
		System.out.println(sumLocalMinimaEle(a));
	}
	
	public static int sumLocalMinimaEle(int [] n)
	{
		int sum = 0;
		
		for(int i = 1; i < n.length - 1; i++)
		{
			if(n[i] < n[i - 1] && n[i] < n[i + 1])
			{
				sum += n[i];
			}
		}
		
		return sum;
	}
}
