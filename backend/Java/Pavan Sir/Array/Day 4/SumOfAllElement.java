class SumOfAllElement 
{
	public static void main(String[] args) 
	{
		int [] a = {10, 20, 30, 40, 50};
		System.out.println(sumOfAllElement(a));
	}
	
	public static int sumOfAllElement(int [] num)
	{
		int sum = 0;
		for(int a : num) sum = sum + a;
		return sum;
	}
}
