class Smallestof4 
{
	public static void main(String[] args) 
	{
		int n1 = 100;
		int n2 = 300;
		int n3 = 40;
		int n4 = 50;
		
		int small1 = n1 < n2 ? n1 : n2;
		
		int small2 = n3 < small1 ? n3 : small1;
		
		int res = n4 < small2 ? n4 : small2;
		
		System.out.println(res);
		
		int res2 = (n1 < ((n2 < ((n3 < n4) ? n3 : n4)) ? n2 : ((n3 < n4) ? n3 : n4))) ? n1  : ((n2 < ((n3 < n4) ? n3 : n4)) ? n2 : ((n3 < n4) ? n3 : n4));
		System.out.println(res2);
		
		int res3 = (n1 < n2) ? ((n1 < ((n3 < n4) ? n3 : n4)) ? n1 : ((n3 < n4) ? n3 : n4)) : ((n2 < ((n3 < n4) ? n3 : n4)) ? n2 : ((n3 < n4) ? n3 : n4));

		System.out.println(res3);
	}
}
