class Factors 
{
	public static void main(String[] args) 
	{
		factors(6, 1);
	}
	
	
	public static void factors(int num, int i)
	{
		if(i > num) return;
		
		if(num %  i == 0) System.out.println(i);
		
		factors(num, i+1);
	}
}
