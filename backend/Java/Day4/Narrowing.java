class Narrowing
{
	public static void main(String[] args) 
	{
		int a = (int) 200000000000000l;
		System.out.println(a);
		
		short b = (short) 200000000000000l;
		System.out.println(b);
		
		byte c = (byte) 200000000000000l;
		System.out.println(c);
		
		char d = (char) 200000000000000l;
		System.out.println(d);
	}
}
