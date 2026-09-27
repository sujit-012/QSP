class FiboSeries 
{
	public static void main(String[] args) 
	{
		System.out.println(fibo(7));
	}
	
	public static int fibo(int num)
	{
		if(num == 0 || num == 1) return num;
		
		return fibo(num-1) + fibo(num-2);
	}
}
