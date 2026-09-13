class P80 
{
	public static void main(String[] args) 
	{
		byte a = 120;
		int b = a + 10;
		short c = (short)(b*300);
		char d = (char) c;
		byte e = d+(byte)c;
		System.out.println(b + " " + c + " " + d + " " + e);
	}
}
