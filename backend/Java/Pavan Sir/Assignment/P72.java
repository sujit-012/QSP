class P72 
{
	public static void main(String[] args) 
	{
		int a = 6, b = 9, c = 12;
		boolean x = a<b && b<c || a == c;
		boolean y = !(a > b) && (c%b == 3);
		System.out.println(x+ " " + y);
	}
}
