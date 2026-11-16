class ProOfLocalMaximaEle 
{
	public static void main(String[] args) 
	{
		int [] a = {10, 20, 5, 30, 25, 30, 40};
		System.out.println(proLocalMaximaEle(a));
	}
	
	public static int proLocalMaximaEle(int [] n)
	{
		int pro = 1;
		
		for(int i = 1; i < n.length - 1; i++)
		{
			if(n[i] > n[i - 1] && n[i] > n[i + 1])
			{
				pro *= n[i];
			}
		}
		
		return pro;
	}
}
