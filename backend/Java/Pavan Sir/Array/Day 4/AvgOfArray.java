class AvgOfArr 
{
	public static void main(String[] args) 
	{
		int a[] = {10, 20, 30, 40, 50};
		System.out.println(avgOfArr(a));
	}
	
	public static double avgOfArr(int num[])
	{
		int sum = 0;
		for(int a : num) sum += a;
		
		return sum/num.length;
	}
}
