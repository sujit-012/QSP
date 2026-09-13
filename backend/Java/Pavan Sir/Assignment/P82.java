class P82 
{
	public static void main(String[] args) 
	{
		int a = 5, b = 2, c = 3;
		int x = a+b*c-a%b;
		int y =(a+b)*c-a%b;
		int z = a + b*(c-a)%b;
		System.out.println(x + " " + y + " " + z);
	}
}
