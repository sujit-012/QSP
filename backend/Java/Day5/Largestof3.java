class Largestof3 
{
	public static void main(String[] args) 
	{
		int n1 = 100;
		int n2 = 20;
		int n3 = 90;
		
		int large = (n1 > n2) ? n1 : n2;
		
		int res = (n3 > large) ? n3 : large;
		
		System.out.println(res);
		
		int res2 = (n1 > n2) ? ((n1 > n3) ? n1 : n3) : ((n2 > n3) ? n2 : n3);
		System.out.println(res2);
		
		int res3 = (n1 > ( (n2 > n3) ? n2 : n3)) ? n1 : ((n2 > n3) ? n2 : n3);
		System.out.println(res3);
		
		int large = 0;
		int res4 = (n1 > large = ( (n2 > n3) ? n2 : n3)) ? n1 : large;
		System.out.println(res3);
	}
}
