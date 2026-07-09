class Inc 
{
	public static void main(String[] args) 
	{
		//int a = 7;
		//int b = 6;
		//int c = 5;
		//int d = 9;
		
		//boolean e = ((a++ - --c < c + d++ || ++d + c++ > --d + d--) && (--d + --c < d-- - --c || --b + ++a > --b - --a));
		
		int a = 99;
		int b = 79;
		int c = 17;
		int d = 56;
		
		boolean e = ((a++ - c-- > b++ + c++ && c-- + d + b-- < b + d++ + --c) || (c++ - c-- > ++d + a-- + --d));
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
	}
}
